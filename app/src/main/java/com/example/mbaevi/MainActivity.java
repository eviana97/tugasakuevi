package com.example.mbaevi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Felia", "16030025", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Falic", "16030060", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("sudar", "16030045", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Siswana", "16030098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Budi", "16030009", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Adi", "16030060", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Mutu", "16030065", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("waru", "16030098", "098758124"));

    }

}
