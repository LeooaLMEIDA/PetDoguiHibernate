package br.com.unipar.hibernateteste;

import br.com.unipar.hibernateteste.model.util.EntityManagerUtil;

public class HibernateTeste {
    public static void main(String[] args) {

        EntityManagerUtil.getEntityManagerFactory();
        
        TelaPetDogui tela = new TelaPetDogui();
        tela.setVisible(true);
    }
}