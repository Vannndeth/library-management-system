package co.istad.util;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class PasswordEncoder {
    public static byte[] generateSalt() {
        // Generate a random salt using SecureRandom
        byte[] salt = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        return salt;
    }

    public static String hashPassword(String password, byte[] salt) {
        // Hash the password using PBKDF2 with HMAC SHA-256
        int iterations = 10000;
        int keyLength = 256;
        char[] passwordChars = password.toCharArray();
        PBEKeySpec spec = new PBEKeySpec(passwordChars, salt, iterations, keyLength);

        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            byte[] hash = skf.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace(); // Handle the exception appropriately
            return null;
        }
    }


    private static boolean verifyPassword(String oldHashPassword, String password) {
        // Retrieve the user information from the database

                    // Hash the provided password with the stored salt
                    String newHashedPassword = hashPassword(password, generateSalt());
                    // Compare the hashed passwords
                    if (newHashedPassword.equals(oldHashPassword)) return true;
                    return false;
    }


}
