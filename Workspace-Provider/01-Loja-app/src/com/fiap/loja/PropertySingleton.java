package com.fiap.loja;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {
	
	//Atributo est�tico do objeto que ser� �nico
	private static Properties p;
	
	//Construtor privado
	private PropertySingleton() {}
	
	//M�todo est�tico getInstance(), que devolve a instancia
	
	public static Properties getInstance() {
		if(p==null) {
			p = new Properties();
			//Carregar o arquivo de propriedades no obj p
			try {
				p.load(PropertySingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return p;
	}
	
}
