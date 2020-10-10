public class DiExample {
    public static void main(String[] args) {
        memberStrong();
        memberWeak(new Member("Chris","C"));
    }

    // 강한 결합 함수
    public static void memberStrong() {
        Member m1 = new Member("Johnson","JS");
        System.out.println(m1.nickname);
    }

    // 약한 결합 함수
    public static void memberWeak(Member m) {
        Member m2 = m;
        System.out.println(m2.nickname);
    }
}

class Member {
    String name;
    String nickname;

    // 생성자를 public -> private으로 바꾸면, 강한 결합은 error발생
    private Member(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }
}