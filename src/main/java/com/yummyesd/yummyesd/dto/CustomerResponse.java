package com.yummyesd.yummyesd.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CustomerResponse(
        @JsonProperty("customerId")
        int id,
        @JsonProperty("First_Name")
        String firstName,
        @JsonProperty("Last_Name")
        String lastName,
        @JsonProperty("Age")
        int age,
        @JsonProperty("email_id")
        String email
) {

}
