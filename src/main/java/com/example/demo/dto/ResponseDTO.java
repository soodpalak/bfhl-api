package com.example.demo.dto;

import lombok.Data;
import java.util.List;

@Data
public class ResponseDTO {

    private boolean is_success;

    private String user_id;

    private String email;

    private String roll_number;

    private List<String> odd_numbers;

    private List<String> even_numbers;

    private List<String> alphabets;

    private List<String> special_characters;

    private String sum;

    private String concat_string;

}
