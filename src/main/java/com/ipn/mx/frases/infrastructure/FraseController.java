package com.ipn.mx.frases.infrastructure;

import com.ipn.mx.frases.application.FraseService;
import com.ipn.mx.frases.domain.entities.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar las operaciones relacionadas con las frases.
 *
 * <p>Proporciona endpoints para consultar, crear, actualizar y eliminar frases.</p>
 *
 * @author José Asunción Enríquez Zárate
 * @author silentghostphantom@gmail.com
 * @since 2026-03-26
 * @version 1.0.0
 */

@CrossOrigin (origins = "*")
@RestController
@RequestMapping("/api/v1/frases")
public class FraseController {
    @Autowired
    private FraseService servicio;

    @GetMapping("/frase")
    public List<Frase> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/frase/{id}")
    public Frase findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping("/frase")
    @ResponseStatus(HttpStatus.CREATED)
    public Frase save(@RequestBody Frase frase) {
        return servicio.save(frase);
    }

    @PutMapping("/frase/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Frase update(@PathVariable Long id,
                        @RequestBody Frase frase) {
        Frase f = servicio.findById(id);
        f.setTexto(frase.getTexto());
        f.setAutor(frase.getAutor());
        return servicio.save(f);
    }

    @DeleteMapping("/frase/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        servicio.deleteById(id);
    }
}
