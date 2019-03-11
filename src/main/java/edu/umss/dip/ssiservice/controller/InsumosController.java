package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.model.Insumos;
import edu.umss.dip.ssiservice.repository.InsumosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Produces(MediaType.APPLICATION_JSON)
public class InsumosController {

    @Autowired
    public InsumosRepository insumoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Insumos>> getInsumos() {

        Iterable<Insumos> lista = insumoRepository.getAllInsumos();

        List<Insumos> target = new ArrayList<>();
        lista.forEach(target::add);
        return new ResponseEntity<>(target, HttpStatus.OK);

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Insumos> getAllEmployeeById(@PathVariable(name = "id") long id) {

        Optional<Insumos> one = insumoRepository.findById(id);

        if (one.isPresent()) {
            Insumos insumo = one.get();
            return new ResponseEntity<Insumos>(insumo, HttpStatus.OK);
        }
        return new ResponseEntity<Insumos>(one.get(), HttpStatus.OK);

    }

    @RequestMapping(value = "/insumos/crear", method = RequestMethod.POST)
    public ResponseEntity<Insumos> crearInsumos() {
        Insumos target = insumoRepository.insertarInsumos();
        return new ResponseEntity<>(target, HttpStatus.OK);
    }
}
