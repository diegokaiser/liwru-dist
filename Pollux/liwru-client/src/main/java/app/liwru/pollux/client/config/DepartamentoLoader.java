package app.liwru.pollux.client.config;

import app.liwru.pollux.dto.DepartamentoDTO;
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

    public DepartamentoLoader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Iniciando ...");

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
}
