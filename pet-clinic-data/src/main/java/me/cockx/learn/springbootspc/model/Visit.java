package me.cockx.learn.springbootspc.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate localDate;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}