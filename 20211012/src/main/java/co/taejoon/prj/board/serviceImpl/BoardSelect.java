package co.taejoon.prj.board.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("조회할 게시글의 번호를 입력하세요.");
		vo.setBId(sc.nextInt());
		vo = boardService.boardSelect(vo);

		System.out.println("================================================");
		System.out.println("조회수: " + vo.getBId() + "   작성자: " + vo.getBWriter());
		System.out.println("작성일: " + vo.getBWriteDate());
		System.out.println("제목: " + vo.getBTitle());
		System.out.println("내용: " + vo.getBContents());
		System.out.println("================================================");
	}

}
