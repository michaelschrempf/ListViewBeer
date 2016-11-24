package at.fh.swengb.listviewbeer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.listviewbeer.beer.Beer;

public class ShowBeerActivity extends AppCompatActivity {

    private Beer beer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_beer);

        Intent intent = getIntent();
        beer = (Beer) intent.getExtras().get("beer");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);

        viewFirstName.setText(beer.getName());
        viewLastName.setText(beer.getManufacturer());
        viewAddress.setText(beer.getAddress());
        viewPhone.setText(beer.getPhoneNumber());

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+beer.getAddress());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+beer.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
