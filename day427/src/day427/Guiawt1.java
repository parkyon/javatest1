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
		this.setSize(500,400);    //프레임의 크기 설정   x,y좌표   총전체 크기
		this.setLayout(new FlowLayout());   //컴포넌트 어떤식으로 배치할지
		this.setVisible(true);   //만든 프레임을 보여주겠다.   활성화/비활성화
		this.setLocation(100, 100); //실행할때 frame의 위치 변경
	}
	
	public void setButton() {
		bt_ok = new Button("확인");    //버튼 적용
		bt_cancer = new Button("취소"); //버튼 적용
		this.p.add(bt_ok);  //패널에 버튼 출력
		this.p.add(bt_cancer);// 패널에 버튼 출력
		this.add(p); //패널 출력
		
	}
}
class ListenerEx1 implements WindowListener, ActionListener{  //frame의 기능을 정의한다. 그것을 위해 implements를 한다.
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
		System.out.println("종료합니다");
		System.exit(0);  //닫기 기능 frame창의 X표 닫기 기능 0이면 정상종료 아니면 비정상 종료
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
		Button bt = (Button) e.getSource(); // 이벤트가 발생한 소스를 알려준다.
		this.buttonListener(bt);
		}
		
	}
	public void buttonListener(Button bt) {
		if(bt.getLabel().equals("확인"))
		System.out.println("확인버튼 클릭");
		
		else if(bt.getLabel().equals("취소"))
		System.out.println("취소버튼클릭");
		
	}
}