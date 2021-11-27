package app.liwru.pollux.client.config;

import app.liwru.pollux.client.service.UsuarioService;
import app.liwru.pollux.dto.DepartamentoDTO;
import app.liwru.pollux.dto.RolDTO;
import app.liwru.pollux.dto.TipoDocumentoDTO;
import app.liwru.pollux.dto.UsuarioDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Configuration
public class DepartamentoLoader implements CommandLineRunner {
    //Esta clase solo sirve para testear


    private static final String PRODUCT_ENDPOINT = "https://liwru-pollux-apis.herokuapp.com/api/departamentos";

    private final RestTemplate restTemplate;
    private final UsuarioService usuarioService;

    public DepartamentoLoader(RestTemplate restTemplate, UsuarioService usuarioService) {
        this.restTemplate = restTemplate;
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Iniciando ...");

       // Crear();
       // Actualizar();

       // departamentoList();
        //System.out.println(departamentoList().get(1).getNombre()+"xdxd");
    }

    private List<DepartamentoDTO> departamentoList() {
        List<DepartamentoDTO> departamentos=null;
        ResponseEntity<DepartamentoDTO[]> personResponse = restTemplate.getForEntity(PRODUCT_ENDPOINT , DepartamentoDTO[].class);
        if (personResponse.getStatusCode().is2xxSuccessful()){
            DepartamentoDTO[] body = personResponse.getBody();
            List<DepartamentoDTO> depas = Arrays.asList(body);
            depas.stream().forEach(p -> log.info("Departamento: {}",p));

            departamentos= depas;
        }
        return departamentos;
    }

    public void Crear(){


        UsuarioDTO user= new UsuarioDTO();
        user.setNombreUsuario("Pruebin");
        user.setApellidoUsuario("Pruebon");
        user.setEmailUsuario("PruebinIsBack@hotmail.com");
        user.setNumeroDocUsuario("75948573");
        user.setEstado(1);
        user.setIdRolUsuario(1);
        user.setIdTipoDoc(1);


        usuarioService.createUsuarios(user);
    }

    public void Actualizar(){
        UsuarioDTO user= new UsuarioDTO();
        user.setIdUsuario(7);
        user.setNombreUsuario("Pruebinzhito mAzh Nah");
        user.setApellidoUsuario("Pruebon");
        user.setEmailUsuario("PruebinIsBack@hotmail.com");
        user.setNumeroDocUsuario("75948573");
        user.setEstado(1);
        user.setIdRolUsuario(1);
        user.setIdTipoDoc(1);
        usuarioService.updateUsuarios(user);
    }


}
