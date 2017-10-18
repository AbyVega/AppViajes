package abigail.cortez.vega.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import abigail.cortez.vega.modelos.Lugar;

/**
 * Created by abiga on 18/10/2017.
 */

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.ViewHolder>{
    ArrayList<Lugar>lugares;//para tener un arreglo de objetos
    Context context;

    public LugarAdapter(ArrayList<Lugar> lugares, Context context) {//este es un constructor
        this.lugares = lugares;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
