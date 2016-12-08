package sh.dfm.retrofit_19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import retrofit.RestAdapter;
import retrofit.client.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://192.168.20.1/tmp")
                .build();
        API api = restAdapter.create(API.class);
        final API service = restAdapter.create(API.class);

        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                Response r = service.getUsers();
                Log.w("MainActivity", "Response = " +r  );
            }
        });
        t.start();



    }
}



