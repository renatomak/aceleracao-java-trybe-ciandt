package com.trybe.spring.application;

import com.trybe.spring.domain.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Path("/api/books")
public class BookController {

  private List<Book> books = new ArrayList<>();

  /**
   * method add one book.
   *
   * @param book type Book
   * @return response
   */
  @POST
  @Consumes("application/json") // tipo de dado que é consumido
  @Produces("application/json") // tipo de dado enviado como resposta
  public Response add(Book book) {
    book = new Book(book);
    books.add(book);
    return Response.ok(book).build();
  }

  @GET
  @Consumes("application/json")
  @Produces("application/json")
  public Response findAll() {
    return Response.ok(books).build();
  }

  /**
   * method get one book.
   * 
   * @param id type UUID
   * @return response
   */
  @GET
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response findById(@PathParam("id") UUID id) {
    try {
      Book book = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      return Response.ok(book).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }

  /**
   * method remove one book.
   * 
   * @param id type UUID.
   * @return response.
   */
  @DELETE
  @Path("/{id}")
  public Response remove(@PathParam("id") UUID id) {
    try {
      Book book = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      return Response.status(200).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }

  /**
   * method get one book.
   *
   * @param id type UUID
   * @return response
   */
  @PUT
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response update(@PathParam("id") UUID id, @RequestBody Book book) {
    try {
      Book newBook = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();

      if (book.getAuthor() != null) {
        newBook.setAuthor(book.getAuthor());
      }

      if (book.getName() != null) {
        newBook.setName(book.getName());
      }

      return Response.ok(newBook).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }
}

