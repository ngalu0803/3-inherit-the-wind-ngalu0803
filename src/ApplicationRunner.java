public class ApplicationRunner {

            public static void main(String[] args) {
                //catch, if there is any ExceptionInInitializerError for YOB
                try
                {
                    //Workers objects
                    Worker myworker1 = new Worker();
                    Worker myworker2 = new Worker();
                    //Person objects
                    SalaryWorker mysalaryworker1 = new SalaryWorker();
                    SalaryWorker mysalaryworker2 = new SalaryWorker();
                    SalaryWorker mysalaryworker3 = new SalaryWorker();

                    ArrayList<Person> myworkers = new ArrayList<>();
                    myworkers.add(myworker1);
                    myworkers.add(myworker2);
                    myworkers.add(myworker3);
                    myworkers.add(mysalaryworker1);
                    myworkers.add(mysalaryworker2);
                    myworkers.add(mysalaryworker3);
                    for (int i=0; i < myworkers.size(); i++)
                    {
                        //Display only the workers
                        if (!(myworkers.get(i) instanceof SalaryWorker)) {
                            Worker worker = (Worker) myworkers.get(i);
                            System.out.println("Worker:");
                            System.out.println(worker.formalName() + " " + "ID#: " + worker.getID());
//Week1
                            System.out.println(worker.displayWeeklyPay(40));
                            System.out.println("\n");
//Week2
                            System.out.println(worker.displayWeeklyPay(50));
                            System.out.println("\n");
//Week3
                            System.out.println(worker.displayWeeklyPay(40));
                        }
                        System.out.println("\n");
                    }

                }
                catch(ExceptionInInitializerError e) {
                    System.out.println(e);
                }
            }


        }
}
