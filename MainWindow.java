package bereaattend;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;



public class MainWindow {

	protected Shell shell;
	private Text txtEnterBnumber;
	private Text txtEnterPassword;
	
	private String EnterBnumber  = null;
    private String EnterPassword  = null;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
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
		shell.setImage(SWTResourceManager.getImage(MainWindow.class, "/bereaattend/logo.png"));
		shell.setSize(655, 451);
		shell.setText("SWT Application");
		
		CLabel lblBereaattend = new CLabel(shell, SWT.NONE);
		lblBereaattend.setImage(SWTResourceManager.getImage(MainWindow.class, "/bereaattend/berealogo.jpg"));
		lblBereaattend.setBounds(78, 10, 286, 52);
		lblBereaattend.setText("BereaATTEND- An Attendance Management System");
		
		CLabel logo = new CLabel(shell, SWT.NONE);
		logo.setImage(SWTResourceManager.getImage(MainWindow.class, "/bereaattend/berealogo.jpg"));
		logo.setBounds(10, 64, 226, 167);
		logo.setText("");
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(137, 260, 67, 15);
		lblUsername.setText("B-Number");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(137, 298, 55, 15);
		lblPassword.setText("Password");
		
		Button btnLogin = new Button(shell, SWT.NONE);
		btnLogin.setBounds(303, 347, 75, 25);
		btnLogin.setText("LOGIN");
		
		txtEnterBnumber = new Text(shell, SWT.BORDER);
		txtEnterBnumber.setText("enter B-number");
		txtEnterBnumber.setBounds(209, 257, 105, 21);
		
		txtEnterPassword = new Text(shell, SWT.BORDER);
		txtEnterPassword.setText("enter password");
		txtEnterPassword.setBounds(209, 295, 105, 21);
		
		btnLogin.addListener(SWT.Selection, new Listener() {
	            public void handleEvent(Event event) {
	 
	            	EnterBnumber = txtEnterBnumber.getText();
	            	EnterPassword = txtEnterPassword.getText();
	 
	                if (EnterBnumber == null || EnterBnumber.isEmpty() || EnterPassword == null || EnterPassword.isEmpty()) {
	                    String errorMsg = null;
	                    MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
	 
	                    messageBox.setText("Alert");
	                    if (EnterBnumber == null || EnterBnumber.isEmpty()) {
	                        errorMsg = "Please enter username";
	                    } else if (EnterPassword == null || EnterPassword.isEmpty()) {
	                        errorMsg = "Please enter password";
	                    }
	                    if (errorMsg != null) {
	                        messageBox.setMessage(errorMsg);
	                        messageBox.open();
	                    }
	                } else {
	                    MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_WORKING);
	                    messageBox.setText("Info");
	                    messageBox.setMessage("Valid");
	                    messageBox.open();
	                }
	            }
	        });
	 
	    }
	 
	}