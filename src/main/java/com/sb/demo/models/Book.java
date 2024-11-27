package com.sb.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  private String description;
  private String coverPhotoURL;
  private List<String> genres;

  public Book() {
  }

  public Book(Integer id, String title, String description, String coverPhotoURL, List<String> genres) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.coverPhotoURL = coverPhotoURL;
    this.genres = genres;
  }
}
