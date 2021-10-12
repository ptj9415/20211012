package co.taejoon.prj.member.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class LoginCheck implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("로그인");
		System.out.print("ID를 입력해주세요.");
		vo.setId(sc.nextLine());
		System.out.println("비밀번호를 입력해주세요.");
		vo.setPassword(sc.nextLine());
		vo = memberService.loginCheck(vo);
		System.out.println(vo.getName() + " | " + vo.getAuthor());
	}
}
