package app.trybe.specialityapp.commons;

public class ResponseMessage {

  public static final String insertMessageSuccess = "Inserido";
  public static final String mensageErroExplicitId =
      "Não é permitido inserir novos registros com ID explícito";
  public static final String mensageErroEditDoNotExist =
          "Não é possível editar, o ID informado não existe";
  public static final String mensageErroDeleteDoNotExist =
          "Não é possível deletar, o ID informado não existe";

  public static String editMessageSuccess(Integer id) {
    return String.format("ID [%d] atualizado", id);
  }

  public static String deleteMessageSuccess(Integer id) {
    return String.format("ID [%d] removido", id);
  }
}
