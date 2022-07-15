package com.trybe.consultafilmes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Consultas {

  private final Collection<Filme> filmes;

  public Consultas(Collection<Filme> filmes) {
    this.filmes = filmes;
  }

  /**
   * Consulta 1: a partir da coleção de filmes desta classe, este método retorna o conjunto de
   * atores que interpretaram a si próprios em pelo menos um desses filmes.
   *
   * <p>
   * Considera-se "atores que interpretaram a si próprios" aqueles que têm o seu nome como uma das
   * chaves do Map `atoresPorPersonagem` e também como um dos itens pertencentes ao conjunto
   * associado a esta mesma chave.
   * </p>
   */
  public Set<String> atoresQueInterpretaramSiProprios() {
    Set<String> result = new HashSet<>();

    filmes.forEach(item -> item.atoresPorPersonagem.forEach((k, v) -> {
      result.addAll(v.stream().filter(elem -> elem.equals(k)).collect(Collectors.toList()));
    }));
    return result;
  }

  /**
   * Consulta 2: a partir da coleção de filmes desta classe, este método retorna a lista de atores
   * que atuaram em pelo menos um filme de um determinado diretor. A lista retornada está disposta
   * em ordem alfabética.
   *
   * <p>
   * Considera-se que um ator tenha atuado em um filme de um determinado diretor se ele tem o seu
   * nome como um dos itens do campo `atores`, ao mesmo tempo em que o diretor em questão tem o seu
   * nome como um dos itens do campo `diretores` do mesmo filme.
   * </p>
   */
  public List<String> atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica(String diretor) {

    List<String> atores = filmes.stream().filter(filme -> filme.diretores.contains(diretor))
        .map(filme -> filme.atores).flatMap(Collection::stream).collect(Collectors.toList());
    Set<String> setAtores = new HashSet<>(atores);
    List<String> result = new ArrayList<>(setAtores);
    result = result.stream().sorted().collect(Collectors.toList());

    return result;
  }

  /**
   * Consulta 3: a partir da coleção de filmes desta classe, este método retorna a lista de filmes
   * em que pelo menos um dos diretores tenha atuado. A lista retornada está disposta em ordem de
   * lançamento, com os filmes mais recentes no início.
   *
   * <p>
   * Considera-se "filmes em que pelo menos um dos diretores tenha atuado" aqueles em que pelo menos
   * um dos itens do campo `diretores` também é um item do campo `atores`.
   * </p>
   */
  public List<Filme> filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro() {
    // List<String> collect = filmes.stream().map(filme ->
    // filme.diretores).flatMap(Collection::stream).collect(Collectors.toList());
    // Set<String> diretores = new HashSet<>(collect);
    // filmes.stream().filter(filme -> {
    // boolean equals = filme.diretores.stream().findFirst().equals(filme.atores.stream().map(ator
    // -> ator));
    // if (!equals) {
    // return;
    // }
    // return filme;
    // });
    // List<Filme> filme = filmes.stream().filter(item -> item.diretores.stream()
    // .findFirst().equals(item.atores.stream().map(x -> x))).collect(Collectors.toList());

    Set<Filme> setList = new HashSet<>(filmes);
    List<Filme> newListFilmes = new ArrayList<>(setList);
    List<Filme> listResult = new ArrayList<>();
    newListFilmes.forEach(filme -> {
      filme.diretores.forEach(diretor -> {
        filme.atores.forEach(ator -> {
          if (diretor.equals(ator)) {
            listResult.add(filme);
          }
        });
      });
    });
    Collections.sort(listResult);
    return listResult;
  }

  /**
   * Consulta 4: a partir da coleção de filmes desta classe, este método retorna um Map contendo
   * todos os filmes lançados em um determinado ano agrupados por categoria.
   *
   * <p>
   * Cada chave do Map representa uma categoria, enquanto cada valor representa o conjunto de filmes
   * que se encaixam na categoria da chave correspondente.
   * </p>
   */
  public Map<String, Set<Filme>> filmesLancadosNoAnoAgrupadosPorCategoria(int ano) {
    List<Filme> listFilme =
        filmes.stream().filter(filme -> filme.anoDeLancamento == ano).collect(Collectors.toList());
    Map<String, Set<Filme>> mapFilmes = new HashMap<>();
    listFilme.forEach(filme -> {
      filme.categorias.forEach(cat -> {
        List<Filme> collect = listFilme.stream().filter(item -> item.categorias.contains(cat))
            .collect(Collectors.toList());
        Set<Filme> setFilme = new HashSet<>(collect);
        mapFilmes.put(cat, setFilme);
      });
    });
    return mapFilmes; // TODO: Implementar (bônus).
  }
}
