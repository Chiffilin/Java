package Worker;

import java.util.ArrayList;
import java.util.Date;

public class Workers {
    private final ArrayList<Worker> workers = new ArrayList<Worker>();

    public void addWorker(Worker worker){
        if(worker != null){
            this.workers.add(worker);
        } else {
            System.err.println("Provided element is not a worker");
        }
    }

    public ArrayList<Worker> getWorkers() {
        return this.workers;
    }

    @Override
    public String toString() {
        StringBuilder answer = new StringBuilder();

        for(Worker worker : workers){
            Date date1 = worker.getDateOfBirthday();
            for(Worker worker2 : workers){
                Date date2 = worker2.getDateOfBirthday();
                if(date1.before(date2)) {
                    answer.append(String.format("\n\n[RESULT]\nSurname: %s\nName: %s\nMiddle_Name: %s\nPosition: %s\nSalary: %d\nDate of Birthday: %s", worker.getSurname(), worker.getName(), worker.getMiddle_name(), worker.getPosition(),worker.getSalary(), worker.getDateOfBirthday()));
                } else {
                    date1 = worker.getDateOfBirthday();
                }
            }

        }
        return answer.toString();
    }

}
