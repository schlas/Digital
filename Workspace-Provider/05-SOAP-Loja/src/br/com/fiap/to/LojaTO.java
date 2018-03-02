package br.com.fiap.to;

import java.io.Serializable;

/**
 * Classe que armazena as informações de um produto
 * @author Thiago Schlatter
 * @version 1.0
 * 
 *
 */

public class LojaTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Nome do Produto
	 */
	private String nome;
	/**
	 * Preço unitario
	 */
	private double precoU;
	/**
	 * Quantidade em estoque
	 */
	private int qnt;
	/**
	 * Marca da camiseta
	 */
	private String marca;
	
	public LojaTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LojaTO(String nome, double precoU, int qnt, String marca) {
		super();
		this.nome = nome;
		this.precoU = precoU;
		this.qnt = qnt;
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoU() {
		return precoU;
	}
	public void setPrecoU(double precoU) {
		this.precoU = precoU;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
