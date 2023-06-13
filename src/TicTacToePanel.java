import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.util.Objects;

public class TicTacToePanel extends JPanel implements ActionListener {
    private TicTacToeGame controller;
    private GridLayout panelLayout;

    private JButton tile1;
    private JButton tile2;
    private JButton tile3;
    private JButton tile4;
    private JButton tile5;
    private JButton tile6;
    private JButton tile7;
    private JButton tile8;
    private JButton tile9;
    //private JButton startOver
    private ImageIcon pSymbol;
    private ImageIcon aiSymbol;
    private ImageIcon happrabbit;
    private ImageIcon happcatt;

    public TicTacToePanel(TicTacToeGame controllerRef) {
        super();
        controller = controllerRef;
        panelLayout = new GridLayout(3, 3);

        happrabbit = new ImageIcon("src//happrabbit.png");
        Image rabbitPic = happrabbit.getImage();
        Image scaledRabbitPic = rabbitPic.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        happrabbit = new ImageIcon(scaledRabbitPic);
        happcatt = new ImageIcon("src//happcatt.png");
        Image cattPic = happcatt.getImage();
        Image scaledCattPic = cattPic.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        happcatt = new ImageIcon(scaledCattPic);

        setupPanel();
        setupListeners();
    }

    public void setupSymbols() {
        if (controller.getPlayerSymbol().equals("catt")) {
            pSymbol = happcatt;
            aiSymbol = happrabbit;
        } else {
            pSymbol = happrabbit;
            aiSymbol = happcatt;
        }
    }

    public void setupPanel() {
        tile1 = new JButton("Tile 1!");
        tile2 = new JButton("Tile 2!");
        tile3 = new JButton("Tile 3!");
        tile4 = new JButton("Tile 4!");
        tile5 = new JButton("Tile 5!");
        tile6 = new JButton("Tile 6!");
        tile7 = new JButton("Tile 7!");
        tile8 = new JButton("Tile 8!");
        tile9 = new JButton("Tile 9!");
        //startOver = new JButton("Start Over");
        setLayout(panelLayout);
        add(tile1);
        add(tile2);
        add(tile3);
        add(tile4);
        add(tile5);
        add(tile6);
        add(tile7);
        add(tile8);
        add(tile9);
        //add(startOver);
    }

    private void updateScreenPlayerMove(String tile) {
        setupSymbols();
        if (!controller.getAIWin() && !controller.getPlayerWin()) {
            if (tile.contains("1")) {
                tile1.setIcon(pSymbol);
                tile2.setText("");
                //tile1.setFont(new Font("Courier", Font.BOLD,100));
                tile1.setEnabled(false);
                controller.setPlayerOrAITaken(1, "player");
            } else if (tile.contains("2")) {
                tile2.setDisabledIcon(pSymbol);
                tile2.setText("");
                //tile2.setFont(new Font("Courier", Font.BOLD,100));
                tile2.setEnabled(false);
                controller.setPlayerOrAITaken(2, "player");
            } else if (tile.contains("3")) {
                tile3.setDisabledIcon(pSymbol);
                tile3.setText("");
                //tile3.setFont(new Font("Courier", Font.BOLD,100));
                tile3.setEnabled(false);
                controller.setPlayerOrAITaken(3, "player");
            } else if (tile.contains("4")) {
                tile4.setDisabledIcon(pSymbol);
                tile4.setText("");
                //tile4.setFont(new Font("Courier", Font.BOLD,100));
                tile4.setEnabled(false);
                controller.setPlayerOrAITaken(4, "player");
            } else if (tile.contains("5")) {
                tile5.setDisabledIcon(pSymbol);
                tile5.setText("");
                //tile5.setFont(new Font("Courier", Font.BOLD,100));
                tile5.setEnabled(false);
                controller.setPlayerOrAITaken(5, "player");
            } else if (tile.contains("6")) {
                tile6.setDisabledIcon(pSymbol);
                tile6.setText("");
                //tile6.setFont(new Font("Courier", Font.BOLD,100));
                tile6.setEnabled(false);
                controller.setPlayerOrAITaken(6, "player");
            } else if (tile.contains("7")) {
                tile7.setDisabledIcon(pSymbol);
                tile7.setText("");
                //tile7.setFont(new Font("Courier", Font.BOLD,100));
                tile7.setEnabled(false);
                controller.setPlayerOrAITaken(7, "player");
            } else if (tile.contains("8")) {
                tile8.setDisabledIcon(pSymbol);
                tile8.setText("");
                //tile8.setFont(new Font("Courier", Font.BOLD,100));
                tile8.setEnabled(false);
                controller.setPlayerOrAITaken(8, "player");
            } else if (tile.contains("9")) {
                tile9.setDisabledIcon(pSymbol);
                tile9.setText("");
                //tile9.setFont(new Font("Courier", Font.BOLD,100));
                tile9.setEnabled(false);
                controller.setPlayerOrAITaken(9, "player");
            }
            System.out.println("tile updated");
        }
    }

    public void updateScreenAIMove() {
        if (!controller.getPlayerWin() && !controller.getAIWin()) {
            int aiMove = controller.aiMove();
            if (aiMove == 1) {
                tile1.setDisabledIcon(aiSymbol);
                tile1.setFont(new Font("Courier", Font.BOLD,70));
                tile1.setEnabled(false);
                controller.setPlayerOrAITaken(1, "ai");
            } else if (aiMove == 2) {
                tile2.setDisabledIcon(aiSymbol);
                tile2.setFont(new Font("Courier", Font.BOLD,28));
                tile2.setEnabled(false);
                controller.setPlayerOrAITaken(2, "ai");
            } else if (aiMove == 3) {
                tile3.setDisabledIcon(aiSymbol);
                tile3.setFont(new Font("Courier", Font.BOLD,28));
                tile3.setEnabled(false);
                controller.setPlayerOrAITaken(3, "ai");
            } else if (aiMove == 4) {
                tile4.setDisabledIcon(aiSymbol);
                tile4.setFont(new Font("Courier", Font.BOLD,28));
                tile4.setEnabled(false);
                controller.setPlayerOrAITaken(4, "ai");
            } else if (aiMove == 5) {
                tile5.setDisabledIcon(aiSymbol);
                tile5.setFont(new Font("Courier", Font.BOLD,28));
                tile5.setEnabled(false);
                controller.setPlayerOrAITaken(5, "ai");
            } else if (aiMove == 6) {
                tile6.setDisabledIcon(aiSymbol);
                tile6.setFont(new Font("Courier", Font.BOLD,28));
                tile6.setEnabled(false);
                controller.setPlayerOrAITaken(6, "ai");
            } else if (aiMove == 7) {
                tile7.setDisabledIcon(aiSymbol);
                tile7.setFont(new Font("Courier", Font.BOLD,28));
                tile7.setEnabled(false);
                controller.setPlayerOrAITaken(7, "ai");
            } else if (aiMove == 8) {
                tile8.setDisabledIcon(aiSymbol);
                tile8.setFont(new Font("Courier", Font.BOLD,28));
                tile8.setEnabled(false);
                controller.setPlayerOrAITaken(8, "ai");
            } else if (aiMove == 9) {
                tile9.setDisabledIcon(aiSymbol);
                tile9.setFont(new Font("Courier", Font.BOLD,28));
                tile9.setEnabled(false);
                controller.setPlayerOrAITaken(9, "ai");
            }
        }
        System.out.println("ai moved");
    }

    private void setupListeners() {
        tile1.addActionListener(this);
        tile2.addActionListener(this);
        tile3.addActionListener(this);
        tile4.addActionListener(this);
        tile5.addActionListener(this);
        tile6.addActionListener(this);
        tile7.addActionListener(this);
        tile8.addActionListener(this);
        tile9.addActionListener(this);
        //startOver.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        JButton clickedButton = (JButton) source;
        String text = clickedButton.getText();

        if (text.contains("Tile")) {
            System.out.println("tile clicked");
            updateScreenPlayerMove(text);
            updateScreenAIMove();
        }
//            } else if (text.equals("Start Over")) {
//                //controller.reset();
//                controller = new TicTacToeGame();
//            }
    }


    //button.newPreference(setDimension)
}