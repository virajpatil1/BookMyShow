package com.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DialectOverride;
import org.springframework.aot.generate.GeneratedTypeReference;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {

    private String name;
    private String address;

    @OneToMany
    private List<Screen> screens = new ArrayList<>();

    @OneToMany
    private List<Show> shows = new ArrayList<>();
}