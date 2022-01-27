package com.example.postandstreetresponsejava;

import java.io.Serializable;

//public class PostModel implements Serializable {
//    private final int albumId;
//    private final int id;
//
//    private final String title;
//
//    private final String url;
//
//    private final String thumbnailUrl;
//
//    public PostModel(int albumId, int id, String title, String url, String thumbnailUrl) {
//        this.albumId = albumId;
//        this.id = id;
//        this.title = title;
//        this.url = url;
//        this.thumbnailUrl = thumbnailUrl;
//    }
//
//    public int getAlbumId() {
//        return albumId;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getThumbnailUrl() {
//        return thumbnailUrl;
//    }
//}



public class PostModel implements Serializable {
    private Offer offer;

    private String short_description;

    private Distance distance;

    private String image_url;

    private Contact contact;

    private Profile profile;

    private String name;

    private Boolean verified;

    private Integer rating;

    private String description;

    private Integer id;

    public Offer getOffer() {
        return this.offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public String getShort_description() {
        return this.short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public Distance getDistance() {
        return this.distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Contact getContact() {
        return this.contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVerified() {
        return this.verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static class Offer implements Serializable {
        private Integer percentage;

        public Integer getPercentage() {
            return this.percentage;
        }

        public void setPercentage(Integer percentage) {
            this.percentage = percentage;
        }
    }

    public static class Distance implements Serializable {
        private String units;

        private Integer value;

        public String getUnits() {
            return this.units;
        }

        public void setUnits(String units) {
            this.units = units;
        }

        public Integer getValue() {
            return this.value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public static class Contact implements Serializable {
        private String phone;

        public String getPhone() {
            return this.phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static class Profile implements Serializable {
        private String image_url;

        public String getImage_url() {
            return this.image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }
    }
}


