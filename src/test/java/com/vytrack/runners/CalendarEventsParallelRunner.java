package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/parallel-cucumber1.json",
                  "rerun:target/rerun.txt"
        },
        features = "src/test/resources/com/vytrack/features/calendar-events",
        glue = "com/vytrack/step_definitions"
)
public class CalendarEventsParallelRunner {
}
