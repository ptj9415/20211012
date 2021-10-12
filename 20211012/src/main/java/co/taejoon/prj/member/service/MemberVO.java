package co.taejoon.prj.member.service;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
}
