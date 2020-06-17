package hal;
import java.awt.*;

public class hal {
	public static void main(String[] args) throws Exception{
		Robot hal = new Robot();
		//Random random = new Random();
		int i = 0;
		while(true){
			hal.delay(100*60);
			double x = MouseInfo.getPointerInfo().getLocation().getX();
			double y = MouseInfo.getPointerInfo().getLocation().getY();
			if (i == 0) {
				x = x + 1;
				y = y + 1;
				i = 1;
			}else {
				x = x - 1;
				y = y - 1;
				i = 0;
			}
			hal.mouseMove((int)x,(int)y);
		}
	}
	
}
