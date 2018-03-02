package com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiap.loja.bean.ProdutoTO;
import com.fiap.loja.bo.EstoqueBO;

import br.com.fiap.config.PropertySingleton;

public class TerminalConsulta {

	private static final Logger log = LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		log.warn("Startou");
		Scanner sc = new Scanner(System.in);
		// ler o código do produto
		Calendar hoje;
		int codigo;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		DecimalFormat df = new DecimalFormat("R$ #,###.00");
		EstoqueBO bo = new EstoqueBO();
		//Recupera os dados da configuração
		Properties prop = PropertySingleton.getInstance();
		log.debug("Adicionando properties");
		String nomeCompleto = prop.getProperty("nome") + " " +
				prop.getProperty("filial");
		do {
			hoje = Calendar.getInstance();
			System.out.println(nomeCompleto+"        " + sdf.format(hoje.getTime()));
			System.out.println("****************************Zero sair");
			System.out.print("Código do Produto: ");
			codigo = sc.nextInt();
			
			if (codigo == 0) {
				System.out.println("Tchau!");
				break;
			}
			
			ProdutoTO produto = bo.consultarProduto(codigo);
			if (produto != null) {
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + df.format(produto.getPreco()));
				System.out.println("Qtd: " + produto.getQuantidade());
			}else {
				System.out.println("Produto não cadastrado");
				log.error("Produto não cadastrado");
			}
			
		} while (codigo != 0);
		sc.close();
	}

}