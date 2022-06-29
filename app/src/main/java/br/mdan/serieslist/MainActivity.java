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

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        recyclerView.hasFixedSize();

        listSerie = new ArrayList<>();
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie", R.drawable.supernatural, R.drawable.supernaturalpost));
        listSerie.add(new Serie("Gossip Girl", "Drama", "Drama Serie", R.drawable.gossip, R.drawable.gossippost));
        listSerie.add(new Serie("Wife and Kids", "Comedy", "Comedy Serie", R.drawable.wifekids, R.drawable.wifekidspost));
        listSerie.add(new Serie("Big Bang Theory", "Comedy", "Comedy Serie", R.drawable.bigbang, R.drawable.bigbangpost));
        listSerie.add(new Serie("Met Mother", "Comedy", "Comedy Serie", R.drawable.metmother, R.drawable.metmotherpost));
        listSerie.add(new Serie("Walking Dead", "Horror", "Horror Serie", R.drawable.walking, R.drawable.walkingpost));
        listSerie.add(new Serie("Aventuras Christine", "Comedy", "Comedy Serie", R.drawable.christine, R.drawable.christinepost));
        listSerie.add(new Serie("Lost", "Drama", "Drama Serie", R.drawable.lost, R.drawable.lostpost));

//        SerieList listSerie = (SerieList) new SerieList().getListSerie();
//        SerieAdapter adapter = new SerieAdapter(getApplicationContext(), listSerie.listSerie);

        SerieAdapter adapter = new SerieAdapter(getApplicationContext(), listSerie);
        recyclerView.setAdapter(adapter);
    }
}