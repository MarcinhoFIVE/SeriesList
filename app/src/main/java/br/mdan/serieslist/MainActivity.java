package br.mdan.serieslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Serie> listSerie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvSerie);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        recyclerView.hasFixedSize();

        listSerie = new ArrayList<>();
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie", R.drawable.supernatural, R.drawable.supernaturalpost));
        listSerie.add(new Serie("Gossip Girl", "Drama", "Drama Serie", R.drawable.gossip, R.drawable.gossippost));
        listSerie.add(new Serie("Wife and Kids", "Comedy", "Comedy Serie", R.drawable.wifekids, R.drawable.wifekidspost));
        listSerie.add(new Serie("Big Bang Theory", "Comedy", "Comedy Serie", R.drawable.bigbang, R.drawable.bigbangpost));
//        SerieList listSerie = (SerieList) new SerieList().getListSerie();
//        SerieAdapter adapter = new SerieAdapter(getApplicationContext(), listSerie.listSerie);

        SerieAdapter adapter = new SerieAdapter(getApplicationContext(), listSerie);
        recyclerView.setAdapter(adapter);
    }
}