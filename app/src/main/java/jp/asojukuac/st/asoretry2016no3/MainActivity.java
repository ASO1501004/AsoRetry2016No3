package jp.asojukuac.st.asoretry2016no3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);

        // コンテンツの変化でRecyclerViewのサイズが変わらない場合は、
        // この設定でパフォーマンスを向上させることができる
        recyclerView.setHasFixedSize(true);

        // RecyclerViewにはLayoutManagerが必要
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        // 横スクロールになる
        // llManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        // 縦スクロール
        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);

        ArrayList<AnbayashiData> anbayasi = new ArrayList<AnbayashiData>();
        for (int i = 0; i < MyData.cArray.length; i++) {
            anbayasi.add(new AnbayashiData(
                    MyData.pArray[i],
                    MyData.yArray[i],
                    MyData.cArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new AnbayashiAdapter(anbayasi);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(anbayasi.size() - 1);    //最後までスクロール

    }
}