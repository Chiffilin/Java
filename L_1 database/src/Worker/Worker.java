package Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Средний уровень: создать класс с нижеуказанными полями и вывести данные о самом молодом сотруднике.
    Фамилия
    Имя
    Отчество
    Должность
    Зарплата
    Дата рождения
*/
public class Worker {
    private String surname;
    private String name;
    private String middle_name;
    private String position;
    private int salary;
    private Date dateOfBirthday;

    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName(){return this.name;}
    public void setName(String name){ this.name = name;}

    public String getMiddle_name(){ return this.middle_name;}
    public void  setMiddle_name(String middle_name){this.middle_name = middle_name;}

    public String getPosition(){return this.position;}
    public void setPosition(String position){this.position = position;}

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirthday() {
        return this.dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) throws ParseException {
        try {
            this.dateOfBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirthday);
        } catch (ParseException pe) {
            System.err.println("Something went wrong!");
        }
    }

}
