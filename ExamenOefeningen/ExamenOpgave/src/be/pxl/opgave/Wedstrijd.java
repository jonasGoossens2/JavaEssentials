package be.pxl.opgave;
/* naam: Goossens Jonas*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Wedstrijd implements DatumVerblijkbaar{
    private static final DateTimeFormatter FORMAT = null;
    private LocalDateTime wedstrijdDatum;
    private Team team1;
    private Team team2;
    private Scheidsrechter scheidsrechter;
    private int scoreTeam1;
    private int scoreTeam2;

    public Wedstrijd(Team team1, Team team2, Scheidsrechter scheidsrechter, int dag, int maand, int jaar, int uur, int minuut){
        this.team1 = team1;
        this.team2 = team2;
        this.scheidsrechter = scheidsrechter;
        this.wedstrijdDatum = LocalDateTime.of(LocalDate.of(jaar, maand, dag),LocalTime.of(uur, minuut));
    }

    public void setScore(int score1, int score2){
        this.scoreTeam1 = score1;
        this.scoreTeam2 = score2;
    }
    public Boolean spelerIdKomtVoor(String id){
        if(team1.spelerIdKomtVoor(id) || team2.spelerIdKomtVoor(id)){
            return true;
        }
        return false;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("TEAM1");
        builder.append(team1.toString());
        builder.append(team2.toString());
        builder.append(wedstrijdDatum);
        if(wedstrijdDatum.isAfter(LocalDateTime.now())){
            builder.append(scoreTeam1).append(" ").append(scoreTeam2);
        }
        return builder.toString();
    }

   public long berekenAantalMinutenNa(LocalDateTime aantalMinuten){
        return ChronoUnit.MINUTES.between(wedstrijdDatum, wedstrijdDatum);
    }

    public LocalDateTime getWedstrijdDatum() {
        return wedstrijdDatum;
    }
}

