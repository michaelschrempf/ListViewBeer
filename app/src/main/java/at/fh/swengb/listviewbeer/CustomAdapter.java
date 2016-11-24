package at.fh.swengb.listviewbeer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.listviewbeer.beer.Beer;

/**
 * Created by micha on 24.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Beer> listBeer;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Beer> listBeer) {
        this.context = applicationContext;
        this.listBeer= listBeer;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listBeer.size();
    }

    @Override
    public Object getItem(int i) {
        return listBeer.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListPhone);

        Beer beer = listBeer.get(i);
        viewName.setText(beer.getName()+" "+beer.getManufacturer());
        viewAddress.setText(beer.getAddress());
        viewPhone.setText(beer.getPhoneNumber());

        return view;
    }

}
