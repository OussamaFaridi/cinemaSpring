package org.sid.cinema.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Place implements Serializable{
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  long id;
	private int  numero;
	private  double  longiture,latitude,altitude;
	
	@ManyToOne
	private Salle salle;
	
	@OneToMany(mappedBy="place")
	private Collection<Ticket> tickets;
	
	
}
