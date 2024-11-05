package co.edu.personasapi.infraestructura;

import co.edu.personasapi.domain.Persona;
import co.edu.personasapi.domain.PersonaService;
import co.edu.personasapi.domain.TipoPersona;
import co.edu.personasapi.domain.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nixod
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/personasrest"})
public class PersonaRest {

    @Autowired
    PersonaService service;
    @Autowired
    TipoPersonaService tpservice;
 
    // Persona
    @GetMapping("/persona")
    public List<Persona> listar() {
        return service.listar();
    }

    @PostMapping("/persona/add")
    public Persona agregar(@RequestBody Persona p) {
        return service.add(p);
    }

    @GetMapping("/persona/{id}")
    public Persona listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/persona/{id}")
    public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
        p.setId(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/persona/{id}")
    public Persona delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
    // TipoPersona
    @GetMapping("/tipopersona")
    public List<TipoPersona> listarTp() {
        return tpservice.listar();
    }
    
    @PostMapping("/tipopersona/add")
    public TipoPersona agregarTp(@RequestBody TipoPersona p) {
        return tpservice.add(p);
    }
    
    @GetMapping("/tipopersona/{id}")
    public TipoPersona listarIdTp(@PathVariable("id") int id) {
        return tpservice.listarId(id);
    }
    
    @PutMapping("/tipopersona/{id}")
    public TipoPersona editarTp(@RequestBody TipoPersona p, @PathVariable("id") int id) {
        p.setId_tp(id);
        return tpservice.edit(p);
    }
    
    @DeleteMapping("/tipopersona/{id}")
    public TipoPersona deleteTp(@PathVariable("id") int id) {
        return tpservice.delete(id);
    }
    
  
}
