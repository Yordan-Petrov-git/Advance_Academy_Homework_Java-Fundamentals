public class Advertisment extends JFrameAds {

    private String adTitle;
    private String adID;

    public Advertisment(String adTitle, String adID) {
        super();
        setAdTitle(adTitle);
        setAdTitle(adID);
    }


    public String getAdTitle() {
        return this.adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdID() {
        return this.adID;
    }

    public void setAdID(String adID) {
        this.adID = adID;
    }


}
