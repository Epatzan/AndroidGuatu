package klaser.com.guatuneed.chapin;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import guatuneed.klaser.com.guatuneed.R;
import klaser.com.guatuneed.home.tabs.Fragment_Chapin;

/**
 * Created by enrique on 29/04/16.
 */
public class ChapinListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private  final String[] itemnane;
    private  final Integer[] integers;

    public ChapinListAdapter(Activity context, String[] itemname, Integer[] integers){
        super(context, R.layout.fila_lista, itemname);
        this.context=context;
        this.itemnane=itemname;
        this.integers=integers;

    }




    public View getView(int posicion, View view, ViewGroup parent){
        LayoutInflater inflater= context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.fila_lista, null, true);

        TextView txtTitle=(TextView) rowView.findViewById(R.id.texto_principal);
        ImageView imageView=(ImageView) rowView.findViewById(R.id.icon);
        TextView etxDescription=(TextView) rowView.findViewById(R.id.texto_secundario);

        txtTitle.setText(itemnane[posicion]);
        imageView.setImageResource(integers[posicion]);
        etxDescription.setText("Descripcion"+itemnane[posicion]);

        return rowView;
    }
}
