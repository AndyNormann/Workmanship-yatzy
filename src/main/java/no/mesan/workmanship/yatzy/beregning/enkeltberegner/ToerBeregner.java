package no.mesan.workmanship.yatzy.beregning.enkeltberegner;

import no.mesan.workmanship.yatzy.beregning.KastBeregner;
import no.mesan.workmanship.yatzy.domene.*;

public class ToerBeregner implements KastBeregner {

    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(terning.erLik(Oyne.TO) ? Poeng.TO : Poeng.NULL);
        }

        return sum.verdi();
    }
}
