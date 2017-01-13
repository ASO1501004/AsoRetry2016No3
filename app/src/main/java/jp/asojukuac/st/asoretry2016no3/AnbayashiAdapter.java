package jp.asojukuac.st.asoretry2016no3;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kane on 2015/12/03.
 */
public class AnbayashiAdapter extends RecyclerView.Adapter<AnbayashiViewHolder> {
    private ArrayList<AnbayashiData> rouletteDataSet;

    public AnbayashiAdapter(ArrayList<AnbayashiData> roulette) {

        this.rouletteDataSet = roulette;
    }
    // 新しいViewを作成する
    // レイアウトマネージャーにより起動される
    @Override
    public AnbayashiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // parentはRecyclerView
        // public View inflate (int resource, ViewGroup root, boolean attachToRoot)
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);
        // Log.d("Anbayasi", parent.toString());

        //AnbayasiViewHolder anbayasiViewHolder = new AnbayasiViewHolder(view);
        return new AnbayashiViewHolder(view);
    }
    // Viewの内容を交換する（リサイクルだから）
    // レイアウトマネージャーにより起動される
    @Override
    public void onBindViewHolder(final AnbayashiViewHolder holder, final int listPosition) {

        holder.textViewNumber.setText(rouletteDataSet.get(listPosition).getpname());
        holder.textViewComment.setText(rouletteDataSet.get(listPosition).getyomi());
        holder.base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // vはCardView
                Toast.makeText(v.getContext(),
                        rouletteDataSet.get(listPosition).getcname(),Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    public int getItemCount() {
        return rouletteDataSet.size();
    }

}