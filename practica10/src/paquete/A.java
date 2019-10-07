package paquete;
import processing.core.PApplet;

public class A extends PApplet {
	public static void main(String[] args) {
		PApplet.main("paquete.A");
	}

    @Override
	public void settings(){
		size(800,800);
	}

	@Override
	public void setup(){
	}

	@Override
	public void draw() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					fill(0);
				} else {
					fill(255);
				}
				rect(j * (800 / 8), i * (800 / 8), (800 / 8), (800 / 8));
			}
		}
	}


}