package br.ufpb.atividade5.poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZooGUI {
        public static void main(String [] args){
            JFrame janela = new JFrame();
            janela.setTitle("Janela de Ayla");
            janela.setLocation(0,0);
            janela.setSize(400,400);
            JButton botao = new JButton("Meu Botão");
            botao.setToolTipText("Dica: Meu botão de teste");
            botao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(janela, "Testando botão");
                }
            });
            janela.setLayout(new GridLayout(3,1));
            janela.add(new JLabel());
            janela.add(botao);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
        }
    }
