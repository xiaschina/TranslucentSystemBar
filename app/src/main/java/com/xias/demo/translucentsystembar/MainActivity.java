package com.xias.demo.translucentsystembar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xias.demo.translucentsystembar.util.StatusBarCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarCompat.compat(this);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        String[] data = new String[20];
        for (int i = 0; i < 20; i++) {
            data[i] = "item" + i;
        }
        MyAdapter mMyAdapter = new MyAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mMyAdapter);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ContentActivity.class));
            }
        });
    }


    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        public String[] data;

        public MyAdapter(String[] data){
            this.data=data;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.item,null);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.tvItem.setText(data[position]);
        }

        @Override
        public int getItemCount() {
            return data.length;
        }


        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView tvItem;
            public ViewHolder(View itemView) {
                super(itemView);
                tvItem=(TextView)itemView.findViewById(R.id.tv_item) ;
            }
        }
    }
}
