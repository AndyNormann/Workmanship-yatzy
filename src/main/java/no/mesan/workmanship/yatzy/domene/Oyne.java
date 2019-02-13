package no.mesan.workmanship.yatzy.domene;

public enum Oyne {
  EN(1), TO(2), TRE(3), FIRE(4), FEM(5), SEKS(6);

  private final int verdi;

  public final int verdi() {
    return verdi;
  }

  private Oyne(final int verdi) {
    this.verdi = verdi;
  }
}