public class Car {

    final double maximumSpeed = 200;
    final String brand = "Ferrari";
    double speed = 0.0;
    boolean isRunning;

    
    void start()
    {
        isRunning = true;
    }

    void stop()
    {
        if(speed == 0.0) //araba, hızı varken duramasın
            isRunning = false;
    }

    double pushAccelerate (double pressure)
    {
        if(isRunning){
        speed = Math.min(speed+pressure, maximumSpeed);

        return speed;
        }
        else {
            return 0.0;
        }
    }

    double pushBreak (double pressure)
    {
       
       if (isRunning){
        speed = Math.max(speed-pressure, 0.0);

        return speed;
       }
       else {
        return 0.0;
       }
    }

    public String toString()
    {
        if(isRunning)
            return "Speed of my "+brand+" is "+speed;
        
        else
            return "The car is not running.";
            
    }

}
