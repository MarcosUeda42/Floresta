public class Arvore {
    private float altura;
    private float diametro;
    private int numGalhos;
    private TipoArv tipo;
    private float x; 
    private float y;  

    public Arvore(float altura, float diametro, int numGalhos, TipoArv tipo, float x, float y) {
        this.altura = altura;
        this.diametro = diametro;
        this.numGalhos = numGalhos;
        this.tipo = tipo;
        this.x = x;
        this.y = y;
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

    public float getX() { return x; }
    public float getY() { return y; }
}
