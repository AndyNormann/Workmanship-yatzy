package no.mesan.workmanship.yatzy.domene;

public final class Sum {

    private final int sum;

    public Sum() {
        this.sum = 0;
    }

    private Sum(final int sum) {
        this.sum = sum;
    }

    public final Sum leggTil(final Poeng poeng) {
        return new Sum(sum + poeng.verdi());
    }

    public Integer verdi() {
        return this.sum;
    }
}
