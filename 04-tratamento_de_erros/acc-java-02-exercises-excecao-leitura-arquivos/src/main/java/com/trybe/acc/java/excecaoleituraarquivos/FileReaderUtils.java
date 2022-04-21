package com.trybe.acc.java.excecaoleituraarquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe do desafio.
 */
public class FileReaderUtils {

  /**
   * método para ler uma linha de um arquivo.
   * 
   * @return string
   */
  public String getFirstLine() {
    String result = "";
    try (BufferedReader reader = new BufferedReader(new FileReader("arquivo_nao_existente.txt"))) {
      result = reader.lines().findFirst().get();

      reader.close();
      return result;
    } catch (FileNotFoundException e) {
      result = "Arquivo não existe";
    } catch (IOException e) {
      System.out.println(e);
    }
    return result;
  }

}
