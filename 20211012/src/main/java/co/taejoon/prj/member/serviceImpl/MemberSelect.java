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
		System.out.println("조회할 회원의 ID를 입력하세요.");
		vo.setId(sc.nextLine());
		vo = memberService.memberSelect(vo);
		
		System.out.println("===================================");
		System.out.print("회원 이름: " + vo.getName() + " | ");
		System.out.println("회원 권한: " + vo.getAuthor());
		System.out.println("회원 연락처: " + vo.getTel());
		System.out.println("회원 주소: " + vo.getAddress());
		System.out.println("===================================");
	}

}
