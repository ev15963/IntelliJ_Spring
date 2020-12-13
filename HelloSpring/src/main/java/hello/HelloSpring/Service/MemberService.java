package hello.HelloSpring.Service;

import hello.HelloSpring.domain.Member;
import hello.HelloSpring.repository.MemberRepository;
import hello.HelloSpring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원 가입
     */

    public Long join(Member member) {

        memberRepository.findByName(member.getName())
        .ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });

        //validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m -> );
    }
}
