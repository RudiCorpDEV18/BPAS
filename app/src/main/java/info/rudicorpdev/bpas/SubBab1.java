package info.rudicorpdev.bpas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SubBab1 extends AppCompatActivity {

    RecyclerView recyclebab1;
    Sub_Adapter adapter;

    List<List_sub> subList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_bab1);

        subList = new ArrayList<>();
        recyclebab1  = (RecyclerView)findViewById(R.id.recyclebab1);
        recyclebab1.setHasFixedSize(true);
        recyclebab1.setLayoutManager(new LinearLayoutManager(this));

        subList.add(
                new List_sub(1,"Doa Pertama"));
        subList.add(
                new List_sub(1,"Doa Kedua"));
        subList.add(
                new List_sub(1,"Doa Ketiga"));
        subList.add(
                new List_sub(1,"Doa Keempat"));
        subList.add(
                new List_sub(1,"Doa Kelima"));
        subList.add(
                new List_sub(1,"Doa Keenam"));
        subList.add(
                new List_sub(1,"Doa Tujuh"));
        subList.add(
                new List_sub(1,"Doa Delapan"));
        subList.add(
                new List_sub(1,"Doa Sembilan"));
        subList.add(
                new List_sub(1,"Doa Sepuluh"));
        subList.add(
                new List_sub(1,"Doa Sebelas"));



        adapter = new Sub_Adapter (this, subList);
        recyclebab1.setAdapter(adapter);
    }
}
