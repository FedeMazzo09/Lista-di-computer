public class Computer implements Comparable<Computer> {
    private String marca;
    private String processore;
    private int capacitaRAM;

    public Computer(String marca, String processore, int capacitaRAM) {
        this.marca = marca;
        this.processore = processore;
        this.capacitaRAM = capacitaRAM;
    }

    public int compareTo(Computer c) {
        if (this.capacitaRAM < c.capacitaRAM)
            return -1;
        else if (this.capacitaRAM == c.capacitaRAM)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return marca + " - " + processore + " - " + capacitaRAM + "GB";
    }
}
