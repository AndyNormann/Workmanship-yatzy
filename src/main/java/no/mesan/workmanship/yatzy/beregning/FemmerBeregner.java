package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.*;

public final class FemmerBeregner implements KastBeregner{
    @Override
    public final Integer beregnPoengForKast(final Kast kast) {
        Sum sum = new Sum();
        for (Terning terning : kast) {
            sum = sum.leggTil(terning.erLik(Oyne.FEM) ? Poeng.FEM : Poeng.NULL);
        }

        return sum.verdi();
    }
}
