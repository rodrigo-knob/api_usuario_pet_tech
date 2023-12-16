package br.com.fiap.api.usuario_pettech.service.validation;

import br.com.fiap.api.usuario_pettech.dto.UsuarioDTO;
import br.com.fiap.api.usuario_pettech.entities.Usuario;
import br.com.fiap.api.usuario_pettech.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CriacaoUsuarioValidator implements ConstraintValidator<CriacaoUsuarioValid, UsuarioDTO> {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void initialize(CriacaoUsuarioValid constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(UsuarioDTO value, ConstraintValidatorContext context) {
        return repository.findByEmail(value.email()).isEmpty();

    }
}
