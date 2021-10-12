package co.taejoon.prj.board.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		int n = 0;
		BoardVO vo = new BoardVO();
		System.out.println("공지사항을 삭제합니다.");
		System.out.println("삭제할 공지사항의 번호를 입력해주세요.");
		vo.setBId(sc.nextInt());
		n = boardService.boardDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제를 실패하였습니다.");
		}
	}
}
