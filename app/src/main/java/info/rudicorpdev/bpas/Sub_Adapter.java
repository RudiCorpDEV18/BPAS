package info.rudicorpdev.bpas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Sub_Adapter extends RecyclerView.Adapter<Sub_Adapter.SubViewHolder> {

    private Context mCty;
    private List<List_sub> ListSub;

    public Sub_Adapter(Context mCty, List<List_sub> listSub) {
        this.mCty = mCty;
        ListSub = listSub;
    }

    @NonNull
    @Override
    public SubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCty);
        View view = inflater.inflate(R.layout.list_sub, null);
        return new SubViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SubViewHolder holder, int position) {
        List_sub list_sub = ListSub.get(position);

        holder.judul.setText(list_sub.getJudul());
    }

    @Override
    public int getItemCount() {
        return ListSub.size();
    }

    class  SubViewHolder extends RecyclerView.ViewHolder{

        TextView judul;

        public SubViewHolder(View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
        }
    }
}
