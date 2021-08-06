package br.com.rhfactor.samplecrudapi.dtos;

import lombok.Builder;
import lombok.Data;

/**
 * LoginForm
 * Classe utilizada para efetuar o login de usuários na plataforma
 */
@Data
@Builder(toBuilder = true) // Utilizamos o Builder Patter para criar as entidades no sistema
public class LoginForm {

    String username;

    String password;

}
