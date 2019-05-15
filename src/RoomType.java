public enum RoomType {
    Single("Single"), Double("Double"), Premium("Premium");
    private String description;

    private RoomType(String s){
        this.description=s;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
