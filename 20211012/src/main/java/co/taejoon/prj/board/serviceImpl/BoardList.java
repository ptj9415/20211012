package co.taejoon.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;

public class BoardList implements Command {

	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();

		System.out.println("==========================================================");
		for (BoardVO vo : boards) {
			System.out.print(vo.getBId() + " | ");
			System.out.print(vo.getBWriter() + " | ");
			System.out.print(vo.getBWriteDate() + " | ");
			System.out.print(vo.getBTitle() + " | ");
			System.out.println(vo.getBHit() + " | ");
		}
		System.out.println("==========================================================");

	}

}
