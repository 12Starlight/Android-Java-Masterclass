package davegagnat.com.a6_top10downloadapp;

// opt + return imports classes that are being used
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //logt tab
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        while(true) { // this stops the app from finishing and causes a crash
//            int x = 1;
//        }

        Log.d(TAG, "onCreate: starting AsyncTask");
        DownloadData downloadData = new DownloadData();
        downloadData.execute("URL goes here");
        Log.d(TAG, "onCreate: onCreate: done");
    }

    // Inner Class
    private class DownloadData extends AsyncTask<String, Void, String> {
        private static final String TAG = "DownloadData";


        // ctr + O to get list of methods from this class that can be overrode
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: parameter is " + s);
        }

        @Override
        protected String doInBackground(String... strings) {
            Log.d(TAG, "doInBackground: starts with " + strings[0]);
            return "doInBackground completed.";
        }
    }
}