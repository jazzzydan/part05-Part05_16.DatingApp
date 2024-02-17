
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        // System.out.println("Try " + date.afterNumberOfDays(790));

//        NB! Instead of modifying the state of the old object we return a new one.
//        Imagine that the SimpleDate class has a method advance that works similarly
//        to the method we programmed, but it modifies the state of the old object.
//        In that case the next block of code would cause problems.
//
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
//        The output of the program should be like this:
//
//        Sample output
//        Now: 20.2.2015
//        After one week: 20.2.2015
//
//        This is because a normal assignment only copies the reference to the object.
//        So the objects now and afterOneWeek in the program now refer to the one and same
//        SimpleDate object.
    }
}
