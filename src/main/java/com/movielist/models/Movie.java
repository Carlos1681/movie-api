package com.movielist.models;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tb_movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 100)
	@NotBlank(message = "Necessário adicionar um titulo para o filme!")
	private String title;
	
	@Column(nullable = false)
	@NotBlank(message = "Necessário adicionar um diretor para o filme!")
	private String director;
	
	@Column(nullable = false)
	@NotBlank(message = "Necessário adicionar um estudio para o filme!")
	private String studio;
	
	@ElementCollection
	@CollectionTable(name = "movie_cast")
	private Set<String> cast;
	
	@Column(nullable = false)
	@NotBlank(message = "Necessário adicionar um ano de lançamento para o filme!")
	private Integer releaseYear;
	
	@Column(nullable = false)
	@NotBlank(message = "Necessário adicionar a imagem do poster do filme!")
	private String poster;
}
