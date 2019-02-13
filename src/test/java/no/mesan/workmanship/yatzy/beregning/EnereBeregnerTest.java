package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.beregning.enkeltberegner.EnkeltBeregner;
import no.mesan.workmanship.yatzy.domene.Kast;
import no.mesan.workmanship.yatzy.domene.Oyne;
import no.mesan.workmanship.yatzy.domene.Poeng;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnereBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenEnere_skalGiNullPoeng() {
        final EnkeltBeregner beregner = new EnkeltBeregner(Oyne.EN, Poeng.EN);
        final Kast kastUtenEnere = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }

    @Test
    public void beregnPoengForKast_medEnEnere_skalGiEtPoeng() {
        final EnkeltBeregner beregner = new EnkeltBeregner(Oyne.EN, Poeng.EN);
        final Kast kastUtenEnere = new Kast(2, 1, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(1, poeng);
    }

    @Test
    public void beregnPoengForKast_medBareEnere_skalGiSeksPoeng() {
        final EnkeltBeregner beregner = new EnkeltBeregner(Oyne.EN, Poeng.EN);
        final Kast kastUtenEnere = new Kast(1, 1, 1, 1, 1);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(5, poeng);
    }

}
