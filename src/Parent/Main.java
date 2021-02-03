package Parent;

import Childs.CEO;
import Childs.Developer;
import Childs.Manager;
import Childs.Specialist;

public class Main {
    public static void main(String[] args) {
    /*Программа должна содержать классы Parent.Employee, Childs.Specialist, Childs.Developer, Childs.Manager, Childs.CEO,+
    которые должны быть наследованы определенным образом.+
    У каждого сотрудника есть ФИО, возраст и заработная плата.+
    У специалистов есть уровни (int levels), у разработчиков есть ранги
     (String grades = "Middle"), у менеджеров есть акции (boolean hasStocks), у исполнительного директора
     есть служебная машина (boolean hasCompanyCar).+
     Исполнительный директор является менеджером!
    В каждом классе кроме Parent.Main должны быть все геттеры и сеттеры, 2 конструктора (пустой и со всеми полями)
    и метод print() который распечатывает все поля класса.
    Также необходимо реализовать следующие методы, которые распечатывают соответствующую фразу
        работника на ваше усмотрение:
        1) Специалисты могут работать с клиентами - метод workWithClients();+
        2) Разработчики пишут код - метод writeCode();+
        3) Менеджеры разрабатывают процедуры - метод writeProcedures();+
        4) Childs.CEO работает над IPO - метод goPublic();+
    Пример распечатки фразы работника: "I am writing my awesome algorithm!"+
    В классе Parent.Main необходимо создать 3-х, специалистов, 4-х разработчиков, 2-х менеджеров и 1-го Childs.CEO,
      распечатать все поля каждого объекта (print) и вызвать уникальные  методы каждого объекта.*/

        Specialist harryPotter = new Specialist("Potter",27,2000,8);
        Specialist ronWeasley = new Specialist("Weasley",25,3000,7);
        Specialist hermioneGranger = new Specialist("Granger", 23,4000,10);
        harryPotter.workWithClients();
        ronWeasley.workWithClients();
        hermioneGranger.workWithClients();
        Developer amanUsonov = new Developer("Usonov", 28, 4000, "Junior");
        Developer camillaCross = new Developer("Cross", 31, 4500, "Middle");
        Developer selenaCharm = new Developer("Charm", 26, 3000, "Senior");
        Developer anjellaGloss = new Developer("Gloss", 29, 3500, "Junior");
        amanUsonov.writeCode();
        camillaCross.writeCode();
        selenaCharm.writeCode();
        anjellaGloss.writeCode();
        Manager aidaiMurza = new Manager("Murza", 24, 1500, true);
        Manager bermetBakir = new Manager("Bakir", 20, 1500, false);
        aidaiMurza.writeProcedures();
        bermetBakir.writeProcedures();
        CEO aigulKulova = new CEO("Kulova", 35, 5000, true);
        aigulKulova.goPublic();

        System.out.println(aigulKulova.print());
        System.out.println(harryPotter.print());
        System.out.println(ronWeasley.print());
        System.out.println(hermioneGranger.print());
        System.out.println(amanUsonov.print());
        System.out.println(camillaCross.print());
        System.out.println(selenaCharm.print());
        System.out.println(anjellaGloss.print());
        System.out.println(aidaiMurza.print());
        System.out.println(bermetBakir.print());
        Employee[] employees = new Employee[10];
        employees[0] = harryPotter;
        employees[1] = ronWeasley;
        employees[2] = hermioneGranger;
        employees[3] = amanUsonov;
        employees[4] = camillaCross;
        employees[5] = selenaCharm;
        employees[6] = anjellaGloss;
        employees[7] = aidaiMurza;
        employees[8] = bermetBakir;
        employees[9] = aigulKulova;
        for(Employee r: employees){
            r.goToVacation();
        }
        harryPotter.goToDayOff();
        ronWeasley.goToDayOff();
        hermioneGranger.goToDayOff();
        amanUsonov.goToDayOff();
        camillaCross.goToDayOff();
        selenaCharm.goToDayOff();
        anjellaGloss.goToDayOff();
        aidaiMurza.goToDayOff();
        bermetBakir.goToDayOff();
        aigulKulova.goToDayOff();


    }
}
