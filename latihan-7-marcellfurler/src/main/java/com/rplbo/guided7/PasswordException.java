package com.rplbo.guided7;

import javax.sound.midi.Soundbank;

public class PasswordException extends Exception{
    private int errCode;
    private String errMessage;
    public PasswordException(int errCode) {
        super();
        this.errCode = errCode;


        switch (errCode){
            case 1:
                errMessage = "Password tidak boleh kosong";
                System.out.println(errMessage);
                break;
            case 2:
                errMessage = "Password harus memiliki minimal 8 karakter dan maksimal 50 karakter";
                System.out.println(errMessage);
                break;
        }
        
    }

    public PasswordException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }

}
