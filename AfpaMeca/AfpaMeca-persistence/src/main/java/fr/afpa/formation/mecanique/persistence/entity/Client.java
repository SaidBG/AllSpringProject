package fr.afpa.formation.mecanique.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CLI")
public class Client extends Personne {

	@Column(unique = true, length = 25)
	private String numero;

	@Column(unique = true, length = 25)
	private String numeroCarteAfpa;

	private Date dateInscription;

	private String statut;

	public Client() {
		super();
	}

	public Client(String mail, String nom, String prenom, String telephone, String numero, String numeroCarteAfpa,
			Date dateInscription, String statut) {
		super(mail, nom, prenom, telephone);
		this.numero = numero;
		this.numeroCarteAfpa = numeroCarteAfpa;
		this.dateInscription = dateInscription;
		this.statut = statut;
	}

	public Client(Long id, String mail, String nom, String prenom, String telephone, String numero,
			String numeroCarteAfpa, Date dateInscription, String statut) {
		super(id, mail, nom, prenom, telephone);
		this.numero = numero;
		this.numeroCarteAfpa = numeroCarteAfpa;
		this.dateInscription = dateInscription;
		this.statut = statut;

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroCarteAfpa() {
		return numeroCarteAfpa;
	}

	public void setNumeroCarteAfpa(String numeroCarteAfpa) {
		this.numeroCarteAfpa = numeroCarteAfpa;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Client [numero=" + numero + ", numeroCarteAfpa=" + numeroCarteAfpa + ", dateInscription="
				+ dateInscription + ", statut=" + statut + "]";
	}
	
}
