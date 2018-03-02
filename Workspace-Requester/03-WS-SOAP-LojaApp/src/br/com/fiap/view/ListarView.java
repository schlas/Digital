package br.com.fiap.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.bo.LojaBOStub;
import br.com.fiap.bo.LojaBOStub.Listar;
import br.com.fiap.bo.LojaBOStub.ListarResponse;
import br.com.fiap.bo.LojaBOStub.LojaTO;

public class ListarView {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o codigo");
		int codProduto = scn.nextInt();
		
		try {
			Listar listar = new Listar();
			LojaBOStub stub = new LojaBOStub();
			
			listar.setCodProduto(codProduto);
			
			ListarResponse resposta = stub.listar(listar);
			LojaTO[] array = resposta.get_return();
			
			List<LojaTO> lista = Arrays.asList(array);
			
			for(LojaTO lojaTO : lista){
				System.out.println(lojaTO.getMarca());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
