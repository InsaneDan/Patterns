package Strategy;

public class DemoAppStrategy {

    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatterToUpperCase();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in UpperCase formatter");

        formatter = new TextFormatterToLowerCase();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in LowerCase formatter");

    }

}

/* РЕЗУЛЬТАТ:

[TextFormatterToUpperCase]: TESTING TEXT IN UPPERCASE FORMATTER
[TextFormatterToLowerCase]: testing text in lowercase formatter

 */