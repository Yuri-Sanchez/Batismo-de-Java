package PrimeiroResumao;

public enum Bijus {
    SHUKAKU(1,"Shukaku","Gaara"),
    MATATABI(2, "Matatabi", "Yugito Nii"),
    ISOBU(3, "Isobu", "Yagura"),
    SON_GOKU(4, "Son Goku", "Roshi"),
    KOKUO(5, "Kokuo", "Han"),
    SAIKEN(6, "Saiken", "Utakata"),
    CHOMEI(7, "Chomei", "Fuu"),
    GYUKI(8, "Gyuki", "Killer Bee"),
    KURAMA(9, "Kurama", "Naruto Uzumaki");

    private int numeroDeCaldas;
    private String nomeBiju;
    private String nomeDoPortador;

    Bijus() {
    }

    Bijus(int numeroDeCaldas, String nomeBiju, String nomeDoPortador) {
        this.numeroDeCaldas = numeroDeCaldas;
        this.nomeBiju = nomeBiju;
        this.nomeDoPortador = nomeDoPortador;
    }

    public int getNumeroDeCaldas() {
        return numeroDeCaldas;
    }

    public String getNomeBiju() {
        return nomeBiju;
    }

    public String getNomeDoPortador() {
        return nomeDoPortador;
    }
}
