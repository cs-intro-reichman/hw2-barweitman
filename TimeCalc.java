public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int add = Integer.parseInt(args[1]);
        String hours = String.valueOf(time.charAt(0)) + String.valueOf(time.charAt(1));
        String minutes = String.valueOf(time.charAt(3)) + String.valueOf(time.charAt(4));
        int totalminutes = (Integer.parseInt(hours) * 60) + Integer.parseInt(minutes) + add;
        int totalhours = totalminutes / 60; 
        int newhours = totalhours % 24; 
        int newminutes = totalminutes - (totalhours * 60);

        if (newhours < 10 && newminutes < 10) 
            System.out.println("0" + newhours + ":" + "0"+ newminutes);
        if (newhours < 10 && newminutes >= 10) 
            System.out.println("0" + newhours + ":" + newminutes);
        if (newhours >= 10 && newminutes < 10) 
            System.out.println(newhours + ":" + "0"+ newminutes);
        if (newhours >= 10 && newminutes >= 10) 
            System.out.println(newhours + ":" + newminutes);

       // Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
       // Total hours = 4685 / 60 = 78;
       // New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo
       // New minutes = 4685 – (78 * 60) = 5;
    }
}
