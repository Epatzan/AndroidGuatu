package klaser.com.guatuneed.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import guatuneed.klaser.com.guatuneed.R;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            final Button recuperar = (Button) findViewById(R.id.button8);
         final Button Crear_cuenta= (Button) findViewById(R.id.button9);

        recuperar.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0){
                Intent Open_recovey= new Intent(getApplicationContext(),Recovery.class);
                startActivity(Open_recovey);
            }
        });

        Crear_cuenta.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent Open_cuenta = new Intent(getApplicationContext(),SignUp.class);
                startActivity(Open_cuenta);

            }
        });
    }
}
