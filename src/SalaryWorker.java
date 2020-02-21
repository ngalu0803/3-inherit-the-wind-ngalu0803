public class SalaryWorker extends worker

    {
        //Private Attributes
        private double annualSalary;
        public SalaryWorker(String ID, String fname, String lname, String title, int YOB, double hourlypayrate, double annualsalary)
        {
//Call its super class Constructor
            super(ID, fname, lname, title, YOB, hourlypayrate);
//Make use of setters to set the attribute values
            this.setAnnualSalary(annualsalary);
        }
        public double getAnnualSalary()
        {
            return this.annualSalary;
        }
        public void setAnnualSalary(double annualsalary)
        {
            this.annualSalary = annualsalary;
        }
        public double calculateWeeklyPay(double hoursWorked)
        {
            return this.annualSalary / 52;
        }
        public String displayWeeklyPay(double hoursWorked)
        {
            return "Weekly pay: " + calculateWeeklyPay(0.0);
        }


























}
