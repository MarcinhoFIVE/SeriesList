package br.mdan.serieslist;

import java.util.ArrayList;

public class SerieList {
    ArrayList<Serie> listSerie;
    //List<Serie> listSerie;

    public ArrayList<Serie> getListSerie() {
        listSerie.add(new Serie("Supernatural", "Horror", "Hunter Serie", R.drawable.supernatural, R.drawable.supernaturalpost));
        listSerie.add(new Serie("Gossip Girl", "Drama", "Drama Serie", R.drawable.gossip, R.drawable.gossip));
        listSerie.add(new Serie("Wife and Kids", "Comedy", "Comedy Serie", R.drawable.wifekids, R.drawable.wifekids));
        listSerie.add(new Serie("Big Bang Theory", "Comedy", "Comedy Serie", R.drawable.bigbang, R.drawable.bigbang));
        return listSerie;
    }

}
