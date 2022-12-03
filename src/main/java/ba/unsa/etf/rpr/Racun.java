package ba.unsa.etf.rpr;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    private Double prekoracenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
        odobrenjePrekoracenja=false;
    }
    private boolean provjeriOdobrenjePrekoracenja(Double iznos) {
        return prekoracenje > iznos;
    }
    public boolean izvrsiUplatu(Double uplata) {
        stanjeRacuna = stanjeRacuna + uplata;
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata) {
        if(stanjeRacuna + prekoracenje < isplata) return false;
        stanjeRacuna = stanjeRacuna - isplata;
        return true;
    }
    public void odobriPrekoracenje (Double iznos) {
        prekoracenje=iznos;
        odobrenjePrekoracenja=true;
    }
}
