package com.number7.toolsshop;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTolls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ссылка на текущий ActionBar
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }

        listViewTolls = findViewById(R.id.listViewTools);
        // Добавляем слушатель событий
        listViewTolls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            // onItemClick - что сделать при нажатии на элемент списка
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }


}
