package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 인터페이스만 선언해두면 NullPointerException 이 발생하기 때문에 구현체를 선택해야 한다
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
