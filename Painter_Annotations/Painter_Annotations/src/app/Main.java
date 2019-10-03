package app;

import dao.HibernateUtil;
import gui.Login;

public class Main {
	public static void main(String[] args) {
            if (HibernateUtil.getSessionFactory() != null) {
                new Login().setVisible(true);
            }
	}
}