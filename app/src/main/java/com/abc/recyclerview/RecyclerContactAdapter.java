package com.abc.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModel> arrayContacts;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel>arrContacts){
        this.context= context;
        this.arrayContacts = arrContacts;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view=  LayoutInflater.from(context).inflate(R.layout.conatact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgConatact.setImageResource(arrayContacts.get(position).img);
        holder.txtNmae.setText(arrayContacts.get(position).name);
        holder.texNumber.setText(arrayContacts.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrayContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNmae,texNumber;
        ImageView imgConatact;
        public ViewHolder(View itemView){
            super(itemView);

            txtNmae = itemView.findViewById(R.id.tv1);
            texNumber = itemView.findViewById(R.id.tv2);
            imgConatact = itemView.findViewById(R.id.image);

        }

    }

}
