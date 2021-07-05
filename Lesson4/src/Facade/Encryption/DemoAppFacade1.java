package Facade.Encryption;

public class DemoAppFacade1 {
    public static void main(String[] args) {
        String someText = "Encrypt this text";
        EncryptorFacade e = new EncryptorFacade();

        System.out.println("MD5 encryption");
        System.out.println(e.encrypt("MD5", someText));

        System.out.println("SHA encryption");
        System.out.println(e.encrypt("SHA", someText));

        System.out.println("SHA256 encryption");
        System.out.println(e.encrypt("SHA256", someText));
    }
}

/* РЕЗУЛЬТАТ (консоль):

MD5 encryption
8608b4eae12d595dce48b6857132d5d0
SHA encryption
68e7b34151cfdd2cd26ffbd0c65aabd8efcf4160
SHA256 encryption
3b41d4bc4fcec64fb0924e9080495520938b17443b11ef41750784872c0d4e8c

 */