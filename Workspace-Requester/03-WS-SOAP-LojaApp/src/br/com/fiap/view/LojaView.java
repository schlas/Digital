package br.com.fiap.view;

import java.util.Scanner;

import org.apache.axis2.AxisFault;

import br.com.fiap.bo.LojaBOStub;
import br.com.fiap.bo.LojaBOStub.BuscarProduto;
import br.com.fiap.bo.LojaBOStub.BuscarProdutoResponse;
import br.com.fiap.bo.LojaBOStub.LojaTO;

public class LojaView {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o codigo: ");
		int codigo = scn.nextInt();
		
		try {
			BuscarProduto buscar = new BuscarProduto();
			LojaBOStub stub = new LojaBOStub();
			//Valores apra o ws
			buscar.setCodProduto(codigo);
			//Chama o ws
			BuscarProdutoResponse resposta = stub.buscarProduto(buscar);
			//Recupera as informa��es do ws
			System.out.println("A marca �: "+ resposta.get_return().getMarca());
			System.out.println("O nome �: "+ resposta.get_return().getNome());
			System.out.println("O preco �: "+ resposta.get_return().getPrecoU());
			System.out.println("A quantidade �: "+ resposta.get_return().getQnt());	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
