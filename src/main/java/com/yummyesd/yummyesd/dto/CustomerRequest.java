package com.yummyesd.yummyesd.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record CustomerRequest(
        @NotNull(message = "Customer should be present")
        @NotEmpty(message = "Customer should be present")
        @NotBlank(message = "Customer should be present")
        @JsonProperty("First_Name")
        String firstName,

        @JsonProperty("Last_Name")
        String lastName,

        @JsonProperty("Age")
        @NotNull(message = "Customer should be present")
        @NotEmpty(message = "Customer should be present")
        @NotBlank(message = "Customer should be present")
        int age,

        @NotNull(message = "Customer email is required")
        @Email(message = "Email must be in correct format")
        @JsonProperty("email_id")
        String email,

        @NotNull(message = "Password should be present")
        @NotNull(message = "Password should be present")
        @NotBlank(message = "Password should be present")
        @Size(min = 6, max = 20)
        @JsonProperty("Password")
        String password
) {
}
