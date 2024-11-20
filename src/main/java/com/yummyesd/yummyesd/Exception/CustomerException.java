package com.yummyesd.yummyesd.Exception;



import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data


public class CustomerException extends RuntimeException {
    public final String message;
}