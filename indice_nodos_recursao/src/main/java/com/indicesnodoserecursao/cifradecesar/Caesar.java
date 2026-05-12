package com.indicesnodoserecursao.cifradecesar;

public class Caesar {
    private static final int ALPHABET_SIZE = 26;
    private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    protected char[] encryptedAlphabet = new char[ALPHABET_SIZE];
    protected char[] decryptedAlphabet = new char[ALPHABET_SIZE];

    public Caesar() {
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            encryptedAlphabet[i] = alphabet[(i + 3) % ALPHABET_SIZE];
        }

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            decryptedAlphabet[encryptedAlphabet[i] - 'A'] = alphabet[i];
        }
    }

    public String encrypt(String encryp) {
         char[] mess = encryp.toCharArray();

         for(int i = 0; i < mess.length; i ++) {
            if(Character.isUpperCase(mess[i])) {
                mess[i] = encryptedAlphabet[mess[i] - 'A'];
            }
         }
         return new String(mess);
    }

    public String decrypt(String decrypt) {
        char[] mess = decrypt.toCharArray();

        for(int i = 0; i < mess.length; i++) {
            if(Character.isUpperCase(mess[i])) {
                mess[i] = decryptedAlphabet[mess[i] - 'A'];
            }
        }

        return new String(mess);
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        System.out.println("Encrypted: " + new String(caesar.encryptedAlphabet));
        System.out.println("Decrypted: " + new String(caesar.decryptedAlphabet));

        String message = "HELLO WORLD";
        message = caesar.encrypt(message);
        System.out.println("Encrypted message: " + message);

        message = caesar.decrypt(message);
        System.out.println("Decrypted message: " + message);
    }
}
