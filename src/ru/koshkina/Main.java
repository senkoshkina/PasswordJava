package ru.koshkina;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        int p, k = 3, q;
        int pass = 12345;
        String ps;

        UIManager.put("OptionPane.yesButtonText"   , "Да"    );
        UIManager.put("OptionPane.noButtonText"    , "Нет"   );
        UIManager.put("OptionPane.cancelButtonText", "Отмена");
        UIManager.put("OptionPane.okButtonText"    , "Готово");

        do {
            ps = JOptionPane.showInputDialog(null, "Введите пароль:", "Авторизация", JOptionPane.QUESTION_MESSAGE);
            if(ps == null){
                JOptionPane.showMessageDialog(null, "Bye!");
                System.exit(0);
            }
            p = Integer.parseInt(ps);
            k--;
            if(p != pass) {
                q = JOptionPane.showConfirmDialog(null, "Попробовать еще?", "Again?", JOptionPane.YES_NO_OPTION);
                if(q == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bye!");
                    System.exit(0);
                }
            }
        } while (p != pass && k > 0);

        if(p == pass) {
            JOptionPane.showMessageDialog(null, "WELCOME");
        } else {
            JOptionPane.showMessageDialog(null, "GO AWAY!!!");
        }
    }
}
