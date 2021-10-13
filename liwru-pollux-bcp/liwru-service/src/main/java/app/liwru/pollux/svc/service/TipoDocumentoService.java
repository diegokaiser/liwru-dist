package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.TipoDocumento;
import app.liwru.pollux.svc.repository.TipoDocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService implements CrudService<TipoDocumento, Integer> {

    private final TipoDocumentoRepository tipoDocumentoRepository;

    public TipoDocumentoService(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

    @Override
    public void create(TipoDocumento tipoDocumento) {
        tipoDocumentoRepository.save(tipoDocumento);
    }

    @Override
    public void update(TipoDocumento tipoDocumento) {
        tipoDocumentoRepository.save(tipoDocumento);
    }

    @Override
    public void delete(Integer id) {
        tipoDocumentoRepository.deleteById(id);
    }

    @Override
    public TipoDocumento findById(Integer id) {
        return tipoDocumentoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<TipoDocumento> findAll() {
        return tipoDocumentoRepository.findAll();
    }
}
