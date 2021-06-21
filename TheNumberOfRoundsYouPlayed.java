package src;

public class TheNumberOfRoundsYouPlayed {

	public TheNumberOfRoundsYouPlayed() {
		// TODO Auto-generated constructor stub
	}
    public int numberOfRounds(String startTime, String finishTime) {
    	int res = 0;
        int starthour = Integer.parseInt(startTime.substring(0, 2));
        int startminute = Integer.parseInt(startTime.substring(3, 5));
        int finishhour = Integer.parseInt(finishTime.substring(0, 2));
        int finishminute = Integer.parseInt(finishTime.substring(3, 5));

        int startTimeInMinutes = starthour * 60 + startminute;
        int finishTimeInMinutes = finishhour * 60 + finishminute;

        if(startTimeInMinutes > finishTimeInMinutes) {
        	finishhour = finishhour + 24;
        	finishTimeInMinutes = finishhour * 60 + finishminute;
        }
        if(startminute % 15 != 0) {
        	startTimeInMinutes += (15 - (startminute%15));
        }
        
        res += (finishTimeInMinutes - startTimeInMinutes)/15;
        

        if (res < 0)
        	return 0;
        return res;
    }
	public static void main(String[] args) {
		TheNumberOfRoundsYouPlayed a = new TheNumberOfRoundsYouPlayed();
		//int res = a.numberOfRounds("12:01", "12:44");
		//int res2 = a.numberOfRounds("20:00", "06:00");
		int res3 = a.numberOfRounds("00:01", "00:00");
		System.out.print(res3);
		// TODO Auto-generated method stub

	}

}
