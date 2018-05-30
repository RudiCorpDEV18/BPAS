package info.rudicorpdev.bpas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Bab extends AppCompatActivity {

    RecyclerView mrecyclerView;
    Bab_Adapter adapter;
    List<List_bab> babList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab);
        TextView marque = findViewById(R.id.teksberjalan);
        marque.setSelected(true);

        babList = new ArrayList<>();
        mrecyclerView  = findViewById(R.id.recyclerView);
        mrecyclerView.setHasFixedSize(true);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        babList.add(
                new List_bab(1,"BAB SATU","ISI bab satu ini adalah isinya yaa bab satu gk bab dua tauuuuu.wkwkwkwkww ",R.drawable.bpasplash));
        babList.add(
                new List_bab(1,"BAB DUA","ISI bab dua ini sf sfhrehefd dfdgdger ehs gs gwsergw4yg esrgd",R.drawable.bpasplash));
        babList.add(
                new List_bab(1,"BAB TIGA","ISI bab tiga ini aa da a gr exs ssg sdfwewwtwtwt sd",R.drawable.bpasplash));
        babList.add(
                new List_bab(1,"BAB EMPAT","ISI bab empat ini asdjf jhavj dba aid aid ad a",R.drawable.bpasplash));
        babList.add(
                new List_bab(1,"BAB Selanjutnya","ISI bab selanjutnya ini adalah isinya yaa bab yg selanjutnya donx gk bab dua tauuuuu. wkwkwkwkww ",R.drawable.bpasplash));


        adapter = new Bab_Adapter(this, babList);
        mrecyclerView.setAdapter(adapter);


    }

}
