class ResistorColor {
    public String[] value={
            "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
    };
    int colorCode(String color) {
        for(int i=0;i<10;i++){
            if(value[i]==color)
                return i;
        }
        return -1;
    }

    String[] colors(){
        return value;
    }
}
