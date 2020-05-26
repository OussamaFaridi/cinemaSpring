package org.sid.cinema.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
public class Categorie implements Serializable{
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  long id;
	private String  name;
	
	@OneToMany(mappedBy="categorie")
	private Collection<Film> films;
	
	


}
