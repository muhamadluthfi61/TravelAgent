public enum HotelStars {
    OneStar(1),TwoStars(2),ThreeStars(3),FourStars(4),FiveStars(5);
    private int value;

    private HotelStars(int value){
        this.value=value;
    }

    public static HotelStars fromInt(int i)
    {
        for (HotelStars b : HotelStars.values())
        {
            if(b.getValue()==i)
            {
                return b;
            }
        }
        return null;
    }

    public int getValue()
    {
        return value;
    }
}
