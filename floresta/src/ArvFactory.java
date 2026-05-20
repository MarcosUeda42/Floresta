import java.util.Map;
import java.util.HashMap;

public class ArvFactory {
    private Map<String, TipoArv> Floresta = new HashMap<>();

    public TipoArv getTipoArv(String especie) {
        TipoArv tipo = Floresta.get(especie);
        if (tipo == null) {
            tipo = new TipoArv(especie);
            Floresta.put(especie, tipo);
        }
        return tipo;
    }
}
