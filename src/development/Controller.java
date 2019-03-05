package development;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	
	private Data model;
	private Window view;
	
	public Controller(Data model,Window view) {
		setModel(model);
		setView(view);
	}
	
	public void increment() {
		getModel().setNumber(getModel().getNumber()+1);
		getModel().setNumber2(getModel().getNumber2()+2);
	}
	
	public static void main(String[] args) {
		Data model = new Data();
		Window view = new Window();
		Controller cont = new Controller(model,view);
		model.addObserver(view);
	
		view.getButton_1().setActionCommand("btn1");
		view.getButton_1().addActionListener(cont);
		view.getButton_2().setActionCommand("btn2");
		view.getButton_2().addActionListener(cont);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view.getJFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand()== "btn1") {
			System.out.println("Number 1 : " + getModel().getNumber());
			System.out.println("Number 2 : " + getModel().getNumber2());
			System.out.println("Button 1 is pressed.");
			System.out.println("Numbers are incremented.");
			increment();
			System.out.println("Number 1 : " + getModel().getNumber());
			System.out.println("Number 2 : " + getModel().getNumber2());
			
		}
		else if(arg0.getActionCommand()== "btn2") {
			System.out.println("Button 2 is pressed.");
		}
		
	}

	public Data getModel() {
		return model;
	}

	public void setModel(Data model) {
		this.model = model;
	}

	public Window getView() {
		return view;
	}

	public void setView(Window view) {
		this.view = view;
	}

	

}
