package com.example.springaddresswebservice;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AddressController {

    @GetMapping(value = "01001000", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getAddress() {

        final String response =
                """
                {
                  "cep": "01001-000",
                  "logradouro": "Praça da Sé",
                  "complemento": "lado ímpar",
                  "bairro": "Sé",
                  "localidade": "São Paulo",
                  "uf": "SP",
                  "ibge": "3550308"
                }
                """;
        return ResponseEntity.ok(response);
    }
}