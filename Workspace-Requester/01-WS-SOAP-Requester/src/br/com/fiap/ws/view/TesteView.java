package br.com.fiap.ws.view;

import br.com.fiap.ws.bo.FiapBOStub;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMedia;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMediaResponse;

public class TesteView {
	public static void main(String[] args) throws Exception{
		FiapBOStub stub = new FiapBOStub();
		
		//Valores para enviar ao web service
		CalcularMedia parametros = new CalcularMedia();
		parametros.setAm(8);
		parametros.setNac(7);
		parametros.setPs(6);
		
		//Chama o ws e recupera a resposta
		CalcularMediaResponse resposta = stub.calcularMedia(parametros);
		
		float media = resposta.get_return();
		System.out.println("A média é: " + media);
	}
}
