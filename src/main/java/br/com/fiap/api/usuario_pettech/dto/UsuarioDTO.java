package br.com.fiap.api.usuario_pettech.dto;

import br.com.fiap.api.usuario_pettech.service.validation.CriacaoUsuarioValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@CriacaoUsuarioValid(message = "Email já cadastrado")
public record UsuarioDTO(
        Long id,
        @NotBlank(message = "Nome não pode estar em branco")
        String nome,
        @Email(message = "Email inválido")
        String email,
        String cpf,
        LocalDate dataNascimento
) {
}
