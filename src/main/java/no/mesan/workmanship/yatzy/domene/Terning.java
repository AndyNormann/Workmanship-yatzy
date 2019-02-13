package no.mesan.workmanship.yatzy.domene;

public class Terning {

    private Integer verdi;

    public Terning(Integer verdi) {
        this.verdi = verdi;
    }

    public boolean erLik(final Oyne oye) {
        return oye.verdi() == this.verdi;
    }

    public Integer asInt() {
        return this.verdi;
    }
}
