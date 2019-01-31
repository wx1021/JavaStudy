 class Date{
    int  day;
    int  month;
    int  year;
   Date(int  d,int  m,int  y){
    	day=d;
    	month=m;
    	year=y;
 }
   void   showDate(){
    		System.out.println(day+"."+month+"."+year);
    	
    }
}
public  class  Teacher1{
	String name;
	Date   birth;
void	setTeacher(String  t1,int y,int  m,int  d){
		name=t1;
		birth=new  Date(y,m,d);
	}
void	showTeacher(){
		System.out.println("Ãû×Ö:"+name);
		System.out.print("ÉúÈÕ:");
		birth.showDate();
	}
	public  static  void  main(String  []  args) {
		Teacher1 teacher=new Teacher1;
		teacher.setTeacher("Îâè¦",1997,19,21);
		teacher.showTeacher();
		
	}
}