public class Clock {
    int hour;
    int minute;

    Clock()
    {
        this.hour = 0;
        this.minute = 0;
    }

    Clock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public void SetClock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public void SetClock()
    {
        hour = 0;
        minute = 0;
    }
    
    public void displayTime()
    {
        System.out.printf("The current time is: %02d:%02d%n", hour, minute);
    }

    public void addOneMinute()
    {
        if (minute == 59)
        {
            if (hour == 23)
            {
                hour = 0;
                minute = 0;
            }
            else
            {
                hour++;
                minute = 0;
            }
        }
        else
        {
            minute++;
        }
    }

    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 47);
        clock1.displayTime();
        clock1.SetClock(18,47);
        clock1.displayTime();
        clock1.SetClock(9,3);
        clock1.displayTime();
        clock1.SetClock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
    }
}
