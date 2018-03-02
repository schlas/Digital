package br.com.fiap.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;

import br.com.fiap.to.LojaTO;
/**
 * Classe de negócio que controla o estoque da aplicação
 * @author Thiago Schlatter
 * @version 1
 * 
 *
 */
public class LojaBO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Busca os produtos da loja
	 * @param codProduto
	 * @return loja
	 * 
	 */
	
	public static LojaTO buscarProduto(int codProduto) throws AxisFault {
		LojaTO loja = new LojaTO();
		switch (codProduto) {
		case 1:
			loja = new LojaTO("Camiseta Branca Manga Curta", 19.92, 5, "Naike");
			break;
		case 2:
			loja = new LojaTO("Camiseta Branca Manga Longa", 59.90, 14, "Element");
			break;
		default:
			throw new AxisFault("Não existe no estoque");
		}
		return loja;
	}
	
	public List<LojaTO> listar(int codProduto) throws AxisFault{
		List<LojaTO> lista = new ArrayList<>();
		switch (codProduto) {
		case 1:
			lista.add(new LojaTO("Camiseta Masculina", 58, 2, "Naike"));
			break;
		case 2:
			lista.add(new LojaTO("Camiseta Feminina", 60, 20, "Pluma"));
			break;
		default:
			throw new AxisFault("Não existe no estoque");
		}	
		return lista;
	}
}
