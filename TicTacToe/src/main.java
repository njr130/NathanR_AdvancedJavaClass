import javax.swing.JFrame;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAndShowGUI();
	}

	public static void createAndShowGUI() {
		TicTacToeBoard board = new TicTacToeBoard();
		JFrame frame = new JFrame("Tic Tac Toe Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(622, 722);
		frame.setVisible(true);
		frame.add(board);
	}
}
