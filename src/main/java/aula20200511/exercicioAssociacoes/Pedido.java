package aula20200511.exercicioAssociacoes;

import java.util.ArrayList;

public class Pedido {
	private Integer numero;
	private ArrayList<ItemPedido> itemPedido;
	
	public Pedido(Integer numero) {
		this.numero = numero;
		itemPedido = new ArrayList<ItemPedido>();
	}

	public Integer getNumero() {
		return numero;
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
		this.itemPedido.add(itemPedido);
	}
	
	public ArrayList<ItemPedido> getItens() {
		return this.itemPedido;
	}
}
