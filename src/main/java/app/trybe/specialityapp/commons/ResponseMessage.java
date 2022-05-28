package app.trybe.specialityapp.commons;

public class ResponseMessage {

    public final static String MSG_CREATED = "Inserido";

    public static String MSG_EDIT(Integer id) {
        return String.format("ID [%d] atualizado", id);
    }

    public static String MSG_DELETE(Integer id) {
        return String.format("ID [%d] removido", id);
    }
}
