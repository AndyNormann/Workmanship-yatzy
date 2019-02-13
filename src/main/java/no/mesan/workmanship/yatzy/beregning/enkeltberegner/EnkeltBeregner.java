package no.mesan.workmanship.yatzy.beregning.enkeltberegner;

import no.mesan.workmanship.yatzy.beregning.KastBeregner;
import no.mesan.workmanship.yatzy.domene.*;

public class EnkeltBeregner implements KastBeregner {

    private final Oyne oyne;

    private final Poeng poeng;

    public EnkeltBeregner(final Oyne oyne, final Poeng poeng) {
        this.oyne = oyne;
        this.poeng = poeng;
    }

    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(terning.erLik(oyne) ? poeng : Poeng.NULL);
        }

        return sum.verdi();
    }
}
