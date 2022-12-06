package com.primer.ris.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Soba {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private double velikost;
	private String ime;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hisa_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	Hisa hisa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hisa getHisa() {
		return hisa;
	}

	public void setHisa(Hisa hisa) {
		this.hisa = hisa;
	}

	public double getVelikost() {
		return this.velikost;
	}

	public void setVelikost(double velikost) {
		this.velikost = velikost;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

}