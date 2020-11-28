//package com.yuhan.security.dto;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import com.yuhan.dto.Member_dto;
//
//public class CustomUser extends User{
//	
//	private Member_dto member;
//	
//	public CustomUser(String username, String password,
//			Collection<? extends GrantedAuthority> authorities) {
//		
//		super(username, password,authorities);
//		
//	}
//	
//	public CustomUser(Member_dto member) {
//		// TODO Auto-generated constructor stub
//		super(member.getM_id(), member.getM_pwd(), member.getAuthList().stream()
//				.map(auth -> new SimpleGrantedAuthority(auth.getAuth()))
//				.collect(Collectors.toList()));
//	}
//}
