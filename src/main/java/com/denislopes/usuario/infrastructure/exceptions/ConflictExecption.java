package com.denislopes.usuario.infrastructure.exceptions;

public class ConflictExecption extends RuntimeException {
    public ConflictExecption(String message) {
        super(message);
    }

    public ConflictExecption(String message, Throwable throwable){
        super(message);
    }

}
