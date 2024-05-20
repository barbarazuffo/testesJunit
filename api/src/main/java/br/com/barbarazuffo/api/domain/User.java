package br.com.barbarazuffo.api.domain;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

}
