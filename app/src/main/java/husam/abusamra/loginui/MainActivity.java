package husam.abusamra.loginui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bg1;
    Button btnget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bg1 =  findViewById(R.id.bg1);
        btnget =  findViewById(R.id.btnSignup);

        bg1.animate().scaleX((float)1.5).scaleY((float)1.5).setDuration(20000).start();

        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(a);
            }
        });

    }
}