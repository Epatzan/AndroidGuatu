package klaser.com.guatuneed.home.tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import guatuneed.klaser.com.guatuneed.R;



/**
 * Created by enrique on 25/04/16.
 */
public class Fragment_Dir extends Fragment {
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fr_directorio,container, false);
       /* TextView texto = (TextView) rootView.findViewById(R.id.mostrar);
        TextView texto2 = (TextView)rootView.findViewById(R.id.mostrar2);*/
        ImageView principal =(ImageView) rootView.findViewById(R.id.imageView2);
        principal.setBackgroundResource(R.drawable.n16_poster_1x);
        ImageView principal1= (ImageView) rootView.findViewById(R.id.imageView4);
       // principal1.setImageResource(R.drawable.descarga);
        ImageView principal2 = (ImageView) rootView.findViewById(R.id.imageView5);
        //principal2.setImageResource(R.drawable.paisaje);
        //principal.setImageResource(R.drawable.n16_poster_1x);
        ImageButton numero1 = (ImageButton) rootView.findViewById(R.id.imageButton);
        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               System.out.println("***********************************");
                System.out.println("Se a clikeado en una seccion");
                System.out.println("**********************************");

            }
        });
        principal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("***********************************");
                System.out.println("Se a clikeado en una seccion2");
                System.out.println("**********************************");

            }
        });

        //texto2.setText("Esto es la segunda prueba");
        //texto.setText("Esto es una prueba");
        return rootView;
    }
}
