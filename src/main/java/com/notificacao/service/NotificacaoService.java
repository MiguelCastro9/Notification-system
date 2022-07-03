package com.notificacao.service;

import com.notificacao.model.Notificacao;
import com.notificacao.repository.NotificacaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class NotificacaoService {
 
    @Autowired
    NotificacaoRepository notificacaoRepository;
    
    public void save(Notificacao notificacao) {

        notificacaoRepository.save(notificacao);
    }
    
    public List<Notificacao> list() {
        
        return  notificacaoRepository.findAllOrderDate();
    }
    
    public void delete(Long id) {
        
        notificacaoRepository.deleteById(id);
    }
}
