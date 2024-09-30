package com.example.inicial1.entities;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false) //esta relacion no puede ser nula, siempre q cree una persona el domicilio si o si tiene q tener una localidad
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;



}