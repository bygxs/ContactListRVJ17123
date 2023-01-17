package com.biniyam.contactlistrvj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mContacts;
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        mContacts  = new ArrayList<>();
        mContacts.add("MoA B");
        mContacts.add("MoA yenesew");
        mContacts.add("MoA Weqero");
        mContacts.add("MoA Beretusew");
       /* mContacts.add("MoA B");
        mContacts.add("MoA yenesew");
        mContacts.add("MoA Weqero");
        mContacts.add("MoA Beretusew");
        mContacts.add("MoA B");
        mContacts.add("MoA yenesew");
        mContacts.add("MoA Weqero");
        mContacts.add("MoA Beretusew");
        mContacts.add("MoA B");
        mContacts.add("MoA yenesew");
        mContacts.add("MoA Weqero");
        mContacts.add("MoA Beretusew");
        mContacts.add("MoA B");
        mContacts.add("MoA yenesew");
        mContacts.add("MoA Weqero");
        mContacts.add("MoA Beretusew");*/

        // instead of endless copy paste list...

        for (int i = 0; i < 100; i++) {
            mContacts.add("Biniyam Yene #" + i );

        }

            /**
             * this fixed size optimizes the app instead of infinity scrolling like instagram
             */
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new MainAdapter(mContacts);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(adapter);


/*
        /**
         * to see the ArrayList in printed in the Logcat
         * fori write just this, "fori" to get the for loop template auto suggested and autocompleted

        for (int i = 0; i < mContacts.size() ; i++) {
            Log.d(TAG,"onCreate  " + mContacts.get(i));

        }

        another way of writing the above in detail
        for (int counter = 0; counter< mContacts.size(); counter++){
            Log.d(TAG,"onCreate" + mContacts.get(counter));

        }
*/

    }
}