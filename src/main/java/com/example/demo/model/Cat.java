package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Cat {
    private Weight weight;
    @Id private String id;
    private String name;
    private String cfa_url;
    private String vetstreet_url;
    private String vcahospitals_url;
    private String temperament;
    private String origin;
    private String country_codes;
    private String country_code;
    private String description;
    private String life_span;
    private String indoor;
    private String lap;
    private String alt_names;
    private String adaptability;
    private String affection_level;
    private String child_friendly;
    private String dog_friendly;
    private String energy_level;
    private String grooming;
    private String health_issues;
    private String intelligence;
    private String shedding_level;
    private String social_needs;
    private String stranger_friendly;
    private String vocalisation;
    private String experimental;
    private String hairless;
    private String natural;
    private String rare;
    private String rex;
    private String suppressed_tail;
    private String short_legs;
    private String wikipedia_url;
    private String hypoallergenic;
}
