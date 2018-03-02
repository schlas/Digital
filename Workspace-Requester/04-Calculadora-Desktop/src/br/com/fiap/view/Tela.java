package br.com.fiap.view;

import org.apache.axis2.AxisFault;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import br.com.fiap.ws.bo.FiapBOStub;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMedia;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMediaResponse;

public class Tela {

	protected Shell shell;
	private Text txtNac;
	private Text txtPs;
	private Text txtAm;
	private Text txtResultado;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(316, 300);
		shell.setText("SWT Application");
		
		Label lblNac = new Label(shell, SWT.NONE);
		lblNac.setBounds(21, 10, 31, 15);
		lblNac.setText("NAC");
		
		Label lblPs = new Label(shell, SWT.NONE);
		lblPs.setBounds(21, 57, 31, 15);
		lblPs.setText("PS");
		
		Label lblAm = new Label(shell, SWT.NONE);
		lblAm.setText("AM");
		lblAm.setBounds(21, 101, 31, 15);
		
		txtNac = new Text(shell, SWT.BORDER);
		txtNac.setBounds(69, 7, 61, 21);
		
		txtPs = new Text(shell, SWT.BORDER);
		txtPs.setBounds(69, 54, 61, 21);
		
		txtAm = new Text(shell, SWT.BORDER);
		txtAm.setBounds(69, 98, 61, 21);
		
		Button btnCalcular = new Button(shell, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				float nac = Float.parseFloat(txtNac.getText());
				float ps = Float.parseFloat(txtPs.getText());
				float am = Float.parseFloat(txtAm.getText());
				
				try {
					FiapBOStub stub = new FiapBOStub();
					CalcularMedia calcMed = new CalcularMedia();
					
					calcMed.setNac(nac);
					calcMed.setPs(ps);
					calcMed.setAm(am);
					
					CalcularMediaResponse resposta = stub.calcularMedia(calcMed);
					
					//float media = resposta.get_return();
					
					txtResultado.setText(String.valueOf(resposta.get_return()));					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
			}
		});
		btnCalcular.setBounds(10, 205, 280, 46);
		btnCalcular.setText("Calcular");
		
		txtResultado = new Text(shell, SWT.BORDER);
		txtResultado.setEditable(false);
		txtResultado.setBounds(102, 158, 85, 21);

	}
}
