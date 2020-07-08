package davegagnat.com.a6_top10downloadapp;

import java.util.ArrayList;

public class ParsApplications {
    private static final String TAG = "ParsApplications";
    private ArrayList<FeedEntry> applications;

    public ParsApplications() {
        this.applications = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }
}
