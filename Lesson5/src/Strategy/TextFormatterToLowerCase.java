package Strategy;

public class TextFormatterToLowerCase implements TextFormatter{

    @Override
    public void format(String text) {
        System.out.println("[TextFormatterToLowerCase]: "+text.toLowerCase());
    }

}
