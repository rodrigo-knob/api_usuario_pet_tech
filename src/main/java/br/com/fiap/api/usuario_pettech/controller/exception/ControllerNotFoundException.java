package br.com.fiap.api.usuario_pettech.controller.exception;

public class ControllerNotFoundException extends RuntimeException {
    public ControllerNotFoundException(String message) {
        super(message);
    }
}
