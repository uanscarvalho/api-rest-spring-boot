package br.com.uanscarvalho.api.domain.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String email;

    //@JsonIgnore //Ignora os Getters e nao é enviado
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
