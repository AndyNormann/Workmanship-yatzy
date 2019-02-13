package no.mesan.workmanship.yatzy.beregning.enkeltberegner;

import no.mesan.workmanship.yatzy.beregning.KastBeregner;
import no.mesan.workmanship.yatzy.domene.*;

public final class SekserBeregner implements KastBeregner {

    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(terning.erLik(Oyne.SEKS) ? Poeng.SEKS : Poeng.NULL);
        }

        return sum.verdi();
    }
}
