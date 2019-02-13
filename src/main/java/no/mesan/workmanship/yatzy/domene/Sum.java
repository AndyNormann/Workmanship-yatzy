package no.mesan.workmanship.yatzy.domene;

import no.mesan.workmanship.yatzy.domene.Poeng;

public final class Sum {
  final int sum;
  
  public Sum() {
    this.sum = 0;
  }
  public Sum(int verdi) {
    this.sum = verdi;
  }

  public final Sum leggTil(Poeng poeng) {
    return new Sum(sum + poeng.verdi());
  }
  public final int verdi() {
    return this.sum;
  }
}