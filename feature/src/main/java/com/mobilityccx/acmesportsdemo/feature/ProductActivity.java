package com.mobilityccx.acmesportsdemo.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private ShopItem item;
    private TextView tvTitle;
    private TextView desc;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_detail);

        item = (ShopItem) getIntent().getSerializableExtra("DATA");

        tvTitle = findViewById(R.id.product_name);
        imageView = findViewById(R.id.image_src);
        desc = findViewById(R.id.product_desc);
        desc.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");
        tvTitle.setText(item.getName());
        imageView.setImageResource(item.getSrc());
    }

    public List<ShopItem> buildData(List<ShopItem> items) {


        ShopItem item1 = new ShopItem();
        item1.setName("Accessories");
        item1.setSrc(R.drawable.pro1);

        ShopItem item2 = new ShopItem();
        item2.setName("Keyrings, Badges & Magnets");
        item2.setSrc(R.drawable.pro2);

        ShopItem item3 = new ShopItem();
        item3.setName("Gifts");
        item3.setSrc(R.drawable.pro3);

        ShopItem item4 = new ShopItem();
        item4.setName("Head Wear");
        item4.setSrc(R.drawable.pro4);

        ShopItem item5 = new ShopItem();
        item5.setName("Books & DVDs");
        item5.setSrc(R.drawable.pro5);

        ShopItem item6 = new ShopItem();
        item6.setName("Shirts");
        item6.setSrc(R.drawable.pro6);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);


        return items;

    }
}
