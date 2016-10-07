package klaser.com.guatuneed.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import guatuneed.klaser.com.guatuneed.R;

public class Recovery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_recovery);
        final Button Iniciar_sesion = (Button) findViewById(R.id.button13);
        final Button Crear_cuenta = (Button) findViewById(R.id.button14);
        Crear_cuenta.setOnClickListener(new Button.OnClickListener(){
            public void  onClick(View args0){
                Intent Iniciar_sesion = new Intent(getApplicationContext(),SignUp.class);
                startActivity(Iniciar_sesion);
            }
        });
        Iniciar_sesion.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0){
                Intent Open_sesion = new Intent(getApplicationContext(),SignIn.class);
                        startActivity(Open_sesion);
            }
        });

    }
}
