package security;

import java.math.BigInteger;
import java.security.Key;
import java.util.Calendar;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

//Encrypting and Decrypting token using DES Algorithm
public class EncDecrypter {

	public static byte[] encrypt(String token, Key key) throws Exception {

		byte[] utf8 = token.getBytes("UTF8");

		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] enc = cipher.doFinal(utf8);
		return enc;

	}

	public static String decrypt(byte[] enc, Key key) throws Exception {

		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] utf8 = cipher.doFinal(enc);

		return new String(utf8, "UTF8");
	}

	public static Key getKey() throws Exception {
		String key = "123131522c70ebac"; // 128 bit key (16 * 8 = 128)
		byte[] encoded = new BigInteger(key, 16).toByteArray();
		return new SecretKeySpec(encoded, "DES");
	}

	public static void main(String[] args) {

		try {
			String token = "exampleLine::" + System.currentTimeMillis();
			System.out.println("token:" + token);
			System.out.println("token date:" + Calendar.getInstance().getTime());

			Key key = EncDecrypter.getKey();
			byte[] encryptedToken = EncDecrypter.encrypt(token, key);
			String decryptedToken = EncDecrypter.decrypt(encryptedToken, key);
			System.out.println("Decrypted:" + decryptedToken);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
