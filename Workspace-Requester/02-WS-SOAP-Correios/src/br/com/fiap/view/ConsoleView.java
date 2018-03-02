package br.com.fiap.view;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;
import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CServico;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;

public class ConsoleView {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o cep de destino: ");
		String codCepDest = scn.nextLine();
		
		System.out.println("Digite o cep de origem: ");
		String codCepOri = scn.nextLine();
		
		try {
			CalcPrecoPrazoWSStub stub = new CalcPrecoPrazoWSStub();
			
			CalcPrazo valores = new CalcPrazo();
			valores.setNCdServico("4014");
			valores.setSCepDestino(codCepDest);
			valores.setSCepOrigem(codCepOri);
			
			CalcPrazoResponse resposta = stub.calcPrazo(valores);
			
			CServico servico = resposta.getCalcPrazoResult().getServicos().getCServico()[0];
			
			System.out.println("Prazo: " + servico.getPrazoEntrega());
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
