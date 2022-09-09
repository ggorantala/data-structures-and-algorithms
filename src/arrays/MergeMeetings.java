package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeMeetings {
    public static void main(String[] args) {
        final List<Meeting> meetings =
            Arrays.asList(
                new Meeting(0, 1),
                new Meeting(3, 5),
                new Meeting(4, 8),
                new Meeting(10, 12),
                new Meeting(9, 10));

        System.out.println(mergeRanges(meetings));
    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings) {
        // we need to have a list to return
        List<Meeting> mergedMeetings = new ArrayList<>();
        // sort the list
        Collections.sort(meetings, (m1, m2) -> m1.getStartTime() - m2.getStartTime());
        mergedMeetings.add(meetings.get(0));

        for (Meeting currentMeeting : meetings) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            // if the current meeting overlaps with the last merged meeting, use the
            // later end time of the two
            if (lastMergedMeeting.getEndTime() >= currentMeeting.getStartTime()) {
                lastMergedMeeting.setEndTime(
                    Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

                // add the current meeting since it doesn't overlap
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
    }

    public static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof final Meeting meeting)) {
                return false;
            }
            return startTime == meeting.startTime && endTime == meeting.endTime;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = result * 31 + startTime;
            result = result * 31 + endTime;
            return result;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", startTime, endTime);
        }
    }
}
