package com.trybe.spring.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Book implements Serializable {

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

  public Book() {}

  /**
   * method constructor.
   *
   * @param book type Book
   */
  public Book(Book book) {
    this.name = book.getName();
    this.author = book.getAuthor();
    this.id = UUID.randomUUID();
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

  @Override
  public String toString() {
    return "Book{"
            + "id=" + id
            + ", name='" + name + '\''
            + ", author='" + author +  '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return id.equals(book.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
