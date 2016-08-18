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
        "alias",
        "lat",
        "lng",
        "name",
        "contact_name",
        "contact_email",
        "contact_phone",
        "sunday_time",
        "monday_time",
        "tuesday_time",
        "wednesday_time",
        "thursday_time",
        "friday_time",
        "saturday_time",
        "fields",
        "website",
        "mailing_list",
        "cost",
        "description",
        "last_updated",
        "html_description"
})
public class Game implements ClusterItem{

    // auto-generated at http://www.jsonschema2pojo.org/

    @Override
    public LatLng getPosition() {
        return new LatLng(lat, lng);
    }

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contact_name")
    @Expose
    private String contactName;
    @SerializedName("contact_email")
    @Expose
    private String contactEmail;
    @SerializedName("contact_phone")
    @Expose
    private String contactPhone;
    @SerializedName("sunday_time")
    @Expose
    private String sundayTime;
    @SerializedName("monday_time")
    @Expose
    private String mondayTime;
    @SerializedName("tuesday_time")
    @Expose
    private String tuesdayTime;
    @SerializedName("wednesday_time")
    @Expose
    private String wednesdayTime;
    @SerializedName("thursday_time")
    @Expose
    private String thursdayTime;
    @SerializedName("friday_time")
    @Expose
    private String fridayTime;
    @SerializedName("saturday_time")
    @Expose
    private String saturdayTime;
    @SerializedName("fields")
    @Expose
    private String fields;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("mailing_list")
    @Expose
    private String mailingList;
    @SerializedName("cost")
    @Expose
    private String cost;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("last_updated")
    @Expose
    private long lastUpdated;
    @SerializedName("html_description")
    @Expose
    private String htmlDescription;

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
        return alias;
    }

    /**
     *
     * @param alias
     * The alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     *
     * @return
     * The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     * The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     *
     * @return
     * The lng
     */
    public double getLng() {
        return lng;
    }

    /**
     *
     * @param lng
     * The lng
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     *
     * @param contactName
     * The contact_name
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     *
     * @return
     * The contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     *
     * @param contactEmail
     * The contact_email
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     *
     * @return
     * The contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     *
     * @param contactPhone
     * The contact_phone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     *
     * @return
     * The sundayTime
     */
    public String getSundayTime() {
        return sundayTime;
    }

    /**
     *
     * @param sundayTime
     * The sunday_time
     */
    public void setSundayTime(String sundayTime) {
        this.sundayTime = sundayTime;
    }

    /**
     *
     * @return
     * The mondayTime
     */
    public String getMondayTime() {
        return mondayTime;
    }

    /**
     *
     * @param mondayTime
     * The monday_time
     */
    public void setMondayTime(String mondayTime) {
        this.mondayTime = mondayTime;
    }

    /**
     *
     * @return
     * The tuesdayTime
     */
    public String getTuesdayTime() {
        return tuesdayTime;
    }

    /**
     *
     * @param tuesdayTime
     * The tuesday_time
     */
    public void setTuesdayTime(String tuesdayTime) {
        this.tuesdayTime = tuesdayTime;
    }

    /**
     *
     * @return
     * The wednesdayTime
     */
    public String getWednesdayTime() {
        return wednesdayTime;
    }

    /**
     *
     * @param wednesdayTime
     * The wednesday_time
     */
    public void setWednesdayTime(String wednesdayTime) {
        this.wednesdayTime = wednesdayTime;
    }

    /**
     *
     * @return
     * The thursdayTime
     */
    public String getThursdayTime() {
        return thursdayTime;
    }

    /**
     *
     * @param thursdayTime
     * The thursday_time
     */
    public void setThursdayTime(String thursdayTime) {
        this.thursdayTime = thursdayTime;
    }

    /**
     *
     * @return
     * The fridayTime
     */
    public String getFridayTime() {
        return fridayTime;
    }

    /**
     *
     * @param fridayTime
     * The friday_time
     */
    public void setFridayTime(String fridayTime) {
        this.fridayTime = fridayTime;
    }

    /**
     *
     * @return
     * The saturdayTime
     */
    public String getSaturdayTime() {
        return saturdayTime;
    }

    /**
     *
     * @param saturdayTime
     * The saturday_time
     */
    public void setSaturdayTime(String saturdayTime) {
        this.saturdayTime = saturdayTime;
    }

    /**
     *
     * @return
     * The fields
     */
    public String getFields() {
        return fields;
    }

    /**
     *
     * @param fields
     * The fields
     */
    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     *
     * @return
     * The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     *
     * @param website
     * The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     *
     * @return
     * The mailingList
     */
    public String getMailingList() {
        return mailingList;
    }

    /**
     *
     * @param mailingList
     * The mailing_list
     */
    public void setMailingList(String mailingList) {
        this.mailingList = mailingList;
    }

    /**
     *
     * @return
     * The cost
     */
    public String getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     * The cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The lastUpdated
     */
    public long getLastUpdated() {
        return lastUpdated;
    }

    /**
     *
     * @param lastUpdated
     * The last_updated
     */
    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     *
     * @return
     * The htmlDescription
     */
    public String getHtmlDescription() {
        return htmlDescription;
    }

    /**
     *
     * @param htmlDescription
     * The html_description
     */
    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

}