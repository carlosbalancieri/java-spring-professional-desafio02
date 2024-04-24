package com.cursojavaspringprofessional.desafio02.entities;

import java.time.Instant;
import java.util.Objects;

public class Bloco {

	private Integer id;
	private Instant inicio;
	private Instant fim;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Instant getInicio() {
		return inicio;
	}
	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}
	public Instant getFim() {
		return fim;
	}
	public void setFim(Instant fim) {
		this.fim = fim;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fim, id, inicio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloco other = (Bloco) obj;
		return Objects.equals(fim, other.fim) && Objects.equals(id, other.id) && Objects.equals(inicio, other.inicio);
	}
	
	
	
}
