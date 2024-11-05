package co.edu.estudiofinanciero.domain;

import java.util.List;

public interface SolicitudService {

    List<Solicitud> listar();

    Solicitud listarId(int id);

    Solicitud add(Solicitud p);

    Solicitud edit(Solicitud p);

    Solicitud delete(int id);
}
