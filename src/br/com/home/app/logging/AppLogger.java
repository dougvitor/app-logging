package br.com.home.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppLogger {
	
	public static void info(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(String.format("[INFO] %s - %s", sdf.format(new Date()), msg));
	}
}
