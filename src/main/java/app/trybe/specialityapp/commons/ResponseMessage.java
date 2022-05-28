package app.trybe.specialityapp.commons;

public class ResponseMessage {

  public static final String insertMessageSuccess = "Inserido";
  public static final String mensagemErroExplicitId = 
      "Não é permitido inserir novos registros com ID explícito";

  public static String editMessageSuccess(Integer id) {
    return String.format("ID [%d] atualizado", id);
  }

  public static String deleteMessageSuccess(Integer id) {
    return String.format("ID [%d] removido", id);
  }
}
