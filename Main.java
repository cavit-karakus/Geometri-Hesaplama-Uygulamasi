interface Sekil {
    double alanHesapla();
    double cevreHesapla();
}

class Dikdortgen implements Sekil {
    double uzunKenar;
    double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return uzunKenar * kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunKenar + kisaKenar);
    }
}

class Daire implements Sekil {
    double yariCap;

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yariCap * yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yariCap;
    }
}

public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(5, 3);
        double dikdortgenAlani = dikdortgen.alanHesapla();
        double dikdortgenCevresi = dikdortgen.cevreHesapla();
        System.out.println("Dikdörtgen Alanı: " + dikdortgenAlani);
        System.out.println("Dikdörtgen Çevresi: " + dikdortgenCevresi);

        Daire daire = new Daire(4);
        double daireAlani = daire.alanHesapla();
        double daireCevresi = daire.cevreHesapla();
        System.out.println("Daire Alanı: " + daireAlani);
        System.out.println("Daire Çevresi: " + daireCevresi);
    }
}