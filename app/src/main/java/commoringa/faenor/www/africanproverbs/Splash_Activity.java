package commoringa.faenor.www.africanproverbs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;



public class Splash_Activity extends Activity  {

    //Set the time the splash scree time will take
    private static int splashInterval = 3000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set the view of this activity to be Splash.xml
        setContentView(R.layout.splash_activity);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                //Starting the splash activity
                Intent i = new Intent(Splash_Activity.this, Main.class);
                startActivity(i);


                //This exits the SplashScreen activity
                this.finish();
            }

            private void finish() {

            }
        }, splashInterval);

    }

}