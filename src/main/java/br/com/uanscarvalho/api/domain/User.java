package br.com.uanscarvalho.api.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    //Nao pode ter dois usuarios com o mesmo email
    @Column(unique = true)
    private String email;
    private String password;
}
