public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedTime ;
    public int expectedMinutesInOven(){
        expectedTime=40;
        return expectedTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentTime){
        return 40-currentTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return 2*layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int timeInOven){
        return 2*layers+timeInOven;
    }
}
