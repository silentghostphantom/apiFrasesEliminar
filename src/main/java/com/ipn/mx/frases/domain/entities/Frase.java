package com.ipn.mx.frases.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Clase Entidad que representa una frase.
 * @author José Asunción Enríquez Zárate
 * @author silentghostphantom@gmail.com
 * @since 2026-03-26
 * @version 1.0.0
 */
@NoArgsConstructor()
@AllArgsConstructor()
@Data
@Builder
@Entity
@Table(name = "Frase")
public class Frase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "texto", length = 500, nullable = false)
    private String texto;
    @Column(name = "autor", length = 100, nullable = false)
    private String autor;
}
