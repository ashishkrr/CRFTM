package com.example.crftm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import com.example.crftm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int[] appIcons = {R.drawable.ftm_english, R.drawable.ftm_french};
    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e) {}

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2, GridLayoutManager.HORIZONTAL, false));
        CustomAdapter customList = new CustomAdapter(getApplicationContext(), appIcons);
        recyclerView.setAdapter(customList);

    }
}