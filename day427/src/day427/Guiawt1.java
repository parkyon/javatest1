package day427;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Guiawt1 {
	
	public static void main(String[] args) {
	
		new FrameEx1();
	}
}

class FrameEx1 extends Frame{
	Button bt_ok, bt_cancer;
	Panel p;
	public FrameEx1() {
		this.setFrame();
		p = new Panel();
		this.setButton();
		
		ListenerEx1 listener = new ListenerEx1(this);
		this.addWindowListener(listener);
		this.bt_ok.addActionListener(listener);
		this.bt_cancer.addActionListener(listener);
	}
	public void setFrame() {
		this.setSize(500,400);    //�������� ũ�� ����   x,y��ǥ   ����ü ũ��
		this.setLayout(new FlowLayout());   //������Ʈ ������� ��ġ����
		this.setVisible(true);   //���� �������� �����ְڴ�.   Ȱ��ȭ/��Ȱ��ȭ
		this.setLocation(100, 100); //�����Ҷ� frame�� ��ġ ����
	}
	
	public void setButton() {
		bt_ok = new Button("Ȯ��");    //��ư ����
		bt_cancer = new Button("���"); //��ư ����
		this.p.add(bt_ok);  //�гο� ��ư ���
		this.p.add(bt_cancer);// �гο� ��ư ���
		this.add(p); //�г� ���
		
	}
}
class ListenerEx1 implements WindowListener, ActionListener{  //frame�� ����� �����Ѵ�. �װ��� ���� implements�� �Ѵ�.
	FrameEx1 frame;
	public ListenerEx1(FrameEx1 frame) {
		this.frame = frame;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�");
		System.exit(0);  //�ݱ� ��� frameâ�� Xǥ �ݱ� ��� 0�̸� �������� �ƴϸ� ������ ����
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof Button) {
		Button bt = (Button) e.getSource(); // �̺�Ʈ�� �߻��� �ҽ��� �˷��ش�.
		this.buttonListener(bt);
		}
		
	}
	public void buttonListener(Button bt) {
		if(bt.getLabel().equals("Ȯ��"))
		System.out.println("Ȯ�ι�ư Ŭ��");
		
		else if(bt.getLabel().equals("���"))
		System.out.println("��ҹ�ưŬ��");
		
	}
}