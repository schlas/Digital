package com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EstoqueBO {
	private static final Logger log = LoggerFactory.getLogger(EstoqueBO.class);
	
	public static LojaTO consultarProduto(int codProduto) {		
		LojaTO loja = new LojaTO();
		Scanner sc = new Scanner(System.in);
		Calendar hoje;
		SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		DecimalFormat df = new DecimalFormat("R$ #,###.00");
		 switch(codProduto) {
		 case 401:
			//log.debug("Adicionando Produto 1");
			 loja.setMarca("Nike");
			 loja.setNome("Camiseta Masculina Preta Manga Curta");
			 loja.setPrecoUn(60);
			 loja.setQnt(5);
			 System.out.println(loja.getMarca()+ "  " + loja.getNome()+ "  " + 
					 			df.format(loja.getPrecoUn())+ "  " + loja.getQnt());
			 break;
		 case 402:
			 //log.debug("Adicionando Produto 2");
			 loja.setMarca("Enjoi");
			 loja.setNome("Camiseta Feminina Azul Manga Longa");
			 loja.setPrecoUn(50);
			 loja.setQnt(3);
			 System.out.println(loja.getMarca()+ "  " + loja.getNome()+ "  " + 
					 			df.format(loja.getPrecoUn())+ "  " + loja.getQnt());
			 break;
		 case 0:
			 //log.debug("Finalizando Consulta");
			 System.out.println("Tchau!");
			 break;
		 default:
			 System.out.println("Produto não cadastrado!");
		 }
		return loja;
		
	}
}
