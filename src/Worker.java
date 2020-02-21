public class Worker extends Person {


    private double hourlyPayRate;
    private getHourlyPayRate();
    {
        retun this.hourPayRate;
    }
    public void setHourlyPayRate(double hourlypayrate)
    {
        this.hourPayRate=hourlypayrate;
    }
    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hourlyWorked<=40)
        {
            return hoursWorked*this.hourlyPayRate;
        }
        else {
            double regularpay=(hoursWorked-40)*(this.hourslyPayRate*1.5);
        }
    }

    regularhours = 40.0;
}
    String regularpaystring = "Hours worked at regular Pay Rate: " + regularhours + " and he's getting: " + regularpay;
    String overtimepaystring = "Hours worked at overtime Pay Rate: " + (hoursWorked - regularhours) + " and he's getting: " + overtimepay;
return regularpaystring + "\n" + overtimepaystring;
        }
        }
































}
