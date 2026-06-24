package com.example.demo.service.impl;

import com.example.demo.dto.RequestDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.BfhlService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDTO process(RequestDTO request) {

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        long sum = 0;

        StringBuilder allLetters = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                long number = Long.parseLong(item);

                sum += number;

                if (number % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            }


            else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());

                allLetters.append(item);

            }

            else {

                specialCharacters.add(item);

            }

        }

        ResponseDTO response = new ResponseDTO();

     //   response.set_success(true);
        response.set_success(true);



        response.setUser_id("palak_sood_10082005");

        response.setEmail("palak2252.be23@chitkara.edu.in");

        response.setRoll_number("2310992252");

        response.setEven_numbers(evenNumbers);

        response.setOdd_numbers(oddNumbers);

        response.setAlphabets(alphabets);

        response.setSpecial_characters(specialCharacters);

        response.setSum(String.valueOf(sum));

        response.setConcat_string(makeConcatString(allLetters.toString()));

        return response;
    }

    private String makeConcatString(String text) {

        StringBuilder reverse = new StringBuilder(text).reverse();

        StringBuilder answer = new StringBuilder();

        boolean upper = true;

        for (char ch : reverse.toString().toCharArray()) {

            if (upper)
                answer.append(Character.toUpperCase(ch));
            else
                answer.append(Character.toLowerCase(ch));

            upper = !upper;
        }

        return answer.toString();
    }

}