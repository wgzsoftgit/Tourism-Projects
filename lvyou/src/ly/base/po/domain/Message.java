package ly.base.po.domain;

public class Message {
    private Integer mesId;

    private String mesTitle;//留言标题

    private String mesContent;//留言内容

    private String mesTime;

    private String userName;//发帖人名称

    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    public String getMesTitle() {
        return mesTitle;
    }

    public void setMesTitle(String mesTitle) {
        this.mesTitle = mesTitle == null ? null : mesTitle.trim();
    }

    public String getMesContent() {
        return mesContent;
    }

    public void setMesContent(String mesContent) {
        this.mesContent = mesContent == null ? null : mesContent.trim();
    }

    public String getMesTime() {
        return mesTime;
    }

    public void setMesTime(String mesTime) {
        this.mesTime = mesTime == null ? null : mesTime.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}