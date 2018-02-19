package com.mobilityccx.acmesportsdemo.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ShopItemAdapter adapter = new ShopItemAdapter(this,buildData(new ArrayList<ShopItem>()),new ShopItemAdapter.OnItemClickListener(){
            @Override
            public void onClick(ShopItem item) {
                Intent intent = new Intent(MainActivity.this,ProductActivity.class);
                intent.putExtra("DATA",item);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }

    public List<ShopItem> buildData(List<ShopItem> items){


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.m, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_cart) {
            Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
            return true;
        }
*/
        return super.onOptionsItemSelected(item);
    }
}
