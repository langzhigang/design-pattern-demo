package abstract_factory;

/**
 * Created by Administrator on 2018/11/13 0013.
 */
public class LinuxText extends Text {
    public String read() {
        return super.getContent();
    }

    public void write(String content) {
        super.setContent(content);
    }
}
