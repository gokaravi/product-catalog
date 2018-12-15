package com.nisum.productcatalog;

/**
 * Created by NIS1563-MBP on 12/14/18.
 */
public class CustomException extends RuntimeException {

    private String message;

    public CustomException(String message){
        super(message);
        this.message = message;
    }


}
