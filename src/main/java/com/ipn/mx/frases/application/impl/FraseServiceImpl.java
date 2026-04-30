package com.ipn.mx.frases.application.impl;

import com.ipn.mx.frases.application.FraseService;
import com.ipn.mx.frases.domain.entities.Frase;
import com.ipn.mx.frases.domain.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Implementación del servicio {@link FraseService} que gestiona la lógica de negocio
 * relacionada con las frases.
 *
 * <p>Esta clase utiliza el repositorio {@link FraseRepository} para realizar
 * las operaciones de persistencia.</p>
 *
 * @author José Asunción Enríquez Zárate
 * @author silentghostphantom@gmail.com
 * @since 2026-03-26
 * @version 1.0.0
 */

@Service
public class FraseServiceImpl implements FraseService {
    @Autowired
    private FraseRepository dao;

    @Override
    @Transactional(readOnly = true)
    public List<Frase> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Frase findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Frase save(Frase frase) {
        return dao.save(frase);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
