package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.beregning.enkeltberegner.ToerBeregner;
import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToerBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenToere_skalGiNullPoeng() {
        final ToerBeregner beregner = new ToerBeregner();
        final Kast kastUtenEnere = new Kast(1, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }

    @Test
    public void beregnPoengForKast_medEnToer_skalGiToPoeng() {
        final ToerBeregner beregner = new ToerBeregner();
        final Kast kastUtenEnere = new Kast(2, 1, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(2, poeng);
    }

    @Test
    public void beregnPoengForKast_medBareToere_skalGiSeksPoeng() {
        final ToerBeregner beregner = new ToerBeregner();
        final Kast kastUtenEnere = new Kast(2, 2, 2, 2, 2);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(10, poeng);
    }
}
