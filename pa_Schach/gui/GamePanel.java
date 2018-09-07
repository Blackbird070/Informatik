package pa_Schach.gui;

import pa_Schach.Board;
import pa_Schach.Schachfigur;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Luecx on 08.08.2017.
 */
public class GamePanel extends JPanel {


    private Board g;

    public Color color_black = Color.gray;
    public Color color_white = Color.white;
    public Color color_selected = Color.green;
    public Color color_available = Color.pink;
    public Color color_takeable = Color.red;

    private JButton[][] buttons = new JButton[8][8];
    private static ImageIcon[][] icons = new ImageIcon[6][2];

    static {
        for (int i = 0; i < 6; i++) {
            for (int n = 0; n < 2; n++) {
                int a = i;
                if (a == 1 || a == 2) {
                    a++;
                } else if (a == 3) {
                    a = 1;
                }
                icons[a][n] = new ImageIcon("src/pa_schach/gui/" + (i + 1) + "" + (n + 1) + ".gif");
                icons[a][n].setImage(icons[a][n].getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
            }
        }
    }

    private ImageIcon getIcon(int x, int y) {
        if (g.getSchachAr()[x][y].getFigur() == null) return null;
        Schachfigur f = g.getSchachAr()[x][y].getFigur();
        return icons[f.getTyp() - 1][f.getFarbe() > 0 ? 0 : 1];
    }

    public GamePanel(Board g) {
        super();

        this.g = g;
        this.setLayout(new GridLayout(8, 8));

        for (int i = 7; i >= 0; i--) {
            for (int n = 0; n < 8; n++) {
                JButton b = new JButton();

                b.setLayout(null);
                b.setBorder(new LineBorder(Color.black, 2));
                b.setFocusPainted(false);
                b.setOpaque(true);
                b.setFont(new Font("Arial", 1, 50));

                final int x = n;
                final int y = i;

                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        click(x, y);
                    }
                });

                this.add(b);
                buttons[x][y] = b;
            }
        }
        updateBackgrounds();
    }


    public void updateBackgrounds() {
        for (int i = 0; i < 8; i++) {
            for (int n = 0; n < 8; n++) {
                buttons[i][n].setBackground((i % 2 == 1 && n % 2 == 0 || i % 2 == 0 && n % 2 == 1 ? color_black : color_white));
                buttons[i][n].setIcon(getIcon(i, n));
            }
        }
//        if (selected_x != -1) {
//            for (Move z : g.getPossibleMoves()) {
//                if (z.getX_from() == selected_x && z.getY_from() == selected_y) {
//                    if (g.getField().getValue(z.getX_to(), z.getY_to()) != 0) {
//                        buttons[z.getX_to()][z.getY_to()].setBackground(color_takeable);
//                    } else {
//                        buttons[z.getX_to()][z.getY_to()].setBackground(color_available);
//                    }
//                }
//            }
//            buttons[selected_x][selected_y].setBackground(color_selected);
//        }
    }

    private int selected_x = -1;
    private int selected_y = -1;

    private void click(int x, int y) {
//        if (selected_x == -1) {
//            if (g.getField().getValue(x, y) * g.getActivePlayer() > 0) {
//                selected_x = x;
//                selected_y = y;
//            }
//        } else {
//            if (x == selected_x && selected_y == y) {
//                selected_x = -1;
//            } else if (g.getField().getValue(x, y) * g.getActivePlayer() > 0) {
//                selected_x = x;
//                selected_y = y;
//            } else {
//                for (Move z : g.getPossibleMoves()) {
//                    if (z.getX_from() == selected_x && z.getY_from() == selected_y && z.getX_to() == x && z.getY_to() == y) {
//                        g.move(z);
//
//                        LinkedList<Move> possible = g.getPossibleMoves();
//                        g.orderPossibleMoves(possible);
//                        for (Move m : possible) {
//                            System.out.println(m);
//                        }
//                        //g.move(KI.getBestMove(g,5));
//
//                        selected_x = -1;
//                        break;
//                    }
//                }
//            }
//        }
        updateBackgrounds();
    }

}
