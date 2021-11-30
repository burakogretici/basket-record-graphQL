package com.example.basketrecordgraphql.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "positions")
@AllArgsConstructor
@NoArgsConstructor
public class Position implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String positionName;


    @OneToMany(mappedBy = "position")
    private List<Player> players;
}
