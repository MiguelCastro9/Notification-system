package com.notificacao.model;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Miguel Castro
 */
@Entity
@Data
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
}
