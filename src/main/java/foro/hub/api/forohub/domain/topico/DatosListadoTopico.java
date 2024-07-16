package foro.hub.api.forohub.domain.topico;

public record DatosListadoTopico(
        Long id,

        String titulo,

        Boolean estadoTopico
) {
    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getEstadoTopico());
    }
}
