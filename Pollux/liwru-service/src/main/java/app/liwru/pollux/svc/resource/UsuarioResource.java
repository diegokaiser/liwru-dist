package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.model.Usuario;
import app.liwru.pollux.svc.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/usuarios")
@RestController
public class UsuarioResource {

    private final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity getUsers(){
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity getUser(@PathVariable Integer idUsuario){
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> postUser(@RequestBody Usuario usuario) {
        usuarioService.create(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @PutMapping("/{idUsuario}")
    public ResponseEntity<Usuario> postUsuario(@RequestBody Integer idUsuario,
                                               @RequestBody Usuario usuario) {
        if(null == usuarioService.findById(idUsuario)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        usuario.setIdUsuario(idUsuario);
        usuarioService.update(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Usuario> deleteUsuario(@PathVariable Integer idUsuario) {
        if(null == usuarioService.findById(idUsuario)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        usuarioService.delete(idUsuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
