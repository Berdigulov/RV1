package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> namesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        namesList.add("John");
        namesList.add("Mike");
        namesList.add("Nicolas");
        namesList.add("Dany");
        namesList.add("George");
        namesList.add("Steven");
        namesList.add("Anna");
        namesList.add("Lucy");
        namesList.add("Hannah");
        namesList.add("Jessy");
        namesList.add("Walter");
        namesList.add("Yuka");
        namesList.add("Patrick");
        namesList.add("Olivia");
        namesList.add("Emma");
        namesList.add("Oliver");
        namesList.add("Lucas");
        namesList.add("Liam");
        namesList.add("James");
        namesList.add("Isabella");

        NameAdapter nameAdapter = new NameAdapter(namesList);

        recyclerView.setAdapter(nameAdapter);
    }
}