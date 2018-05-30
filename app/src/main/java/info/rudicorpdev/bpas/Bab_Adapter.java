package info.rudicorpdev.bpas;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Bab_Adapter extends RecyclerView.Adapter<Bab_Adapter.Babview>{

    private Context mCtx;
    private List<List_bab> BabList;

    public Bab_Adapter(Context mCtx, List<List_bab> babList) {
        this.mCtx = mCtx;
        BabList = babList;
    }

    @NonNull
    @Override
    public Babview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_bab, null);
        return new Babview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Babview holder, int position) {
        List_bab list_bab = BabList.get(position);

        holder.judul.setText(list_bab.getJudul());
        holder.isi.setText(list_bab.getIsi());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(list_bab.getGambar()));
    }

    @Override
    public int getItemCount() {
        return BabList.size();
    }

    class  Babview extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView judul,isi;

        public Babview(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            judul = itemView.findViewById(R.id.judul);
            isi = itemView.findViewById(R.id.isi);
        }
    }
}
