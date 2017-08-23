package com.example.sony.authenticationpage.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.sony.authenticationpage.Model;
import com.example.sony.authenticationpage.R;
import java.util.ArrayList;
import java.util.List;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.Recycler>
{

    List<Model> modelList = new ArrayList<>();
    Context mContext;

    public CustomAdapter(Context mContext, List<Model> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;

    }

    public  class Recycler extends RecyclerView.ViewHolder {
        TextView name, pwd;
        public Recycler(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.product_name);
            pwd = (TextView) itemView.findViewById(R.id.product_pwd);


        }
    }

    @Override
    public Recycler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cusom_layout,parent,false);
        return new Recycler(view);
    }

    @Override
    public void onBindViewHolder(Recycler holder, int position) {
        Model model = modelList.get(position);
        holder.name.setText(model.getFirstName());
        holder.pwd.setText(model.getPassword());

    }

    @Override
    public int getItemCount() {
        if(modelList.size()> 0)
        return modelList.size();
        else return 1;
    }

    public void clear(){
        modelList.clear();
        notifyDataSetChanged();
    }
}