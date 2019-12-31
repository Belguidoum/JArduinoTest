import bc.chouaib.arduino.JArduino;
import bc.chouaib.arduino.JArduinoControle;

public class TestClass {

	public static void main(String[] args) {

		JArduinoControle arduino = new JArduino("COM4");
		
		while (true) {
			arduino.analogRead(0);
			
		}

	}

}
