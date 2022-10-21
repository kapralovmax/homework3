public class Main {
    public static void main(String[] args)
    {

        System.out.println("     задание 1");
        int I = 40000;
        System.out.println("Значение переменной I с типом int  равно " + I);
        byte B = 100;
        System.out.println("Значение переменной B с типом byte  равно " + B);
        short S = 32767;
        System.out.println("Значение переменной S с типом short  равно " + S);
        long L = 1000L;
        System.out.println("Значение переменной L с типом long  равно " + L);
        float F = 3.14F;
        System.out.println("Значение переменной F с типом float  равно " + F);
        double D = 80.65;
        System.out.println("Значение переменной D с типом double  равно " + D);


        System.out.println("     задание 2");
        byte b_e = 67;
        short s_t = -159;
        short S_t2 = 569;
        long l_g = 987678965549L;
        float f_t = 27.12F;
        float f_t2 = 2.786F;
        char c_r = 27897;
        boolean boo_n = false;
        System.out.println("byte = " + b_e+"  short = " + s_t + "  short = " + S_t2 + "  long = " + l_g) ;
        System.out.println("float = "+ f_t +"  float = "+ f_t2 + "  char = " + c_r +"  boolean = "+boo_n);
        
        System.out.println("     задание 3");
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherKA = 30;
        short amountPaper = 480;
        short numberStudents = (short) (teacherLP + teacherKA + teacherAS);
        short sheetsPerson = (short) (amountPaper / numberStudents);
        System.out.println( "На каждого ученика рассчитано " + sheetsPerson + " листов бумаги ");


            System.out.println("     задание 4");
               byte twoMinutes = 16;
            System.out.println("За 2 минуты машина произвела бутылок " + twoMinutes + " штук");
               byte oneMinutes = (byte)(twoMinutes / 2);// производит в 1 минуту
               short minutes20 = (short)(oneMinutes * 20);
            System.out.println("За 20 минут машина произвела бутылок " + minutes20 + " штук");
               short day1 = 24 * 60; // минут в сутках
               short day = (short) (1440 * oneMinutes);
            System.out.println("За 1 день машина произвела бутылок " + day + " штук");
               int day3 = (int)(day*3);
            System.out.println("за 3 дня машина произвела бутылок " + day3 + " штук");
               int month = (int) (day1 * 30); // минут в месяце
               int producedMonth = month * oneMinutes;
               System.out.println("За 1 месяц машина произвела бутылок "+ producedMonth +" штук");


            System.out.println("     задание 5");
            byte totalPaint = 120;
            byte WhitePaint = 2;
            byte brownPaint = 4;
            byte paintGrade = (byte) (WhitePaint + brownPaint);
            byte totalClasses = (byte) (totalPaint / paintGrade);
            byte allWhite = (byte) (totalClasses * WhitePaint);
            byte justBrown = (byte) (totalClasses * brownPaint );
            System.out.println("В школе, где " + totalClasses +  " классов, нужно " + allWhite + " банок белой краски и "+ justBrown +" банок коричневой краски" );


        System.out.println("     задание 6");
        short banana = (short) (5 * 80);
        short milk = (short) (105 * 2);
        short cream = (short) (100 * 2);
        short eggs = (short) (70 * 4);
        short totalWeight = (short) (banana + milk +  cream + eggs);
        float kgWeight = totalWeight / 1000F;
        System.out.println("Вес завтрака " + kgWeight + " кг" );


        System.out.println("     задание 7");
        short massGram = 7 * 1000;

        short day250 = (short) (massGram / 250);
        System.out.println(day250 + " дней понадобится спорцмену если он будет терять в день 250 грамм");
        short day500 = (short) (massGram / 500);
        System.out.println(day500 + " дней понадобится спорцмену если он будет терять в день 500 грамм");
        short general = (short) (day250 + day500);
        short average = (short) (general / 2);
        System.out.println(" в среднем может быть потребоваться " +  average + " день");



        System.out.println("     задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int monthBoostM = masha / 10 + masha;
        System.out.println("Маша теперь получает " + monthBoostM + " рублей");
        int monthBoostD = denis / 10 + denis;
        System.out.println("Денис теперь получает " + monthBoostD + " рублей");
        int monthBoostK = kristina / 10 + kristina;
        System.out.println("Кристина теперь получает " + monthBoostK + " рублей");
        int annualDifferenceM = monthBoostM * 12 - masha * 12;
        System.out.println("Годовой доход Маши вырос на " + annualDifferenceM + " рублей");
        int annualDifferenceD = monthBoostD * 12 - denis * 12;
        System.out.println("Годовой доход Дениса вырос на " + annualDifferenceD + " рублей");
        int annualDifferenceK = monthBoostK * 12 - kristina * 12;
        System.out.println("Годовой доход Кристины вырос на " + annualDifferenceK + " рублей");






    }

}