package br.com.fiap.config;

import java.util.Properties;

public class Teste {

	public static void main(String[] args) {
		//Recebe o objeto que carrega as configura��es
		Properties p = PropertySingleton.getInstance();
		//Recupera uma configura��o do arquivo
		String modo = p.getProperty("modo");
		System.out.println(modo);
		
	}

}
