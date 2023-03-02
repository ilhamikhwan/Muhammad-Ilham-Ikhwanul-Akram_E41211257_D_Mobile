package com.example.minggu3_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu3_recycleview.R;

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
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "0851444000999"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1414370308", "081444333777"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1414370307", "089666444333"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1414370306","087555888999"));
        mahasiswaArrayList.add(new Mahasiswa("Irhas Maulana", "1414370305","087555888888"));
        mahasiswaArrayList.add(new Mahasiswa("Freda Adi", "1414370304","081535848919"));
        mahasiswaArrayList.add(new Mahasiswa("Rayhan", "1414370303","087666111000"));
        mahasiswaArrayList.add(new Mahasiswa("Ammar", "1414370302","087666111888"));
        mahasiswaArrayList.add(new Mahasiswa("Alvin", "1414370301","087666111999"));
    }
}