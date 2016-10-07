package klaser.com.guatuneed.home.tabs;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import guatuneed.klaser.com.guatuneed.R;
import klaser.com.guatuneed.chapin.ChapinListAdapter;

/**
 * Created by enrique on 25/04/16.
 */
public class Fragment_Chapin extends Fragment {
    View rootView;
    private ListView lista;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rootView= inflater.inflate(R.layout.fr_chapin,container,false);
        LinearLayout nuevo = (LinearLayout)rootView.findViewById(R.id.ly1);
        nuevo.setOnClickListener(new AdapterView.OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("Se dio click aca<<<<<<<<<<<<<<<<<<<");
                Toast.makeText(getActivity(),"Haz dado click", Toast.LENGTH_SHORT).show();
            }
        });
/*
        ChapinListAdapter adapter2= new ChapinListAdapter((Activity) this.getContext(),lenguajes,imgid);
        lista = (ListView) rootView.findViewById(R.id.mi_lista);
        lista.setAdapter(adapter2);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String SlectedItem = lenguajes[+position];
                //Toast.makeText(getAppicationContext(),SlectedItem, Toast.LENGTH_SHORT).show();
            }
            });



        */


        /*ImageView prueba = (ImageView) rootView.findViewById(R.id.imageView3);
        prueba.setImageResource(R.drawable.c23);*/


       /* TextView texto32 = (TextView) rootView.findViewById(R.id.texto2);
        texto32.setText("HOLA");
        Button nuevo =(Button) rootView.findViewById(R.id.button2);
        nuevo.setText("CAmbio");*/
        return rootView;
    }
}
