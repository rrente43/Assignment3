public class Main {
    public static void main(String[ ]args){
        State currentState;
        
        Rest rest = new Rest();
        Foward f = new Foward();
        Backward b = new Backward();
        currentState = rest;

        String pedal = "left";

        if(pedal =="left"){
            currentState =f; 
        }

        if(pedal =="right"){
            currentState =b; 
        }
    }
    
}
