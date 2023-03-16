package Lesson2;

public class SnilsValidatorImpl implements SnilsValidator{
    @Override
    public boolean validate(String snils) {
//Проверка №1
        if (snils.length() != 11) {
            return false;
        }
        //Проверка №2
        char[] charArray = snils.toCharArray();
        for (int i = 0; i < snils.length(); i++) {
            char a = charArray[i];
            if (!(Character.isDigit(a))) {
                return false;
            }
        }
        // Проверяем контрольное число
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (snils.charAt(i) - '0') * (9 - i);
        }
        int checkDigit = Integer.parseInt(snils.substring(9));
        if (sum < 100) {
            return checkDigit == sum;
        } else if (sum == 100 || sum == 101) {
            return checkDigit == 0;
        } else {
            return checkDigit == (sum % 101);
        }

    }
}
