package com.trybe.conversorcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Conversor {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   * @throws ParseException
   */
  public static void main(String[] args) throws IOException, ParseException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  /**
   * Converte todos os arquivos CSV da pasta de entradas. Os resultados são gerados na pasta de
   * saídas, deixando os arquivos originais inalterados.
   *
   * @param pastaDeEntradas Pasta contendo os arquivos CSV gerados pela página web.
   * @param pastaDeSaidas Pasta em que serão colocados os arquivos gerados no formato requerido pelo
   *        subsistema.
   *
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   * @throws ParseException
   */
  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    File[] folders = pastaDeEntradas.listFiles(File::isFile);

    for (File folder : folders) {
      FileReader fileReader = new FileReader(folder);
      FileWriter fileWriter = new FileWriter(pastaDeSaidas + File.separator + folder.getName());


      BufferedReader bufferedReader = new BufferedReader(fileReader);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



      String line = bufferedReader.readLine();
      bufferedWriter.write(line.toString());
      bufferedWriter.newLine();
      bufferedWriter.flush();

      line = bufferedReader.readLine();

      while (line != null) {
        bufferedWriter.write(convertLine(line.toString()));
        bufferedWriter.newLine();
        bufferedWriter.flush();

        line = bufferedReader.readLine();
      }

      bufferedReader.close();
      bufferedWriter.close();

    }



  }

  public static String convertLine(String line) {
    String[] array = line.split(",");

    array[0] = array[0].toUpperCase();
    array[1] = convertDate(array[1]);
    array[3] = formatCpf(array[3]);

    return String.join(",", array);
  }

  public static String convertDate(String date) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String[] dates = date.split("/");
    int year = Integer.parseInt(dates[2]);
    int month = Integer.parseInt(dates[1]) - 1;
    int day = Integer.parseInt(dates[0]);

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.MONTH, month);
    calendar.set(Calendar.DAY_OF_MONTH, day);
    Date dateRepresentation = calendar.getTime();

    return dateFormat.format(dateRepresentation);
  }

  public static String formatCpf(String cpf) {
    String mask = "###.###.###-##";
    String result = "";

    MaskFormatter formatCpf;
    try {
      formatCpf = new MaskFormatter(mask);
      JFormattedTextField cpfFormatted = new JFormattedTextField(formatCpf);
      cpfFormatted.setText(cpf);

      result = cpfFormatted.getText();
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return result;

  }

}
