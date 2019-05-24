package test.hr;

import javax.swing.JOptionPane;

public class empmgrTest_소현우 {
	public static void main(String[] args) {
		String jtitle[]=new String[2];
		jtitle[0]=JOptionPane.showInputDialog("업무명을 입력하세요");
		jtitle[1]=JOptionPane.showInputDialog("업무명을 입력하세요");
		EmpManager_소현우.printEmployee(jtitle);
	}
}
