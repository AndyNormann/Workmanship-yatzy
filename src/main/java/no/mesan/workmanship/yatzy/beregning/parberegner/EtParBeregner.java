package no.mesan.workmanship.yatzy.beregning.parberegner;

import no.mesan.workmanship.yatzy.beregning.KastBeregner;
import no.mesan.workmanship.yatzy.domene.*;

public class EtParBeregner implements KastBeregner {
    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(terning.erLik(Oyne.EN) ? Poeng.EN : Poeng.NULL);
        }

        return sum.verdi();
    }
}
