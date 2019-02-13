package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.beregning.enkeltberegner.TreerBeregner;
import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreerBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenTreere_skalGiNullPoeng() {
        final TreerBeregner beregner = new TreerBeregner();
        final Kast kastUtenEnere = new Kast(1, 2, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }

    @Test
    public void beregnPoengForKast_medEnTreere_skalGiTrePoeng() {
        final TreerBeregner beregner = new TreerBeregner();
        final Kast kastUtenEnere = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(3, poeng);
    }

    @Test
    public void beregnPoengForKast_medBareTreere_skalGiFemtenPoeng() {
        final TreerBeregner beregner = new TreerBeregner();
        final Kast kastUtenEnere = new Kast(3, 3, 3, 3, 3);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(15, poeng);
    }
}
