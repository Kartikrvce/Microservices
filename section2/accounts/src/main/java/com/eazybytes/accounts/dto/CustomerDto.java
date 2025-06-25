package com.eazybytes.accounts.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {


    @NotEmpty(message = "dont leave it empty")
    @Size(min = 5,max = 30 , message = "between 5 adn 30")
    private String name;


    @Email(message = "valid email should be inserted")
    @NotEmpty(message = "dont leave it empty")
    private String email;

    @NotEmpty(message = "dont leave it empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")

    private String mobileNumber;

    private AccountsDto accountsDto;
}