import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField.*;
import javax.swing.event.*;
import java.math.*;
import java.lang.Integer.*;

public class Calculator extends JFrame implements ActionListener{
	public JTextField operation, results;
	public JButton num[];
	public boolean flag = false, flag_1 = false;
	public double a = 0, b = 0;
	public char C;
	String str[] = {"C", "←", "n!", "√","7 ", "8 ", "9 ", "/ ", "4 ", "5 ", "6 ", "* ", "1 ", "2 ", "3 ", "- ", "0 ", ". ", "= ", "+ "};
	public Calculator(){
		super("计算器");
		this.setBounds(400,390,430,360);
		this.setResizable(false);
		this.setBackground(java.awt.Color.lightGray);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		operation = new JTextField("0",32);
		operation.setHorizontalAlignment(JTextField.TRAILING);//尾部对齐
		this.getContentPane().add(operation);
		operation.setEditable(false);
		results = new JTextField("0",32);
		results.setHorizontalAlignment(JTextField.TRAILING);
		this.getContentPane().add(results);operation.setHorizontalAlignment(JTextField.TRAILING);
		results.setEditable(false);
		this.num = new JButton[str.length];
		for(int i = 0; i < str.length; i++){
			this.add(this.num[i] = new JButton(str[i]));
			num[i].addActionListener(this);
			num[i].setIcon(new ImageIcon("dddd.png"));
		}
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ev){
		if(ev.getSource() == num[0]){
			flag = false;
			flag_1 = false;
			operation.setText("0");
			results.setText("0");
		}
		if(ev.getSource() == num[1]){
			String str = results.getText(), str1 = operation.getText();
			if(str.length() - 1 == 1){
				flag = false;
				flag_1 = false;
			}
			int len1 = str.length() - 1;
			int len2 = str1.length() - 1;
			int len = len1;
			if(len2 < len)
				len = len2;
			if(len >= 1){
				str = removeChar(str.length() - 1, str);
				str1 = removeChar(str1.length() - 1, str1);
			}
		    else {
		    	str = "0";
		    	str1 = "0";
		    }
			results.setText(str);
			operation.setText(str1);
		}
		if(ev.getSource() == num[2]){
			if(isNumeric(results.getText())){
				int sum = 1;
				int n = Integer.valueOf(results.getText()).intValue();
				for(int i = 1; i <= n; i++){
					sum *= i;
				}
				if(n > 10){
					results.setText("超出运算范围");
				}
				else {
					results.setText(sum + "");
				}
				operation.setText(n + "! = ");
			}
			else {
				results.setText("阶乘只能为整数");
				operation.setText("阶乘只能为整数");
			}
		}
		if(ev.getSource() == num[3]){
			double n = Double.valueOf(results.getText()).doubleValue();
			operation.setText("√" + n + " = ");
			double sum = Math.sqrt(n);
			results.setText(sum + "");
		}
		if(ev.getSource() == num[16]){
			int t = 0;
			if(flag){
				results.setText(results.getText() + "0");
				operation.setText(operation.getText() + "0");
				t = 1;
			}
			if(t != 1){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n != 0)
					results.setText(results.getText() + "0");
				else results.setText("0");
			}
		}
		if(ev.getSource() == num[17]){
			if(!flag){
				operation.setText(results.getText() + ".");
				results.setText(results.getText() + ".");
			}
			flag = true;
		}
		if(ev.getSource() == num[4]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("7");
					if(!flag_1)
						operation.setText("7");
					else operation.setText(operation.getText() + "7");
				}
				else {
					results.setText(results.getText() + "7");
					operation.setText(operation.getText() + "7");
				}
			}
			else {
				results.setText(results.getText() + "7");
				operation.setText(operation.getText() + "7");
			}
		}
		if(ev.getSource() == num[5]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("8");
					if(!flag_1)
						operation.setText("8");
					else operation.setText(operation.getText() + "8");
				}
				else {
					results.setText(results.getText() + "8");
					operation.setText(operation.getText() + "8");
				}
			}
			else {
				results.setText(results.getText() + "8");
				operation.setText(operation.getText() + "8");
			}
		}
		if(ev.getSource() == num[6]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("9");
					if(!flag_1)
						operation.setText("9");
					else operation.setText(operation.getText() + "9");
				}
				else {
					results.setText(results.getText() + "9");
					operation.setText(operation.getText() + "9");
				}
			}
			else {
				results.setText(results.getText() + "9");
				operation.setText(operation.getText() + "9");
			}
		}
		if(ev.getSource() == num[8]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("4");
					if(!flag_1)
						operation.setText("4");
					else operation.setText(operation.getText() + "4");
				}
				else {
					results.setText(results.getText() + "4");
					operation.setText(operation.getText() + "4");
				}
			}
			else {
				results.setText(results.getText() + "4");
				operation.setText(operation.getText() + "4");
			}
		}
		if(ev.getSource() == num[9]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("5");
					if(!flag_1)
						operation.setText("5");
					else operation.setText(operation.getText() + "5");
				}
				else {
					results.setText(results.getText() + "5");
					operation.setText(operation.getText() + "5");
				}
			}
			else {
				results.setText(results.getText() + "5");
				operation.setText(operation.getText() + "5");
			}
		}
		if(ev.getSource() == num[10]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("6");
					if(!flag_1)
						operation.setText("6");
					else operation.setText(operation.getText() + "6");
				}
				else {
					results.setText(results.getText() + "6");
					operation.setText(operation.getText() + "6");
				}
			}
			else {
				results.setText(results.getText() + "6");
				operation.setText(operation.getText() + "6");
			}
		}
		if(ev.getSource() == num[12]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("1");
					if(!flag_1)
						operation.setText("1");
					else operation.setText(operation.getText() + "1");
				}
				else {
					results.setText(results.getText() + "1");
					operation.setText(operation.getText() + "1");
				}
			}
			else {
				results.setText(results.getText() + "1");
				operation.setText(operation.getText() + "1");
			}
		}
		if(ev.getSource() == num[13]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("2");
					if(!flag_1)
						operation.setText("2");
					else operation.setText(operation.getText() + "2");
				}
				else {
					results.setText(results.getText() + "2");
					operation.setText(operation.getText() + "2");
				}
			}
			else {
				results.setText(results.getText() + "2");
				operation.setText(operation.getText() + "2");
			}
		}
		if(ev.getSource() == num[14]){
			if(!flag){
				int n = Integer.valueOf(results.getText()).intValue();
				if(n == 0){
					results.setText("3");
					if(!flag_1)
						operation.setText("3");
					else operation.setText(operation.getText() + "3");
				}
				else {
					results.setText(results.getText() + "3");
					operation.setText(operation.getText() + "3");
				}
			}
			else {
				results.setText(results.getText() + "3");
				operation.setText(operation.getText() + "3");
			}
		}
		String str = operation.getText(), str1 = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] >= '0' && ch[i]<= '9' || ch[i] == '.')
				str1 += ch[i];
			else break;
		}
		double a = Double.valueOf(str1).doubleValue();//
		if(ev.getSource() == num[7]){
			if(!flag_1)
				operation.setText(str + "/");
			else operation.setText(a + "/");
			C = '/';
			flag_1 = true;
			flag = false;
			results.setText("0");
		}
		if(ev.getSource() == num[11]){
			if(!flag_1)
				operation.setText(str + "*");
			else operation.setText(a + "*");
			C = '*';
			flag = false;
			flag_1 = true;
			results.setText("0");
		}
		if(ev.getSource() == num[15]){
			if(!flag_1)
				operation.setText(str + "-");
			else operation.setText(a + "-");
			C = '-';
			flag = false;
			flag_1 = true;
			results.setText("0");
		}
		if(ev.getSource() == num[19]){
			if(!flag_1)
				operation.setText(str + "+");
			else operation.setText(a + "+");
			C = '+';
			flag = false;
			flag_1 = true;
			results.setText("0");
		}
		if(ev.getSource() == num[18]){
			if(C == '+'){
				double b = Double.valueOf(results.getText()).doubleValue();
				double c = a + b;
				a = c;
				flag = true;
				flag_1 = false;
				results.setText(c + "");
				operation.setText(c + "");
			}
			if(C == '-'){
				double b = Double.valueOf(results.getText()).doubleValue();
				double c = a - b;
				a = c;
				flag = true;
				flag_1 = false;
				results.setText(c + "");
				operation.setText(c + "");
			}
			if(C == '*'){
				double b = Double.valueOf(results.getText()).doubleValue();
				double c = a * b;
				a = c;
				flag = true;
				flag_1 = false;
				results.setText(c + "");
				operation.setText(c + "");
			}
			if(C == '/'){
				double b = Double.valueOf(results.getText()).doubleValue();
				if(b == 0){
					flag = true;
					flag_1 = false;
					results.setText("除数不能为零");
					operation.setText("除数不能为零");
				}
				else{
					double c = a / b;
					a = c;
					flag = true;
					flag_1 = false;
					results.setText(c + "");
					operation.setText(c + "");
				}
			}
			C = ' ';
		}
	}
	public static boolean isNumeric(String s){
		if((s != null)&&(s!=""))
			return s.matches("^[0-9]*$");
		else return false;
	}
	public static String removeChar(int index,String Str){
		Str = Str.substring(0,index)+Str.substring(index+1,Str.length());//substring的取值范围是:[,)
		return Str;
	}
	public static void main(String args[]){
		new Calculator();
	}
}