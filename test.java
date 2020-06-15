package test;
import java.awt.*;
import java.util.*;

public class test {
	public static void main(String[] args) throws Exception{
		Robot hal = new Robot();
		//Random random = new Random();
		while(true){
			hal.delay(100*60);
			double x = (MouseInfo.getPointerInfo().getLocation().getX() + 1)%2360;
			double y = (MouseInfo.getPointerInfo().getLocation().getY() + 1)%1920;
			hal.mouseMove((int)x,(int)y);
		}
	}
	
}
