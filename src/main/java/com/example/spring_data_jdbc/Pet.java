package com.example.spring_data_jdbc;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Pet {
    @Id
    private Long id;
    private String name;
    private LocalDate birthDate;

    public Pet(Long id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    static Pet create(String name, LocalDate birthDate){
        return  new Pet(null,name,birthDate);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    void setId(Long id){
        this.id = id;
    }
}
