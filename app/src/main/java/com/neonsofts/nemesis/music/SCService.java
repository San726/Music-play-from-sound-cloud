package com.neonsofts.nemesis.music;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.List;

/**
 * Created by echessa on 6/18/15.
 */
public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<com.neonsofts.nemesis.music.Track>> cb);

}
