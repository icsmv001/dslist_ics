package com.devsuperior.dslist.dto;

import java.util.Objects;

import com.devsuperior.dslist.entities.Game;

import jakarta.persistence.Column;

public class GameMinDTO {

	  private  Long    id;
	  private  String  title;
	  private  Integer year;
	  private  String  imgUrl;
	  private  String  shortDescription;
	  
	  
public GameMinDTO(){
}


// instanciar uma entidade game, copiando da entidade os dados para o DTO.
public GameMinDTO(Game entity) {
	id = entity.getId();
	title = entity.getTitle();
	year = entity.getYear();
	imgUrl = entity.getImgUrl();
	shortDescription = entity.getShortDescription();
}




public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public Integer getYear() {
	return year;
}


public void setYear(Integer year) {
	this.year = year;
}


public String getImgUrl() {
	return imgUrl;
}


public void setImgUrl(String imgUrl) {
	this.imgUrl = imgUrl;
}


public String getShortDescription() {
	return shortDescription;
}


public void setShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
}


@Override
public int hashCode() {
	return Objects.hash(id);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	GameMinDTO other = (GameMinDTO) obj;
	return Objects.equals(id, other.id);
}







}
