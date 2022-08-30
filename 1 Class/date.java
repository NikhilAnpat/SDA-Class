class date
{
    private int dd,mm,yy; //data abstruction
    public void initDate(int d,int m,int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }
        public void dispDate()
        {
            System.out.println("Date ="+dd+"/"+mm+"/"+yy);
        }
        public void setDay(int x)
        {
            dd=x;
        }
        public int getDay()
        {
            return dd;
        }
         public static void main (String[]args)
    {
        date dt = new date();//object
        dt.initDate(1,1,2017);
        dt.dispDate();
         date dt2 = new date();//object
         dt2.initDate(2,2,2019);
         dt2.dispDate();
         dt2.setDay(8);
        // dt2.dispDate();
         /* int r=dt2.getday();
           System.out.println("day="+r);*/
        System.out.println("day="+dt2.getDay());

    }
}