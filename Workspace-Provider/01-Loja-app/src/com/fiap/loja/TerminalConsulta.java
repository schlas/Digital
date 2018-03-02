package com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerminalConsulta {
	
	private static final Logger log = 
			LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Calendar hoje;
		Properties p = PropertySingleton.getInstance();
		SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String nomao = p.getProperty("nome")+" "+p.getProperty("filial");
		 hoje = Calendar.getInstance();
		 System.out.println(nomao + " " + fm.format(hoje.getTime()));
		 System.out.println("*******************");
		 int cod;
		 do {
			//log.debug("Começou a consulta");
			System.out.println("Código do Produto: \n");	
			 cod = sc.nextInt();
			 EstoqueBO.consultarProduto(cod);
		 }while(cod != 0);
		 //log.warn("Finalizou o projeto");
		 
		 sc.close();
		 
	}
		
	
}
