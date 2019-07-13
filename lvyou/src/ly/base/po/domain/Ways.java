package ly.base.po.domain;

public class Ways {
    private Integer wayId;

    private String wayName;//路线的名字

    private String wayContent;//路线内容

    public Integer getWayId() {
        return wayId;
    }

    public void setWayId(Integer wayId) {
        this.wayId = wayId;
    }

    public String getWayName() {
        return wayName;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName == null ? null : wayName.trim();
    }

    public String getWayContent() {
        return wayContent;
    }

    public void setWayContent(String wayContent) {
        this.wayContent = wayContent == null ? null : wayContent.trim();
    }
}