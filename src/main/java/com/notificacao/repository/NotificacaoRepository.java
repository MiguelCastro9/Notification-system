package com.notificacao.repository;

import com.notificacao.model.Notificacao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Miguel Castro
 */
public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
    
    @Query(value = "SELECT * FROM notificacao ORDER BY data DESC", nativeQuery = true)
    public List<Notificacao> findAllOrderDate();
}
