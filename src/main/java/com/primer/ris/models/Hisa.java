package com.primer.ris.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Hisa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "hisa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Collection<Soba> sobe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Soba> getSobe() {
		return sobe;
	}

	public void setSobe(Collection<Soba> sobe) {
		this.sobe = sobe;
	}

	private int hisna_stevilka;
	private String naslov;
	private double velikost;
	private boolean vrt;

	public int getHisna_stevilka() {
		return this.hisna_stevilka;
	}

	public void setHisna_stevilka(int hisna_stevilka) {
		this.hisna_stevilka = hisna_stevilka;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public double getVelikost() {
		return this.velikost;
	}

	public void setVelikost(double velikost) {
		this.velikost = velikost;
	}

	public boolean isVrt() {
		return this.vrt;
	}

	public void setVrt(boolean vrt) {
		this.vrt = vrt;
	}

}