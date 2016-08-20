package com.example.benjaminlevinsky.pickupultimateforandroid;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by benjaminlevinsky on 8/20/16.
 */
public class CitiesActivity extends AppCompatActivity {

    @NonNull
    List<Game> games;

    @NonNull
    List<String> cities;

    public CitiesActivity(List<Game> games){
        this.games = games;


    }

    private String loadJSONFromAsset() {
        String json;
        try {
            InputStream is = getAssets().open("cities.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private void parseCitiesFromGames(){


        List<CityGameRecord> cityGameRecords= new GsonBuilder().create().fromJson(loadJSONFromAsset(), new TypeToken<ArrayList<CityGameRecord>>(){}.getType());
        // get each unique city
        // associate each unique city with all its games


    }
}
