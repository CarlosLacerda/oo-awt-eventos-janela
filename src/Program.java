import java.awt.*;
import java.awt.event.*;

public class Program {
	public static void main(String[] args) {
		
		WindowAdapter wn = new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Aplicação encerrada");
				System.exit(0);
			}
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("Janela aberta.");
			}
	
		};
		
		Frame frame = new Frame("Cadastro");
		frame.addWindowListener(wn);
		frame.setSize(450, 300);
		frame.setLayout(new FlowLayout());
		
		Label lname = new Label("Nome: ");
		TextField txtname = new TextField(20);
		Label lObs = new Label("Observações: ");
		TextArea txtObs = new TextArea(5, 30);
		Button btnSalvar = new Button("Salvar");
		
		
		btnSalvar.addActionListener(e -> {
			String nome = txtname.getText();
			String obs = txtObs.getText();
			System.out.println("----- Dados informados -----");
			System.out.println("Nome: " + nome);
			System.out.println("Observação:");
			System.out.println(obs);
			txtname.setText("");
			txtObs.setText("");
		});
		
		frame.add(lname);
		frame.add(txtname);
		frame.add(lObs);
		frame.add(txtObs);
		frame.add(btnSalvar);
		frame.setVisible(true);
	}
}