package com.example.benjaminlevinsky.pickupultimateforandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by benjaminlevinsky on 8/17/16.
 */
public interface PickUpGamesAPIEndpointInterface {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("/{gameID}")
    Call<Game> getUser(@Path("gameID") int gameID);

    @GET("listGames")
    Call<List<Game>> getAllGames();


}
