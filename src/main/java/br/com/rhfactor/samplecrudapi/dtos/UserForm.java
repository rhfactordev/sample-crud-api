package br.com.rhfactor.samplecrudapi.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class UserForm {

    String name;

    Integer age;

}
