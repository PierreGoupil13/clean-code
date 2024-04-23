package ex2;

public class LivretA extends CompteBancaire {

    /**
     * Crée un nouveau livret A avec le solde initial et le taux de rémunération spécifiés.
     *
     * @param solde            Le solde initial du livret A.
     * @param tauxRemuneration Le taux de rémunération annuel du livret A.
     */
    public LivretA(double solde, double tauxRemuneration) {
        super("LA", solde, 0, tauxRemuneration);
    }
}
