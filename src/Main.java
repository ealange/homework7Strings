public class Main {

    public static void main(String[] args) {
//      task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);
        System.out.println("ФИО сотрудника — " + fullName);
//      task2
        String nameUpperCase = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для заполнения отчета — " + nameUpperCase);
//      task3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        fullName = fullName.replace('Ё', 'Е');
        System.out.println("ФИО сотрудника — " + fullName);
//      task4
        fullName = "Ivanov Ivan Ivanovich";
        firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        System.out.println("Имя сотрудника - " + firstName);
        lastName = fullName.substring(0, fullName.indexOf(' '));
        System.out.println("Фамилия сотрудника - " + lastName);
        middleName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.length());
        System.out.println("Отчество сотрудника - " + middleName);
//      task5
        fullName = "ivanov ivan ivanovich";
        char nameToArray[] = fullName.toCharArray();
        nameToArray[0] = Character.toUpperCase(nameToArray[0]);
        for (int i = 0; i < nameToArray.length; i++) {
            if (nameToArray[i] == ' ') nameToArray[i + 1] = Character.toUpperCase(nameToArray[i + 1]);
        }
        fullName = new String(nameToArray);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв —" + fullName);
//      task6
        String example1 = "1305";
        String example2 = "2496";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < example1.length(); i++) {
            sb.append(example1.charAt(i));
            sb.append(example2.charAt(i));
        }
        System.out.println("Данные строки " + sb);
//      task7
        String lettersDouble = "aaabccddeeeeeeeeefgghiijjkk";
        boolean doubleLetterNotPrinted = true;
        int i = 1;
        while (i < lettersDouble.length()) {
            if (lettersDouble.charAt(i) != lettersDouble.charAt(i - 1)) {
                i = i + 1;
                doubleLetterNotPrinted = true;
            } else if (doubleLetterNotPrinted) {
                System.out.print(lettersDouble.charAt(i));
                doubleLetterNotPrinted = false;
                i = i + 1;
            } else i = i + 1;


        }


    }


}