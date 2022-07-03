package com.notificacao.service;

import com.notificacao.model.Tecnologia;
import com.notificacao.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class TecnologiaService {

    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    public void save(Tecnologia tecnologia) {

        tecnologiaRepository.save(tecnologia);
    }
    
    public List<Tecnologia> list() {
        
        return  tecnologiaRepository.findAll();
    }
}
