package demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amarendra on 16/12/16.
 */
public class EncryptionTest {

    @Test
    public void testEncryptor(){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPassword("password123@");
        encryptor.setConfig(config);
        String encrypt = encryptor.encrypt("server");
        System.out.println(encrypt);
        String decrypt = encryptor.decrypt(encrypt);
        assertEquals("server",decrypt);

    }
}
