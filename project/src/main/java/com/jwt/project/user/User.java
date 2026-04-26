package com.jwt.project.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jwt_users")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
