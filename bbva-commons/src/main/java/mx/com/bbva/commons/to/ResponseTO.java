package mx.com.bbva.commons.to;

public class ResponseTO {
    private static final long serialVersionUID = 1l;
    private Integer id;
    private String message;

    public ResponseTO() {
    }

    public ResponseTO(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
