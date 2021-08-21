package com.lukmanhawi.moviecatalogue.data;

public class TvEntity {
    private String tvId;
    private String tTitle;
    private String tDescription;
    private String tDate;
    private int tImagePath;

    public TvEntity(String tvId, String tTitle, String tDescription, String tDate, int tImagePath) {
        this.tvId = tvId;
        this.tTitle = tTitle;
        this.tDescription = tDescription;
        this.tDate = tDate;
        this.tImagePath = tImagePath;
    }

    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public String gettDescription() {
        return tDescription;
    }

    public void settDescription(String tDescription) {
        this.tDescription = tDescription;
    }

    public String gettDate() {
        return tDate;
    }

    public void settDate(String tDate) {
        this.tDate = tDate;
    }

    public int gettImagePath() {
        return tImagePath;
    }

    public void settImagePath(int tImagePath) {
        this.tImagePath = tImagePath;
    }

}
