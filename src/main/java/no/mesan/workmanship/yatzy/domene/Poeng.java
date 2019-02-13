package no.mesan.workmanship.yatzy.domene;

public enum Poeng {
  NULL(0), EN(1), TO(2), TRE(3), FIRE(4), FEM(5), SEKS(6);

  private final int verdi;

  public final int verdi() {
    return verdi;
  }

  private Poeng(final int verdi) {
    this.verdi = verdi;
  }
}