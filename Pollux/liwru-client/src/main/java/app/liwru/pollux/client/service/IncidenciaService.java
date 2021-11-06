package app.liwru.pollux.client.service;

import app.liwru.pollux.dto.DepartamentoDTO;
import app.liwru.pollux.dto.IncidenciaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Configuration
@Slf4j
@Service
public class IncidenciaService {

    private static final String PRODUCT_ENDPOINT = "https://liwru-pollux-apis.herokuapp.com/api/incidencias";
    private final RestTemplate restTemplate;




    public IncidenciaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Optional<List<IncidenciaDTO>> getIncidencias() {

        List<IncidenciaDTO> incidencias = null;
        ResponseEntity<IncidenciaDTO[]> incidenciaResponse = restTemplate.getForEntity(PRODUCT_ENDPOINT, IncidenciaDTO[].class);
        if (incidenciaResponse.getStatusCode().is2xxSuccessful()) {
            IncidenciaDTO[] body = incidenciaResponse.getBody();
            List<IncidenciaDTO> inci = Arrays.asList(body);
            //inci.stream().forEach(p -> log.info("Incidencias: {}", p)); //CON ESTO PUEDES VER LOS DATOS EN EL LOG SI QUIERES

            incidencias = inci;
        }
        return Optional.of(incidencias);
    }



}
