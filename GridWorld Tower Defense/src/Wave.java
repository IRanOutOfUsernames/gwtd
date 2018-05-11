import java.util.ArrayList;

public class Wave {

	private ArrayList<WavePart> parts;
	private int ticks;

	// Constructs a wave of enemies consisting of different wave parts
	public Wave(ArrayList<WavePart> p) {
		parts = p;
	}

	// Spawns this wave
	// precondition: subwaves are sorted by spawn time
	// postcondition: entire wave has been spawned
	public void spawn() {
		for (int i = 0; i < parts.size(); i++) {
			if (ticks == parts.get(i).getStartTime()) {
				parts.get(i).spawn();
				parts.remove(i);
				i--;
			}
		}
	}
}