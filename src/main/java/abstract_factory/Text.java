package abstract_factory;

/**
 * Created by Administrator on 2018/11/13 0013.
 */
public abstract class Text {
    private String content;

    public abstract String read();

    public abstract void write(String content);

    public String getContent() {
        System.out.println(content);
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
