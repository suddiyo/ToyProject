//package com.example.toyproject.service;
//
//import com.example.toyproject.domain.Member;
//import com.example.toyproject.repository.MemberRepository;
//import jakarta.servlet.http.HttpSession;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//
//@Service
//@RequiredArgsConstructor
//public class MemberServiceImpl implements MemberService{
//    private final MemberRepository memberRepository;
//
//    @Override
//    public Member signIn(String email, String password) {
//        return memberRepository.findByEmail(email).filter(m -> m.getPassword().equals(password))
//                .orElse(null);
//    }
//
//    @Override
//    public void signUp(Member member) {
//        memberRepository.save(member);
//    }
//
//    @Override
//    public void signOut(HttpSession session) {
//        session.invalidate();
//    }
//    // 중복 회원 이메일 검증
//    @Override
//    public void validateDuplicateMember(Member member, BindingResult bindingResult) {
//        memberRepository.findByEmail(member.getEmail())
//                .ifPresent(m -> {
//                    bindingResult.addError(new FieldError("member", "email", "이미 사용중인 이메일입니다."));
//                });
//    }
//
//
//}
//
