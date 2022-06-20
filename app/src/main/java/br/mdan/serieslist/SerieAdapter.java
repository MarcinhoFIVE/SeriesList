package br.mdan.serieslist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
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

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SerieDetail.class);

                intent.putExtra("foto_serie", serie.get(holder.getAdapterPosition()).getFotoSeriePos());
                intent.putExtra("nome_serie", serie.get(holder.getAdapterPosition()).getNameSerie());
                intent.putExtra("categoria_serie", serie.get(holder.getAdapterPosition()).getCategorySerie());
                intent.putExtra("descricao_serie", serie.get(holder.getAdapterPosition()).getDescriptionSerie());

                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });

    }

    @Override
    public int getItemCount() {
        return serie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleSerie;
        ImageView imageSerie;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleSerie = itemView.findViewById(R.id.tvSerie);
            imageSerie = itemView.findViewById(R.id.ivSerie);
            cardView = itemView.findViewById(R.id.cvSerie);
        }

    }
}
