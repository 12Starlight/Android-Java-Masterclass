package davegagnat.com.a6_top10downloadapp;

// opt + return imports classes that are being used
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        while(true) { // this stops the app from finishing and causes a crash
//            int x = 1;
//        }
    }

    // Inner Class
    private class DownloadData extends AsyncTask<String, Void, String> {
        // ctr + O to get list of methods from this class that can be overrode
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }
}