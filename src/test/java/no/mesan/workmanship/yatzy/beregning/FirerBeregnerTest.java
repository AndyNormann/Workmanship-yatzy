package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.domene.Kast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirerBeregnerTest {
    @Test
    public void beregnPoengForKast_medIngenTreere_skalGiNullPoeng() {
        final FirerBeregner beregner = new FirerBeregner();
        final Kast kastUtenEnere = new Kast(1, 2, 5, 6, 3);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(0, poeng);
    }

    @Test
    public void beregnPoengForKast_medEnTreere_skalGiTrePoeng() {
        final FirerBeregner beregner = new FirerBeregner();
        final Kast kastUtenEnere = new Kast(2, 3, 5, 6, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(4, poeng);
    }

    @Test
    public void beregnPoengForKast_medBareTreere_skalGiFemtenPoeng() {
        final FirerBeregner beregner = new FirerBeregner();
        final Kast kastUtenEnere = new Kast(4, 4, 4, 4, 4);

        final int poeng = beregner.beregnPoengForKast(kastUtenEnere);

        assertEquals(20, poeng);
    }
}
