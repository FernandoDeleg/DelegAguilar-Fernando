package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tarjeta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numeroTarjeta;
	private String nombre;
	private String fechaCaducidad;
	private int cvv;
	
	@ManyToOne()
	private pedido pedido;
	
	
	
	public Tarjeta() {
		
	}

	public Tarjeta(String numeroTarjeta, String nombre, String fechaCaducidad, ec.edu.ups.modelo.pedido pedido) {
		this.numeroTarjeta = numeroTarjeta;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.pedido = pedido;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public pedido getPedido() {
		return pedido;
	}

	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cvv;
		result = prime * result + ((fechaCaducidad == null) ? 0 : fechaCaducidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
		Tarjeta other = (Tarjeta) obj;
		if (cvv != other.cvv)
			return false;
		if (fechaCaducidad == null) {
			if (other.fechaCaducidad != null)
				return false;
		} else if (!fechaCaducidad.equals(other.fechaCaducidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}
	
	
	
	
}
