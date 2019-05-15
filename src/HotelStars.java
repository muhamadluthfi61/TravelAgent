public enum HotelStars {
    OneStar(1),TwoStars(2),ThreeStars(3),FourStars(4),FiveStars(5);
    private int value;

    private HotelStars(int value){
        this.value=value;
    }

    public int getValue()
    {
        return value;
    }
}
