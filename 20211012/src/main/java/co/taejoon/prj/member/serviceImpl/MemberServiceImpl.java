package co.taejoon.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.taejoon.prj.comm.DataSource;
import co.taejoon.prj.member.service.MemberMapper;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);

	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	public MemberVO loginCheck(MemberVO vo) {
		return map.loginCheck(vo);
	}

	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

}
