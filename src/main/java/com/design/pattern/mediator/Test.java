package com.design.pattern.mediator;

import java.time.LocalDateTime;

public class Test extends Activity {


    public Test(final Dashboard dashboard, final LocalDateTime activityStartTime, final LocalDateTime activityEndTime, final String name) {
        super(dashboard, activityStartTime, activityEndTime, name);
    }

    @Override
    public void notifyUsers() {
        dashboard.notifyStudents(this);
    }
}
