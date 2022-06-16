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
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie", R.drawable.supernatural));
        listSerie.add(new Serie("Gossip Girl", "Drama", "Drama Serie", R.drawable.gossip));
        listSerie.add(new Serie("Wife and Kids ", "Comedy", "Comedy Serie", R.drawable.wifekids));

//        SerieList listSerie = (SerieList) new SerieList().getListSerie();
//        SerieAdapter adapter = new SerieAdapter(getApplicationContext(), listSerie.listSerie);

        SerieAdapter adapter = new SerieAdapter(getApplicationContext(), listSerie);
        recyclerView.setAdapter(adapter);
    }
}