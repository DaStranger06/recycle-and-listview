package com.siamsoft.anime_character_list_rec_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CharList> charLists;

    RecyclerView recv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recv = findViewById(R.id.recycle);
        recv.setHasFixedSize(true);
        recv.setLayoutManager(new LinearLayoutManager(this));


        charLists = new ArrayList<>();


        charLists.add(new CharList(
                        "Sasuke",
                "Naruto",
                     8.2,
                R.drawable.aaa));
        charLists.add(new CharList(
                        "Itachi",
                "Naruto",
                     8.5,
                R.drawable.admf));
        charLists.add(new CharList(
                        "Kakashi",
                "Naruto",
                     7.9,
                R.drawable.ff));

        charLists.add(new CharList(
                "Shinji",
                "Bleach",
                     7.9,
                R.drawable.gg));
        charLists.add(new CharList(
                "Kenpachi",
                "Bleach",
                     9.6,
                R.drawable.zaraki));


        charLists.add(new CharList(
                "Ulquiorra",
                "Bleach",
                9.3,
                R.drawable.ulki));


        Adpt adapter = new Adpt(this, charLists);

      recv.setAdapter(adapter);

    }
}