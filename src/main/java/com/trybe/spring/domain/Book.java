package com.trybe.spring.domain;

import java.util.UUID;

public class Book {

  private UUID id;

  private String name;

  private String author;

  /**
   * method construct.
   * 
   * @param name type string.
   * @param author type string.
   */
  public Book(String name, String author) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.author = author;
  }
  public Book() {

  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
