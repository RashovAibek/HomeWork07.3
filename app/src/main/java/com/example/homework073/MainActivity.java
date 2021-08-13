package com.example.homework073;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> list;
    private MainAdapter mainAdapter;
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initRv();
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new User("ergr",R.drawable.fdsf,"dfghrt"));
        list.add(new User("ergr",R.drawable.fdsf,"dfghrt"));
        list.add(new User("ergr",R.drawable.fdsf,"dfghrt"));
        list.add(new User("ergr",R.drawable.irland,"dfghrt"));
        list.add(new User("ergr",R.drawable.fdsf,"dfghrt"));
        list.add(new User("gfh",R.drawable.fdsf,"dfghrt"));
        list.add(new User("ergr",R.drawable.erttewr,"dfghrt"));
        list.add(new User("ergr",R.drawable.fdsf,"dfghrt"));
        list.add(new User("ergr",R.drawable.erttewr,"4ht3"));
        list.add(new User("ergr",R.drawable.fdsf,"dfghrt"));
        list.add(new User("4y5t",R.drawable.fdsf,"45hb"));
    }

    private void initRv() {
        mainAdapter = new MainAdapter();
        rv = findViewById(R.id.rv);
        mainAdapter.setList(list);
        rv.setAdapter(mainAdapter);
    }
}