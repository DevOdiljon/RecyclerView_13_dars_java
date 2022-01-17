package com.example.a13_recyclerviewwithanimationjava.activivty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.a13_recyclerviewwithanimationjava.R;
import com.example.a13_recyclerviewwithanimationjava.adapter.CustomAdapter;
import com.example.a13_recyclerviewwithanimationjava.model.Memeber;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        List<Memeber> memebers = prepareMember();
        refreshAdapter(memebers);
    }

    private void refreshAdapter(List<Memeber> memebers) {
        CustomAdapter adapter = new CustomAdapter(context, memebers);
        recyclerView.setAdapter(adapter); }

    private List<Memeber> prepareMember() {
        List<Memeber> memebers = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            memebers.add(new Memeber("Odilbek " + i, "+998-97-775-17-79"));
        }

        return memebers;

    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerVioew);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_from_bottom);
        recyclerView.setLayoutAnimation(animation);
    }
}