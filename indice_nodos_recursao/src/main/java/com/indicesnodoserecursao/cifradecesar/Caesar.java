package com.indicesnodoserecursao.cifradecesar;

public class Caesar {
    private static final int ALPHABET_SIZE = 26;
    private static final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    protected char[] encrypt = new char[ALPHABET_SIZE];
    protected char[] decrypt = new char[ALPHABET_SIZE];


    public Caesar() {
        for(int i = 0; i < ALPHABET_SIZE; i++) {
            encrypt[i] = alphabet[(i + 3) % ALPHABET_SIZE];
        }

        for(int i = 0; i < ALPHABET_SIZE; i++) {
            decrypt[encrypt[i] - 'A'] = alphabet[i];
        }
    }
    
    public String encrypt(String encryptText) {
        char[] mess = encryptText.toCharArray();

        for(int i = 0; i < mess.length; i++) {
            if(Character.isUpperCase(mess[i])) {
                mess[i] = encrypt[mess[i] - 'A'];
            }
        }

        return new String(mess);
    }

    public String decrypt(String decryptText) {
        char[] mess = decryptText.toCharArray();

        for(int i = 0; i < mess.length; i++) {
            if(Character.isUpperCase(mess[i])) {
                mess[i] = decrypt[mess[i] - 'A'];
            }
        }

        return new String(mess);
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        System.out.println("Enccryption order = " + new String(caesar.encrypt));
        System.out.println("Decryption order = " + new String(caesar.decrypt));
        
        String secret = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
        secret = caesar.encrypt(secret);
        System.out.println("Encrypted message: " + secret);

        String decrypted = caesar.decrypt(secret);
        System.out.println("Decrypted message: " + decrypted);
    }
}
