package com.ipn.mx.frases.application;

import com.ipn.mx.frases.domain.entities.Frase;

import java.util.List;

/**
 * Servicio que gestiona la lógica de negocio relacionada con las {@link Frase}.
 *
 * <p>Proporciona operaciones básicas de consulta, creación, actualización y eliminación
 * de frases.</p>
 *
 * @author José Asunción Enríquez Zárate
 * @author silentghostphantom@gmail.com
 * @since 2026-03-26
 * @version 1.0.0
 */
public interface FraseService {
    public List<Frase> findAll();
    public Frase findById(Long id);
    //Lo usaremos para guardar o actualizar
    public Frase save(Frase frase);
    public void deleteById(Long id);
}
