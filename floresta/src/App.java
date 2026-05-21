import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Map mapa = new Map(new ArvFactory());
        Random rand = new Random();

        String[] especies = {
            "Ipê-amarelo", "Ipê-roxo", "Jacarandá", "Pau-brasil", "Cedro",
            "Mogno", "Araucária", "Carvalho", "Pinheiro", "Eucalipto",
            "Mangueira", "Limoeiro", "Abacateiro", "Jatobá", "Jequitibá",
            "Seringueira", "Castanheira", "Baobá", "Salgueiro", "Oliveira",
            "Cerejeira", "Macieira", "Pereira", "Figueira", "Coqueiro",
            "Palmeira-imperial", "Acácia", "Aroeira", "Embaúba", "Guapuruvu",
            "Paineira", "Angico", "Copaíba", "Cumaru", "Freixo",
            "Nogueira", "Bordo", "Álamo", "Teca", "Amendoeira",
            "Cajueiro", "Sapucaia", "Canafístula", "Pitangueira", "Jabuticabeira",
            "Gameleira", "Imbuia", "Pau-ferro", "Canela", "Castanhola"
        };

        for (int i = 0; i < 2000; i++) {
            String especie = especies[rand.nextInt(especies.length)];
            int x = rand.nextInt(1000);
            int y = rand.nextInt(1000);
            int altura = rand.nextInt(20) + 1; // Altura entre 1 e 20 metros
            int diametro = rand.nextInt(50) + 1; // Diâmetro entre 1 e 50 cm
            int numGalhos = rand.nextInt(10) + 1; // Número de galhos entre 1 e 10
            mapa.plantarArvore(especie, x, y, altura, diametro, numGalhos);
            System.out.println("Plantar árvore: " + especie + " na posição (" + x + ", " + y + 
                ") com altura " + altura + "m, diâmetro " + diametro + "cm e " + numGalhos + " galhos.");
        }


        System.out.println("\nTotal de espécies únicas: " + mapa.getFactorySize());
        System.out.println("Memória usada: " + 
            (mapa.calcularMemoria() / 1024.0) + " KB");
        System.out.println("Memória usada sem Flyweight: " + 
            (mapa.getArvores().size() * 78 / 1024.0) + " KB");
    }

}
