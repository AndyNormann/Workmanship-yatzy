package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.*;

public class TreerBeregner implements KastBeregner{

    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(terning.erLik(Oyne.TRE) ? Poeng.TRE : Poeng.NULL);
        }

        return sum.verdi();
    }
}
