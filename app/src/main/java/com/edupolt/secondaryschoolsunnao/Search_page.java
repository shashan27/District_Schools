package com.edupolt.secondaryschoolsunnao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Search_page extends AppCompatActivity {

    private EditText mSearchField;
    private ImageButton mSearchBar;

    private RecyclerView mResultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        mSearchField = (EditText) findViewById(R.id.search_field);
        mSearchBar = (ImageButton)findViewById(R.id.search_bar);

        mResultList = (RecyclerView)findViewById(R.id.result_list);
    }
}
