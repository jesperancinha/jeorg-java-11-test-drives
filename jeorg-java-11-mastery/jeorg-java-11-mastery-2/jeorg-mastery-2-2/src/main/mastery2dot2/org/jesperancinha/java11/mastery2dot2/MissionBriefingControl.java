package org.jesperancinha.java11.mastery2dot2;

import java.time.LocalDateTime;

public interface MissionBriefingControl extends BriefingDate, BriefingTrajectory {
    String getDestinationLocation();

    String getDestinationLocation(MissionData missionData);

    LocalDateTime getBriefingDate();

    String getOriginLocation();
}
