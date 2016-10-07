package klaser.com.guatuneed.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import guatuneed.klaser.com.guatuneed.R;

/**
 * Created by enrique on 20/04/16.
 */
public class ItemAdapter extends BaseAdapter {
    private Context context;
    private List<Item> items;

    public ItemAdapter(Context context,List<Item>items){
        this.context = context;
        this.items=items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item, parent, false);
        }
        TextView   tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        Item item = this.items.get(position);
        tvTitle.setText(item.getDescripcion());
        return rowView;
    }
}
