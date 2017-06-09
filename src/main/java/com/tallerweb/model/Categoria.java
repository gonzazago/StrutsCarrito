package com.tallerweb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class Categoria implements Serializable{


	private static final long serialVersionUID = 1L;


	private String categoria;
	


	
	public Categoria(String categoria) {
		this.categoria=categoria;
	}
	public Categoria(){}


	/*GETTERS Y SETTERS*/
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*EQUALS Y HASHCODE*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
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
		Categoria other = (Categoria) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		return true;
	}

	/*SOBREESCRITURA DE METODO TO STRING*/
	@Override
	public String toString() {
		categoria.toString();
		return categoria;
	}
}
