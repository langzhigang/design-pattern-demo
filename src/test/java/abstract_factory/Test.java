package abstract_factory;

/**
 * Created by Administrator on 2018/11/13 0013.
 */
public class Test {
    public static void main(String[] args){
        TextFactory windowsTextFactory = new WindowsTextFactory();
        TextFactory linuxTextFactory = new LinuxTextFactory();

        Text windowsText = windowsTextFactory.createText();
        windowsText.write("windows text");
        windowsText.read();

        Text linuxText = linuxTextFactory.createText();
        linuxText.write("linux text");
        linuxText.read();

    }
}
