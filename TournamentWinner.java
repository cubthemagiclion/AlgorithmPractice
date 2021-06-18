package src;
import java.util.*;

public class TournamentWinner {

	public TournamentWinner() {
		// TODO Auto-generated constructor stub
	}
	  public String tournamentWinner(
		  ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		  HashMap<String, Integer> scores = new HashMap<String, Integer>();
		  for (int i = 0; i < results.size(); i++) {
			  String teamA = competitions.get(i).get(0);
			  String teamB = competitions.get(i).get(1);
			  String winner = results.get(i) == 1 ? teamA : teamB;
			  if(scores.containsKey(winner))
				  scores.replace(winner, scores.get(winner) + 3);
			  else
				  scores.put(winner, 3);
		  }
		  int max = 0;
		  String winnerTeam = "";
		  for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			  if (max < entry.getValue()) {
				  max = entry.getValue();
				  winnerTeam = entry.getKey();
			  }
			}
		    // Write your code here.
		    return winnerTeam;
		  }

	public static void main(String[] args) {

	}

}
