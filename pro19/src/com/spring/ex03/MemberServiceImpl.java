package com.spring.ex03;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;	// ���ԵǴ� ���� ������ MemberDAO Ÿ���� �Ӽ� ����
	public void setMemberDAO(MemberDAO memberDAO) {
	// ���� ���Ͽ��� memberDAO ���� ������ �� setter�� �Ӽ� memberDAO�� ������.
		this.memberDAO = memberDAO;
	}
	@Override
	public void listMembers() {
		memberDAO.listMembers();
	}
}
