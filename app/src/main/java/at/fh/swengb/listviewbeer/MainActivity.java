package at.fh.swengb.listviewbeer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.listviewbeer.beer.Beer;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Beer> listBeer;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myUserList);

        listBeer = new ArrayList<>();
        listBeer.add(new Beer("Puntigamer", "Brauunion", "Triester Strasse 357, 8055 Graz","+433165020"));
        listBeer.add(new Beer("Puntigamer Radler", "Brauunion", "Triester Strasse 357, 8055 Graz","+4303165020"));
        listBeer.add(new Beer("Heineken", "Heineken","Tweede Weteringplantsoen 21, 1017 ZD Amsterdam","+31715458000"));
        listBeer.add(new Beer("Schladminger", "Schladminger","Hammerfeldweg 163, 8970 Schladming","+433687225910"));
        listBeer.add(new Beer("Goesser", "Brauunion","Brauhausgasse 1, 8700 Göss","+438102069791"));
        listBeer.add(new Beer("Goesser Naturradler", "Brauunion","Brauhausgasse 1, 8700 Göss","+438102069791"));
        listBeer.add(new Beer("Zipfer", "Brauunion","Zipf 1, 4871 Neukirchen an der Vöckla","+430768236000"));
        listBeer.add(new Beer("Egger", "Privatbrauerei Egger","Tiroler Str. 18, 3100 St. Pölten","+4327423920"));
        listBeer.add(new Beer("Egger Radler", "Privatbrauerei Egger","Tiroler Str. 18, 3100 St. Pölten","+4327423920"));

        myAdapter = new CustomAdapter (this,listBeer);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Beer selectedBeer = listBeer.get(i);
        Intent intent = new Intent(view.getContext(),ShowBeerActivity.class);
        intent.putExtra("beer",selectedBeer);
        startActivity(intent);

    }





}
