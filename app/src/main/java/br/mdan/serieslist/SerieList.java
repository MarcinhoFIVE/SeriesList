package br.mdan.serieslist;

import java.util.ArrayList;
import java.util.List;

public class SerieList {
    List<Serie> listSerie = null;

    public List<Serie> getListSerie() {
        listSerie = new ArrayList<>();
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie",R.drawable.supernatural));
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie", R.drawable.supernatural));
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie", R.drawable.supernatural));
        return listSerie;
    }
}
