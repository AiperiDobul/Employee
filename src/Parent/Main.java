package Parent;

import Childs.CEO;
import Childs.Developer;
import Childs.Manager;
import Childs.Specialist;

public class Main {

    public static void main(String[] args) {


        Specialist harryPotter = new Specialist("Potter",27,2000,8);
        Specialist ronWeasley = new Specialist("Weasley",25,3000,7);
        Specialist hermioneGranger = new Specialist("Granger", 23,4000,10);
        harryPotter.workWithClients();
        ronWeasley.workWithClients();
        hermioneGranger.workWithClients();
        Developer amanUsonov = new Developer("Usonov", 28, 4000, "Junior", DeveloperGrade.Junior);
        Developer camillaCross = new Developer("Cross", 31, 4500, "Middle", DeveloperGrade.Middle);
        Developer selenaCharm = new Developer("Charm", 26, 3000, "Senior", DeveloperGrade.Senior);
        Developer anjellaGloss = new Developer("Gloss", 29, 3500, "Teamlead", DeveloperGrade.Teamlead);
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

        printDeveloperGrade(amanUsonov);
        printDeveloperGrade(camillaCross);
        printDeveloperGrade(selenaCharm);
        printDeveloperGrade(anjellaGloss);

    }
    public static void printDeveloperGrade(Developer developer){
        switch (developer.getDeveloperGrade()){
            case Junior:
                System.out.println("I am junior Developer");
                break;
            case Middle:
                System.out.println("I am middle Developer");
                break;
            case Senior:
                System.out.println("I am senior Developer");
                break; 
            case Teamlead:
                System.out.println("I am senior Developer");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + developer.getDeveloperGrade());
        }
    }

}
