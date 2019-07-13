package ly.base.po.domain;

public class Video {
    private Integer vidId;

    private String vidName;//视频名字

    private String vidLive;//视频

    private Integer vidIspush;//是否推荐0不推荐1推荐

    private Integer vidCount;//直播点击量

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }

    public String getVidName() {
        return vidName;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName == null ? null : vidName.trim();
    }

    public String getVidLive() {
        return vidLive;
    }

    public void setVidLive(String vidLive) {
        this.vidLive = vidLive == null ? null : vidLive.trim();
    }

    public Integer getVidIspush() {
        return vidIspush;
    }

    public void setVidIspush(Integer vidIspush) {
        this.vidIspush = vidIspush;
    }

    public Integer getVidCount() {
        return vidCount;
    }

    public void setVidCount(Integer vidCount) {
        this.vidCount = vidCount;
    }
}