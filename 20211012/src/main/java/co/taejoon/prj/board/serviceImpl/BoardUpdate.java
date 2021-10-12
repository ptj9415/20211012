package co.taejoon.prj.board.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;

public class BoardUpdate implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		int n = 0;
		System.out.println("게시글을 수정합니다.");
		System.out.println("수정할 게시글의 번호를 입력해주세요.");
		vo.setBId(sc.nextInt());
		sc.nextLine();
		System.out.println("수정할 내용을 입력해주세요.");
		vo.setBContents(sc.nextLine());
		n = boardService.boardUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}

	}

}
