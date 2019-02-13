package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToereBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenToere_skalGiNullPoeng() {
        final ToereBeregner beregner = new ToereBeregner();
        final Kast kastUtenToere = new Kast(1, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenToere);

        assertEquals(0, poeng);
    }
    @Test
    public void beregnPoengForKast_medEnToer_skalGiEtPoeng() {
        final ToereBeregner beregner = new ToereBeregner();
        final Kast kastMedEnToer = new Kast(1, 3, 2, 6, 5);

        final int poeng = beregner.beregnPoengForKast(kastMedEnToer);

        assertEquals(2, poeng);
    }
    @Test
    public void beregnPoengForKast_medFemToere_skalGiEtPoeng() {
        final ToereBeregner beregner = new ToereBeregner();
        final Kast kastMedFemToer = new Kast(2, 2, 2, 2, 2);

        final int poeng = beregner.beregnPoengForKast(kastMedFemToer);

        assertEquals(10, poeng);
    }
}
