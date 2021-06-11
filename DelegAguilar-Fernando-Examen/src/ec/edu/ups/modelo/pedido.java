package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int numero;
	private String fecha;
	private String cliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "pedido",orphanRemoval = true)
	private List<comida> lista;
	private List<Tarjeta>lista2;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public List<comida> getLista() {
		return lista;
	}
	public void setLista(List<comida> lista) {
		this.lista = lista;
	}
	public List<Tarjeta> getLista2() {
		return lista2;
	}
	public void setLista2(List<Tarjeta> lista2) {
		this.lista2 = lista2;
	}
	public pedido() {
		
	}
	public pedido(int numero, String fecha, String cliente, double subtotal, double iva, double total,
			String observaciones) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		long temp;
		temp = Double.doubleToLongBits(iva);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		result = prime * result + ((lista2 == null) ? 0 : lista2.hashCode());
		result = prime * result + numero;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		temp = Double.doubleToLongBits(subtotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pedido other = (pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (Double.doubleToLongBits(iva) != Double.doubleToLongBits(other.iva))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		if (lista2 == null) {
			if (other.lista2 != null)
				return false;
		} else if (!lista2.equals(other.lista2))
			return false;
		if (numero != other.numero)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (Double.doubleToLongBits(subtotal) != Double.doubleToLongBits(other.subtotal))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}
	
	
	
	
	
}
