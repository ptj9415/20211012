package co.taejoon.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberList implements Command {

	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.memberSelectList();
		System.out.println("=================================================");
		for(MemberVO vo : members) {
			System.out.print(" | " + vo.getId() + " | ");
			System.out.print(vo.getName() + " | ");
			System.out.print(vo.getPassword() + " | ");
			System.out.print(vo.getTel() + " | ");
			System.out.print(vo.getAddress() + " | ");
			System.out.println(vo.getAuthor() + " | ");
		}
		System.out.println("=================================================");

	}

}
