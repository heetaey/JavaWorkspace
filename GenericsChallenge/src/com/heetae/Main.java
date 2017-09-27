package com.heetae;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaid Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremental = new Team<>("Fremental");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremental);

        melbourne.matchResult(fremental, 2, 1);
        melbourne.matchResult(adelaideCrows, 3, 0);

        adelaideCrows.matchResult(fremental, 2, 1);
        footballLeague.showLeagueTable();



    }

}
