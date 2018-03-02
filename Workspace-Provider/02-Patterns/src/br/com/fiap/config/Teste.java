package br.com.fiap.config;

import java.util.Properties;

public class Teste {

	public static void main(String[] args) {
		//Recebe o objeto que carrega as configurações
		Properties p = PropertySingleton.getInstance();
		//Recupera uma configuração do arquivo
		String modo = p.getProperty("modo");
		System.out.println(modo);
		
	}

}
