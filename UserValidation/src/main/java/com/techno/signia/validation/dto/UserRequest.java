package com.techno.signia.validation.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;

}
