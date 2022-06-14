package br.mdan.serieslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SerieAdapter extends RecyclerView.Adapter<SerieAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.serie_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView textSerie = itemView.findViewById(R.id.tvSerie);
            ImageView imageSerie = itemView.findViewById(R.id.ivSerie);

            textSerie.setText(SerieDetail.nameSerie);
            imageSerie.setImageResource(SerieDetail.fotoSerie);
        }
    }
}
