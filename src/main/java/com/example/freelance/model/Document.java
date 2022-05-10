package com.example.freelance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@org.springframework.data.mongodb.core.mapping.Document
public class Document {
    @Id
    String idDocument;
    String adresse;
    String codePostale;
    String ville;
    Date dateDeLivraison;


}
