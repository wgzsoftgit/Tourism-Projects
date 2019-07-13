package ly.base.po.domain;

public class Scenic {
    private Integer sceId;

    private String sceName;

    private String scePicture;//图片

    private String sceContent;//景点介绍

    private Float scePrice;//景点参考售价

    private Float sceVprice;//优惠价格

    private Integer sceCount;//浏览量

    private Integer sceIspush;//是否推荐0不推荐1推荐

    public Integer getSceId() {
        return sceId;
    }

    public void setSceId(Integer sceId) {
        this.sceId = sceId;
    }

    public String getSceName() {
        return sceName;
    }

    public void setSceName(String sceName) {
        this.sceName = sceName == null ? null : sceName.trim();
    }

    public String getScePicture() {
        return scePicture;
    }

    public void setScePicture(String scePicture) {
        this.scePicture = scePicture == null ? null : scePicture.trim();
    }

    public String getSceContent() {
        return sceContent;
    }

    public void setSceContent(String sceContent) {
        this.sceContent = sceContent == null ? null : sceContent.trim();
    }

    public Float getScePrice() {
        return scePrice;
    }

    public void setScePrice(Float scePrice) {
        this.scePrice = scePrice;
    }

    public Float getSceVprice() {
        return sceVprice;
    }

    public void setSceVprice(Float sceVprice) {
        this.sceVprice = sceVprice;
    }

    public Integer getSceCount() {
        return sceCount;
    }

    public void setSceCount(Integer sceCount) {
        this.sceCount = sceCount;
    }

    public Integer getSceIspush() {
        return sceIspush;
    }

    public void setSceIspush(Integer sceIspush) {
        this.sceIspush = sceIspush;
    }
}