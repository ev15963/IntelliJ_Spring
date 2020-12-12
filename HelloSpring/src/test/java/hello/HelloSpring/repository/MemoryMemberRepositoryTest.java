package hello.HelloSpring.repository;

import hello.HelloSpring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findId(member.getId()).get();
        System.out.println("result = " + (result == member));
        Assertions.assertEquals(member, result);
    }
}
