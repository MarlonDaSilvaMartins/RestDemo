package br.com.restdemo.demo.controller;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document
public class ArtistaRequest {
    private String nome;
    private String link;
}
