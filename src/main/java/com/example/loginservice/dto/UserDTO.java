package com.example.loginservice.dto;

import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDTO {
    @NotBlank(message = "Email may not be empty")
    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Email validation fail")
    private String email;
    @NotBlank(message = "Login may not be empty")
    @Size(min = 4, max = 50, message = "Login's length should be between 4 and 50")
    private String username;
    @NotBlank(message = "Password may not be empty")
    @Size(min = 5, max = 50, message = "Password's length should be between 5 and 50")
    private String password;
    @NotBlank(message = "First name may not be empty")
    @Size(max = 100, message = "First name's length should be less then 100")
    private String firstname;
    @NotBlank(message = "Last name  may not be empty")
    @Size(max = 100, message = "Last name's length should be less then 100")
    private String lastname;
    @NotNull
    private SexEnum sex;
}
