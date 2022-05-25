package com.trybe.spring.application;

import com.trybe.spring.domain.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Path("/api/books")
public class BookController {

  private List<Book> books = new ArrayList<>();

  @POST
  @Consumes("application/json") // tipo de dado que é consumido
  @Produces("application/json") // tipo de dado enviado como resposta
  public Response add(Book book) {
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
  @Consumes("application/json")
  @Produces("application/json")
  public Response remove(@PathParam("id") UUID id) {
    try {
      Book book = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      books.remove(book);
      return Response.status(405).build();
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

