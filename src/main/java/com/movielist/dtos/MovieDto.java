package com.movielist.dtos;

import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
	
	private Integer id;
	
	@NotBlank(message = "Necessário adicionar um titulo para o filme!")
	private String title;
	
	@NotBlank(message = "Necessário adicionar um diretor para o filme!")
	private String director;
	
	@NotBlank(message = "Necessário adicionar um estudio para o filme!")
	private String studio;
	
	private Set<String> actorsCast;
	
	private Integer releaseYear;
	
	@NotBlank(message = "Necessário adicionar a imagem do poster do filme!")
	private String poster;
	
	@NotBlank(message = "Necessário adicionar a url da imagem do poster!")
	private String posterUrl;
}
