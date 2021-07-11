package Strategy;

public class TextFormatterToUpperCase implements TextFormatter{

    @Override
    public void format(String text) {
        System.out.println("[TextFormatterToUpperCase]: "+text.toUpperCase());
    }

}
