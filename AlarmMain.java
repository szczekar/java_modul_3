package pl.modultrzeci_java;

public class AlarmMain {

	public static void main(String[] args) {
		AlarmClock time = new AlarmClock(23, 48); // ustawiamy godzine na 23:48
		time.displayTime(); // wyswietlamy czas
		time.setAlarm(6, 15); // ustawiamy alarm na 6:15

		for (int i = 0; i < 500; i++)
		{	
		time.timeTick();
		}

		time.displayTime();
	}

}
