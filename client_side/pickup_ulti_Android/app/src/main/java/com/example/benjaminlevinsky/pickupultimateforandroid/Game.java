package com.example.benjaminlevinsky.pickupultimateforandroid;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
public class Game {

    // auto-generated at http://www.jsonschema2pojo.org/


    @JsonProperty("id")
    private Integer id;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("name")
    private String name;
    @JsonProperty("contact_name")
    private String contactName;
    @JsonProperty("contact_email")
    private String contactEmail;
    @JsonProperty("contact_phone")
    private String contactPhone;
    @JsonProperty("sunday_time")
    private String sundayTime;
    @JsonProperty("monday_time")
    private String mondayTime;
    @JsonProperty("tuesday_time")
    private String tuesdayTime;
    @JsonProperty("wednesday_time")
    private String wednesdayTime;
    @JsonProperty("thursday_time")
    private String thursdayTime;
    @JsonProperty("friday_time")
    private String fridayTime;
    @JsonProperty("saturday_time")
    private String saturdayTime;
    @JsonProperty("fields")
    private String fields;
    @JsonProperty("website")
    private String website;
    @JsonProperty("mailing_list")
    private String mailingList;
    @JsonProperty("cost")
    private String cost;
    @JsonProperty("description")
    private String description;
    @JsonProperty("last_updated")
    private Integer lastUpdated;
    @JsonProperty("html_description")
    private String htmlDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The alias
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     *
     * @param alias
     * The alias
     */
    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     *
     * @return
     * The lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     * The lat
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     *
     * @return
     * The lng
     */
    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    /**
     *
     * @param lng
     * The lng
     */
    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The contactName
     */
    @JsonProperty("contact_name")
    public String getContactName() {
        return contactName;
    }

    /**
     *
     * @param contactName
     * The contact_name
     */
    @JsonProperty("contact_name")
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     *
     * @return
     * The contactEmail
     */
    @JsonProperty("contact_email")
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     *
     * @param contactEmail
     * The contact_email
     */
    @JsonProperty("contact_email")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     *
     * @return
     * The contactPhone
     */
    @JsonProperty("contact_phone")
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     *
     * @param contactPhone
     * The contact_phone
     */
    @JsonProperty("contact_phone")
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     *
     * @return
     * The sundayTime
     */
    @JsonProperty("sunday_time")
    public String getSundayTime() {
        return sundayTime;
    }

    /**
     *
     * @param sundayTime
     * The sunday_time
     */
    @JsonProperty("sunday_time")
    public void setSundayTime(String sundayTime) {
        this.sundayTime = sundayTime;
    }

    /**
     *
     * @return
     * The mondayTime
     */
    @JsonProperty("monday_time")
    public String getMondayTime() {
        return mondayTime;
    }

    /**
     *
     * @param mondayTime
     * The monday_time
     */
    @JsonProperty("monday_time")
    public void setMondayTime(String mondayTime) {
        this.mondayTime = mondayTime;
    }

    /**
     *
     * @return
     * The tuesdayTime
     */
    @JsonProperty("tuesday_time")
    public String getTuesdayTime() {
        return tuesdayTime;
    }

    /**
     *
     * @param tuesdayTime
     * The tuesday_time
     */
    @JsonProperty("tuesday_time")
    public void setTuesdayTime(String tuesdayTime) {
        this.tuesdayTime = tuesdayTime;
    }

    /**
     *
     * @return
     * The wednesdayTime
     */
    @JsonProperty("wednesday_time")
    public String getWednesdayTime() {
        return wednesdayTime;
    }

    /**
     *
     * @param wednesdayTime
     * The wednesday_time
     */
    @JsonProperty("wednesday_time")
    public void setWednesdayTime(String wednesdayTime) {
        this.wednesdayTime = wednesdayTime;
    }

    /**
     *
     * @return
     * The thursdayTime
     */
    @JsonProperty("thursday_time")
    public String getThursdayTime() {
        return thursdayTime;
    }

    /**
     *
     * @param thursdayTime
     * The thursday_time
     */
    @JsonProperty("thursday_time")
    public void setThursdayTime(String thursdayTime) {
        this.thursdayTime = thursdayTime;
    }

    /**
     *
     * @return
     * The fridayTime
     */
    @JsonProperty("friday_time")
    public String getFridayTime() {
        return fridayTime;
    }

    /**
     *
     * @param fridayTime
     * The friday_time
     */
    @JsonProperty("friday_time")
    public void setFridayTime(String fridayTime) {
        this.fridayTime = fridayTime;
    }

    /**
     *
     * @return
     * The saturdayTime
     */
    @JsonProperty("saturday_time")
    public String getSaturdayTime() {
        return saturdayTime;
    }

    /**
     *
     * @param saturdayTime
     * The saturday_time
     */
    @JsonProperty("saturday_time")
    public void setSaturdayTime(String saturdayTime) {
        this.saturdayTime = saturdayTime;
    }

    /**
     *
     * @return
     * The fields
     */
    @JsonProperty("fields")
    public String getFields() {
        return fields;
    }

    /**
     *
     * @param fields
     * The fields
     */
    @JsonProperty("fields")
    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     *
     * @return
     * The website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     *
     * @param website
     * The website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     *
     * @return
     * The mailingList
     */
    @JsonProperty("mailing_list")
    public String getMailingList() {
        return mailingList;
    }

    /**
     *
     * @param mailingList
     * The mailing_list
     */
    @JsonProperty("mailing_list")
    public void setMailingList(String mailingList) {
        this.mailingList = mailingList;
    }

    /**
     *
     * @return
     * The cost
     */
    @JsonProperty("cost")
    public String getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     * The cost
     */
    @JsonProperty("cost")
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The lastUpdated
     */
    @JsonProperty("last_updated")
    public Integer getLastUpdated() {
        return lastUpdated;
    }

    /**
     *
     * @param lastUpdated
     * The last_updated
     */
    @JsonProperty("last_updated")
    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     *
     * @return
     * The htmlDescription
     */
    @JsonProperty("html_description")
    public String getHtmlDescription() {
        return htmlDescription;
    }

    /**
     *
     * @param htmlDescription
     * The html_description
     */
    @JsonProperty("html_description")
    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}