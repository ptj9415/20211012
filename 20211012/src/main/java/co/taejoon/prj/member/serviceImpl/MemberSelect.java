package co.taejoon.prj.member.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("��ȸ�� ȸ���� ID�� �Է��ϼ���.");
		vo.setId(sc.nextLine());
		vo = memberService.memberSelect(vo);
		
		System.out.println("===================================");
		System.out.print("ȸ�� �̸�: " + vo.getName() + " | ");
		System.out.println("ȸ�� ����: " + vo.getAuthor());
		System.out.println("ȸ�� ����ó: " + vo.getTel());
		System.out.println("ȸ�� �ּ�: " + vo.getAddress());
		System.out.println("===================================");
	}

}
