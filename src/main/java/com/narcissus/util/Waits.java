package com.narcissus.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.narcissus.keywords.Keyword;

public class Waits {
	WebDriverWait wait = null;

	public Waits() {
		wait = new WebDriverWait(Keyword.driver, Duration.ofSeconds(30));
		wait.withMessage("Timeout for while waiting for the element");
		wait.pollingEvery(Duration.ofMillis(500));

	}

	public void forDuration(long seconds) {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("ss");
		LocalDateTime now = LocalDateTime.now();
		String time = form.format(now);

		long startTime = Long.valueOf(time);
		long endTime = startTime + seconds;
		while (startTime < endTime) {
			form = DateTimeFormatter.ofPattern("ss");
			now = LocalDateTime.now();
			time = form.format(now);
			startTime = Long.valueOf(time);
		}
	}

}
