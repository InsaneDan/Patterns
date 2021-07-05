package Facade.Encryption;

// это НЕ фасад, каждый объект из подсистемы создается и обрабатывается/используется отдельно (самостоятельно).
public class DemoAppNonFacade {
    public static void main(String[] args) {
        String someText = "Encrypt this text";

        MD5Encryptor md5 = new MD5Encryptor();
        System.out.println("MD5 encryption");
        System.out.println(md5.encrypt(someText));

        SHAEncryptor sha = new SHAEncryptor();
        System.out.println("SHA encryption");
        System.out.println(sha.encrypt(someText));

        SHA256Encryptor sha256 = new SHA256Encryptor();
        System.out.println("SHA256 encryption");
        System.out.println(sha256.encrypt(someText));

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