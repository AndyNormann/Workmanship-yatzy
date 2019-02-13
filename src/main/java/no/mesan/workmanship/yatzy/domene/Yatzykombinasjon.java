package no.mesan.workmanship.yatzy.domene;

import no.mesan.workmanship.yatzy.beregning.enkeltberegner.*;
import no.mesan.workmanship.yatzy.beregning.KastBeregner;
import no.mesan.workmanship.yatzy.beregning.ManglerBeregner;

public enum Yatzykombinasjon implements KastBeregner {
    ENERE("Enere", new EnkeltBeregner(Oyne.EN, Poeng.EN)),
    TOERE("Toere", new EnkeltBeregner(Oyne.TO, Poeng.TO)),
    TREERE("Treere", new EnkeltBeregner(Oyne.TRE, Poeng.TRE)),
    FIRERE("Firere", new EnkeltBeregner(Oyne.FIRE, Poeng.FIRE)),
    FEMMERE("Femmere", new EnkeltBeregner(Oyne.FEM, Poeng.FEM)),
    SEKSERE("Seksere", new EnkeltBeregner(Oyne.SEKS, Poeng.SEKS)),
    ETT_PAR("Ett par", null),
    TO_PAR("To par", null),
    TRE_LIKE("Tre like", null),
    FIRE_LIKE("Fire like", null),
    LITEN_STRAIGHT("Liten straight", null),
    STOR_STRAIGHT("Stor straight", null),
    HUS("Hus", null),
    SJANSE("Sjanse", null),
    YATZY("Yatzy", null);

    private final String navn;
    private KastBeregner faktiskBeregner;

    Yatzykombinasjon(final String navn, final KastBeregner faktiskBeregner) {
        this.navn = navn;
        this.faktiskBeregner = faktiskBeregner== null? new ManglerBeregner("Kan ikke beregne " +navn) : faktiskBeregner;
    }

    @Override
    public Integer beregnPoengForKast(final Kast kast) {
        return this.faktiskBeregner.beregnPoengForKast(kast);
    }

    KastBeregner getFaktiskBeregner() {
        return this.faktiskBeregner;
    }

    void setFaktiskBeregner(final KastBeregner faktiskBeregner) {
        this.faktiskBeregner = faktiskBeregner;
    }

    @Override
    public String toString() {
        return this.navn;
    }
}
