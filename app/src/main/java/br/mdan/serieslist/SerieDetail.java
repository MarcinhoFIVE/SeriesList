package br.mdan.serieslist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class SerieDetail extends AppCompatActivity {

    ImageView recebeFoto;
    TextView recebeNome;
    TextView recebeCategoria;
    TextView recebeDescricao;

    ImageView toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serie_detail_layout);

        recebeFoto = findViewById(R.id.ivRecebeFoto);
        recebeNome = findViewById(R.id.tvRecebeNome);
        recebeCategoria = findViewById(R.id.tvCategory);
        recebeDescricao = findViewById(R.id.tvDescription);
        toolBar = findViewById(R.id.collapseToolbar);

        Intent intent = getIntent();

        int foto;
        String nome, categoria, descricao;

        foto = intent.getIntExtra("foto_serie", 0);
        nome = intent.getStringExtra("nome_serie");
        categoria = intent.getStringExtra("categoria_serie");
        descricao = intent.getStringExtra("descricao_serie");

        recebeFoto.setImageResource(foto);
        recebeNome.setText(nome);
        recebeCategoria.setText(categoria);
        recebeDescricao.setText(descricao);

        toolBar.setImageResource(foto);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}