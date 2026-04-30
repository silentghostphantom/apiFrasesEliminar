package com.ipn.mx.frases.domain.repository;

import com.ipn.mx.frases.domain.entities.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repository para gestionar el acceso a datos de la entidad {@link Frase}.
 * <p>Proporciona métodos CRUD básicos y consultas personalizadas
 * relacionadas con frases.</p>
 * @author José Asunción Enríquez Zárate
 * @author silentghostphantom@gmail.com
 * @since 2026-03-26
 * @version 1.0.0
 */
public interface FraseRepository extends JpaRepository<Frase, Long> {

}
