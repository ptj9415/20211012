package co.taejoon.prj.board.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;

public class BoardInsert implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		int n = 0;
		System.out.println("게시글을 등록합니다.");
		System.out.println("추가할 게시글의 작성자를 입력해주세요.");
		vo.setBWriter(sc.nextLine());
		System.out.println("추가할 게시글의 제목을 작성해주세요.");
		vo.setBTitle(sc.nextLine());
		System.out.println("추가할 게시글의 내용을 작성해주세요.");
		vo.setBContents(sc.nextLine());
		n = boardService.boardInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
	}

}
