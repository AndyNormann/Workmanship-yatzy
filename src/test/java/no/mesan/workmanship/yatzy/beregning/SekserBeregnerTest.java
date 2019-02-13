
package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SekserBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenSeksere_skalGiNullPoeng() {
        final SekserBeregner beregner = new SekserBeregner();
        final Kast kastUtenSeksere = new Kast(1, 2, 5, 3, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenSeksere);

        assertEquals(0, poeng);
    }

    @Test
    public void beregnPoengForKast_medEnSeksere_skalGiSeksPoeng() {
        final SekserBeregner beregner = new SekserBeregner();
        final Kast kastMedEnSekser = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastMedEnSekser);

        assertEquals(6, poeng);
    }

    @Test
    public void beregnPoengForKast_medBareSeksere_skalGiTrettiPoeng() {
        final SekserBeregner beregner = new SekserBeregner();
        final Kast kastMedBareSeksere = new Kast(6, 6, 6, 6, 6);

        final int poeng = beregner.beregnPoengForKast(kastMedBareSeksere);

        assertEquals(30, poeng);
    }
}
