package com.example.benjaminlevinsky.pickupultimateforandroid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.maps.android.clustering.ClusterItem;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "city"
})
public class CityGameRecord{

    // auto-generated at http://www.jsonschema2pojo.org/


    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("city")
    @Expose
    private String city;

    /**
     *
     * @return
     * The id
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The alias
     */
    public String getAlias() {
        return city;
    }

    /**
     *
     * @param alias
     * The alias
     */
    public void setCity(String city) {
        this.city = city;
    }


}