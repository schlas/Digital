package com.fiap.loja;

import java.io.Serializable;

public class LojaTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private double precoUn;
	private int qnt;
	private String marca;
	
	public LojaTO(String nome, double precoUn, int qnt, String marca) {
		super();
		this.nome = nome;
		this.precoUn = precoUn;
		this.qnt = qnt;
		this.marca = marca;
	}
	public LojaTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoUn() {
		return precoUn;
	}
	public void setPrecoUn(double precoUn) {
		this.precoUn = precoUn;
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
