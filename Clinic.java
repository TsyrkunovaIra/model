package model;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

import static model.Schedule.values;

public class Clinic {
    private boolean Work;
    public DayOfWeek getDayOfWeek(){
        return LocalDateTime.now().getDayOfWeek();}
    public void setDayOfWeek(DayOfWeek dayOfWeek){}
    public void toWork(){
        Schedule[] values = Schedule.values();
        for (int i = 0; i < values.length; i++){
            {
                Schedule day = values[i];
                if(LocalDateTime.now().getDayOfWeek().name().equals(day.name()))
                    System.out.println();

            }
        }

    }

}
