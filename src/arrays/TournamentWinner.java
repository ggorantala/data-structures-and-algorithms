package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TournamentWinner {

    public static int HOME_TEAM_WON = 1;

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0, 0, 1));
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();

        competitions.add(new ArrayList<>(Arrays.asList("HTML", "C#")));
        competitions.add(new ArrayList<>(Arrays.asList("C#", "PYTHON")));
        competitions.add(new ArrayList<>(Arrays.asList("PYTHON", "HTML")));

        System.out.println(tournamentWinner(competitions, result));
    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        HashMap<String, Integer> lookup = new HashMap<>();
        String currentBestTeam = "";
        lookup.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);

            String currentWinner = results.get(i) == HOME_TEAM_WON ? homeTeam : awayTeam;

            if (!lookup.containsKey(currentWinner)) {
                lookup.put(currentWinner, 0);
            }

            lookup.put(currentWinner, lookup.get(currentWinner) + 3);

            if (lookup.get(currentWinner) > lookup.get(currentBestTeam)) {
                currentBestTeam = currentWinner;
            }
        }
        return currentBestTeam;
    }
}
