package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FemmerBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenTreere_skalGiNullPoeng() {
        final FemmerBeregner beregner = new FemmerBeregner();
        final Kast kastUtenEnere = new Kast(1, 2, 4, 6, 3);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }

    @Test
    public void beregnPoengForKast_medEnTreere_skalGiTrePoeng() {
        final FemmerBeregner beregner = new FemmerBeregner();
        final Kast kastUtenEnere = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(5, poeng);
    }

    @Test
    public void beregnPoengForKast_medBareTreere_skalGiFemtenPoeng() {
        final FemmerBeregner beregner = new FemmerBeregner();
        final Kast kastUtenEnere = new Kast(5, 5, 5, 5, 5);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(25, poeng);
    }

}
