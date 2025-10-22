package com.design.pattern.mediator;

import java.time.LocalDateTime;

public class Meet extends Activity {

    public Meet(final Dashboard dashboard, final LocalDateTime activityStartTime, final LocalDateTime activityEndTime, final String name) {
        super(dashboard, activityStartTime, activityEndTime, name);
    }

    @Override
    public void notifyUsers() {
        dashboard.notifyTeachers(this);
    }
}
