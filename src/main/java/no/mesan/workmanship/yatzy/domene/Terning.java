package no.mesan.workmanship.yatzy.domene;

public class Terning {

    private Integer verdi;

    public Terning(Integer verdi) {
        this.verdi = verdi;
    }

    Integer asInt() {
        return this.verdi;
    }

    public Boolean erLik(final Oyne oyne) {
        return this.verdi.equals(oyne.verdi());
    }
}
