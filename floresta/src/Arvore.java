public class Arvore {
    private float altura;
    private float diametro;
    private int numGalhos;
    private TipoArv tipo;

    public Arvore(float altura, float diametro, int numGalhos, TipoArv tipo) {
        this.altura = altura;
        this.diametro = diametro;
        this.numGalhos = numGalhos;
        this.tipo = tipo;
    }

    public float getAltura() {
        return altura;
    }

    public float getDiametro() {
        return diametro;
    }

    public int getNumGalhos() {
        return numGalhos;
    }

    public TipoArv getTipo() {
        return tipo;
    }
}
