package foro.hub.api.forohub.domain.topico;


public record DatosActualizarTopico(
    Long id,
    String titulo,
    String mensaje,
    String curso
) {
    public DatosActualizarTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
    }
}
