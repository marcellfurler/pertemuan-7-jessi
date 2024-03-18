package com.rplbo.guided7;

public class PasswordTest {
    public static void main(String[] args) throws PasswordException {
        String username = "anton";
        String password = "Rah4si4aa";


        try {
            if (password.isEmpty() || password.equals("")) {
                throw new PasswordException(1);
            }
            else if (password.length() < 3 || password.length() >= 50) {
                throw new PasswordException(2);
            } else {
                System.out.println("Anda Benar");
            }
        } catch (PasswordException e){

        }finally {
            System.out.println("Terima Kasih");
        }

    }
}
