import java.util.List;
import java.util.ArrayList;

public class Map {
    private ArvFactory factory;
    private List<Arvore> arvores;
    private int size = 1000;

    public Map(ArvFactory factory) {
        this.factory = factory;
        this.arvores = new ArrayList<>();
    }

    public void plantarArvore(String especie, int x, int y, int altura, int diametro, int numGalhos) {
        if (x < 0 || x > size || y < 0 || y > size) {
            System.out.println("Posição fora dos limites do mapa.");
            return;
        }
        TipoArv tipo = factory.getTipoArv(especie);
        Arvore arvore = new Arvore(altura, diametro, numGalhos, tipo, x, y);
        arvores.add(arvore);
    }

    public long calcularMemoria() {
        long memoria = 0;
        memoria += factory.getTotalTipos() * 50;   //Tamanho em bytes de cada tipo de árvore
        memoria += arvores.size() * 28;   //Tamanho em bytes de cada árvore            
        return memoria;  
    }   
    
    public List<Arvore> getArvores() {
        return arvores;
    }
}
