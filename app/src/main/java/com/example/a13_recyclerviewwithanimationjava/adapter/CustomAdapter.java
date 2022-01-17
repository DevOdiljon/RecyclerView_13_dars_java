package com.example.a13_recyclerviewwithanimationjava.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a13_recyclerviewwithanimationjava.R;
import com.example.a13_recyclerviewwithanimationjava.model.Memeber;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Memeber> memebers;

    public CustomAdapter(Context context, List<Memeber> memebers) {
        this.context = context;
        this.memebers = memebers;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_activity_view, parent, false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Memeber memeber = memebers.get(position);

        if (holder instanceof CustomHolder){
            TextView tv_name = ((CustomHolder) holder).tv_name;
            TextView tv_tel_number = ((CustomHolder) holder).tv_tel_number;

            tv_name.setText(memeber.getTv_name());
            tv_tel_number.setText(memeber.getTv_tel_number());
        }

    }

    @Override
    public int getItemCount() {
        return memebers.size();
    }

    private class CustomHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_tel_number;
        View view;

        public CustomHolder(View v) {
            super(v);
            view = v;

            tv_name = view.findViewById(R.id.tv_name);
            tv_tel_number = view.findViewById(R.id.tv_tel_name);
        }
    }
}
