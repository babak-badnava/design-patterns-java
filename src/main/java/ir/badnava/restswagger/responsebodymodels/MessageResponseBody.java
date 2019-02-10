package ir.badnava.restswagger.responsebodymodels;

public class MessageResponseBody extends RestResponseBody {

    private String content;

    public MessageResponseBody(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
