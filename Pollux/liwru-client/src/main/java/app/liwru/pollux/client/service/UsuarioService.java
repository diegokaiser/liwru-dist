package app.liwru.pollux.client.service;

import app.liwru.pollux.dto.UsuarioDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Configuration
@Slf4j
@Service
public class UsuarioService {

    private static final String PRODUCT_ENDPOINT = "https://liwru-pollux-apis.herokuapp.com/api/usuarios";
    private final RestTemplate restTemplate;

    public UsuarioService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Optional<List<UsuarioDTO>> getUsuarios() {

        List<UsuarioDTO> usuarios = null;
        ResponseEntity<UsuarioDTO[]> usuarioResponse = restTemplate.getForEntity(PRODUCT_ENDPOINT, UsuarioDTO[].class);
        if (usuarioResponse.getStatusCode().is2xxSuccessful()) {
            UsuarioDTO[] body = usuarioResponse.getBody();
            List<UsuarioDTO> usu = Arrays.asList(body);
           // usu.stream().forEach(p -> log.info("Usuarios: {}", p));// CON ESTO PUEDES VER LOS DATOS EN EL LOG SI QUIERES

            usuarios = usu;
        }
        return Optional.of(usuarios);
    }



}
