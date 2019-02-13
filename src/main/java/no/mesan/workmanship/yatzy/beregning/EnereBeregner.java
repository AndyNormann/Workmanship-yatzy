package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Terning;
import no.mesan.workmanship.yatzy.domene.Kast;
import no.mesan.workmanship.yatzy.domene.Oyne;
import no.mesan.workmanship.yatzy.domene.Poeng;
import no.mesan.workmanship.yatzy.domene.Sum;

public final class EnereBeregner implements KastBeregner {

    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(
                terning.erLik(Oyne.EN) ? 
                Poeng.EN : Poeng.NULL);
        }
        return new Integer(sum.verdi());
    }
}
