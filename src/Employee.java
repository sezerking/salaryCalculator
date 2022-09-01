public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary<1000){
            return 0;
        }
        else{
            return salary*0.03;
        }
    }

    public int bonus(){
        if (workHours>40){
            return (workHours-40)*30;
        }
        else {
            return 0;
        }
    }

    public double raiseSalary(){
        if ((2021-hireYear)<10){
            return this.salary*0.05;
        } else if ((2021-hireYear)>=10 && (2021-hireYear)<20) {
           return this.salary*0.1;
        }
        else {
            return this.salary*0.15;
        }
    }

    @Override
    public String toString(){

        return "Adı: "+this.name+"\n"+"Maaşı: "+this.salary+"\n"+"Çalışma saati: " +this.workHours
                +"\n"+"Başlangıç yılı: "+this.hireYear +"\n"+"Vergi: "+this.tax()
                +"\n"+"Bonus: "+this.bonus()+"\n"+"Maaş artışı: "+this.raiseSalary()
                +"\n"+"Vergi ve Bonuslar ile birlikte maaş:"+(this.salary-this.tax()+this.bonus())
                +"\n"+"Toplam maaş: "+(this.salary+this.raiseSalary()-this.tax()+this.bonus());
    }
}
