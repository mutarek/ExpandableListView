package com.bdsoftwaresolution.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expListView = (ExpandableListView) findViewById(R.id.exlistview);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Tofayel");
        listDataHeader.add("Biddut");
        listDataHeader.add("Tarek");

        List<String> tofayel = new ArrayList<String>();
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");
        tofayel.add("mohi");

        List<String> biddut = new ArrayList<String>();

        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");
        biddut.add("nibbi");

        List<String> tarek = new ArrayList<String>();

        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");
        tarek.add("mc tarek");

        listDataChild.put(listDataHeader.get(0), tofayel); // Header, Child data
        listDataChild.put(listDataHeader.get(1), biddut);
        listDataChild.put(listDataHeader.get(2), tarek);
    }
}
