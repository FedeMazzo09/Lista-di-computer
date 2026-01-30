public class Test {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Computer c1 = new Computer("Dell", "i5", 8);
        Computer c2 = new Computer("HP", "i7", 16);
        Computer c3 = new Computer("Lenovo", "Ryzen 5", 8);

        lista.aggiungiOrdinatoPerRAM(c1);
        lista.aggiungiOrdinatoPerRAM(c2);
        lista.aggiungiOrdinatoPerRAM(c3);

        lista.stampa();
    }
}
