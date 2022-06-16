package br.mdan.serieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SerieAdapter extends RecyclerView.Adapter<SerieAdapter.ViewHolder> {

    Context context;
    List<Serie> serie;

    public SerieAdapter() {
    }

    public SerieAdapter(Context context, List<Serie> serie) {
        this.context = context;
        this.serie = serie;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.serie_card_layout, parent, false);
        //View view = LayoutInflater.from(context).inflate(R.layout.serie_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titleSerie.setText(serie.get(position).getNameSerie());
        holder.imageSerie.setImageResource(serie.get(position).getFotoSerie());
    }

    @Override
    public int getItemCount() {
        return serie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleSerie;
        ImageView imageSerie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleSerie = itemView.findViewById(R.id.tvSerie);
            imageSerie = itemView.findViewById(R.id.ivSerie);
        }

    }
}
