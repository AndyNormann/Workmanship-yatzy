package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Kast;
import no.mesan.workmanship.yatzy.domene.Poeng;

public class ManglerBeregner implements KastBeregner {

    private final String hva;

    public ManglerBeregner(final String hva) {
        this.hva = hva;
    }

    @Override
    public Integer beregnPoengForKast(Kast kast) {
        System.out.println(hva);
        return Poeng.NULL.verdi();
    }
}
