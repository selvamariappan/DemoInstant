package com.mobilityccx.acmesportsdemo.feature;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;


public class ShopItemAdapter extends RecyclerView.Adapter<ShopItemAdapter.ViewHolder>  {

    private final ShopItemAdapter.OnItemClickListener listener;
    private List<ShopItem> items;
    private Context context;

    public ShopItemAdapter(Context context, List<ShopItem> items, ShopItemAdapter.OnItemClickListener listener) {
        this.listener = listener;
        this.items = items;
        this.context = context;
    }


    @Override
    public ShopItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item_row, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ShopItemAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ShopItemAdapter.ViewHolder holder, int position) {
        ShopItem item = items.get(position);
        holder.click(item, listener);
        holder.imageView.setImageResource(item.getSrc());
        holder.btTitle.setText(item.getName());
    }


    @Override
    public int getItemCount() {
        return items.size();
    }


    public interface OnItemClickListener {
        void onClick(ShopItem Item);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        Button btTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_src );
            btTitle= itemView.findViewById(R.id.button);
        }

        public void click(final ShopItem datum, final ShopItemAdapter.OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(datum);
                }
            });
        }
    }
}
