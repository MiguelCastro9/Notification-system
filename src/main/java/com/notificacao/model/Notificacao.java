package com.notificacao.model;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Miguel Castro
 */
@Entity
@Data
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String mensagem;
    
    @Column(nullable = false)
    private LocalDateTime data;

}
