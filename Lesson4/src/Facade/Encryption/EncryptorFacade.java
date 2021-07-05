package Facade.Encryption;

public class EncryptorFacade {
    public String encrypt(String type, String text) {
        String hash = "";
        if (type == "MD5") {
            MD5Encryptor e = new MD5Encryptor();
            hash = e.encrypt(text);
        } else if (type == "SHA") {
            SHAEncryptor e = new SHAEncryptor();
            hash = e.encrypt(text);
        } else if (type == "SHA256") {
            SHA256Encryptor e = new SHA256Encryptor();
            hash = e.encrypt(text);
        }
        return hash;
    }
}
