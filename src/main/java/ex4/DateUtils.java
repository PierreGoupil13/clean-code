package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Cette classe fournit des méthodes utilitaires pour formater les dates.
 */
public class DateUtils {

    /**
     * Formate la date selon le motif spécifié.
     *
     * @param pattern Le motif de formatage de la date.
     * @param date    La date à formater.
     * @return La date formatée selon le motif spécifié.
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = creerFormateur(pattern);
        return formateur.format(date);
    }

    /**
     * Formate la date selon le motif par défaut "dd/MM/yyyy HH:mm:ss".
     *
     * @param date La date à formater.
     * @return La date formatée selon le motif par défaut.
     */
    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }

    /**
     * Crée et retourne un formateur de date avec le motif spécifié.
     *
     * @param pattern Le motif de formatage de la date.
     * @return Un formateur de date configuré avec le motif spécifié.
     */
    private static SimpleDateFormat creerFormateur(String pattern) {
        return new SimpleDateFormat(pattern);
    }
}

