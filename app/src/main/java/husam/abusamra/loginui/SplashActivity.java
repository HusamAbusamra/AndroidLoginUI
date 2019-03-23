package husam.abusamra.loginui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

        private static int timeOut =3000;
        Animation animfrombottom ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent nextIntent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(nextIntent);
                    finish();
                }
            },timeOut);

            animfrombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

            TextView txt = findViewById(R.id.appIcon);
            txt.setAnimation(animfrombottom);

        }
    }

