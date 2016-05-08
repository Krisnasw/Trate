package intivestudio.web.id.trate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by outattacker on 07/05/16.
 */
public class Dashboard extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Training Teknopreneur");

        ImageView produk = (ImageView) findViewById(R.id.produk);
        ImageView tentang = (ImageView) findViewById(R.id.tentang);
        ImageView kontak = (ImageView) findViewById(R.id.kontak);
        ImageView pesan = (ImageView) findViewById(R.id.pesan);

        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(Dashboard.this, Produk.class);
                startActivity(q);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(Dashboard.this, About.class);
                startActivity(w);
            }
        });

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Dashboard.this, Jual.class);
                startActivity(e);
            }
        });

        kontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Dashboard.this, Kontak.class);
                startActivity(t);
            }
        });
    }
}
