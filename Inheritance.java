class Empolyee
{
    String name, add, mail;
    float id, mobile, basic;
void salary()
  {
    float da , hra, pf , cf;
    da = basic*97/100;
    hra = basic*10/100;
    pf = basic*12/100;
    cf = basic*0.1f/100;
    float gross = basic + hra - pf -cf;
    System.out.println("Name:"+name);
    System.out.println("Basic Salary:"+basic);
    System.out.println("Gross Salary:"+gross);

  }
}
class Programmer extends Empolyee
{
     Programmer(String name ,int sal){
         this.name = name;
        basic = sal;
     }
}
class TeamLead extends Empolyee
{
     TeamLead(String name, int sal){
          this.name = name;
        basic = sal;
     }
}
class APM extends Empolyee 
{
     APM(String name , int sal){
      this.name = name;
      basic = sal;
     }
}
class ProjectManager extends Empolyee
{
      ProjectManager(String name ,int sal){
         this.name = name;
         basic = sal;
      }
} 
public class Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer("Amar Mohite", 40000);
        p.salary();
        
        TeamLead t = new TeamLead("Mritunjay Kumar", 60000);
        t.salary();

        APM a = new APM("Harsh Jain", 70000);
        a.salary();
        
        ProjectManager g = new ProjectManager("Kasim Chota", 100000);
        g.salary();
    }
    }


