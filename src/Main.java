public class Main {
    public static void main(String[] args) {
        //task-1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task-2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task-3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task-4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task-5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task-6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var sum = boxerWeight1 + boxerWeight2;
        System.out.println(sum + " кг");
        var residue = boxerWeight2 - boxerWeight1;
        System.out.println(residue + " кг");

        //task-7
        var difference = boxerWeight2 % boxerWeight1;
        System.out.println(difference + " кг");

        //task-8
        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalPersons = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании — " + totalPersons + " человек.");
        totalPersons = totalPersons + 94;
        var totalHours2 = totalPersons * hoursPerPerson;
        System.out.println("Если в компании работает " + totalPersons + " человека, то всего " + totalHours2 +
                " часа работы может быть поделено между сотрудниками.");
    }
}