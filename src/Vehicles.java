public enum Vehicles {
    Sedan(3), SUV(5), MiniVan(7);
    private int value;

    private Vehicles(int value){
        this.value=value;
    }

    public static Vehicles fromInt(int i)
    {
        for (Vehicles b : Vehicles.values())
        {
            if(b.getValue()>=i)
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
