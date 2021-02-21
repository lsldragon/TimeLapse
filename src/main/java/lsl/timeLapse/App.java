package lsl.timeLapse;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static final String ADB_COMMAND = "adb shell input tap 730 2393"; // Vertical screen
	public static final String ADB_COMMAND2 = "adb shell input tap 2389 750"; // Horizontal screen

	public static void main(String[] args) {
		runTimeLapse();
	}

	public static void runTimeLapse() {

		final Runtime runtime = Runtime.getRuntime();
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

			int i = 0;

			public void run() {
				try {

					runtime.exec(ADB_COMMAND2);
					i++;
					System.out.println("Capture photos number: " + i);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}, 0, 10, TimeUnit.SECONDS);

	}
}
