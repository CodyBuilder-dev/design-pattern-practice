public class PersonTest {
    public static void main(String[] args) {
        Person p1 = createPerson();
        System.out.println(p1.getFirstName());

        Person p2 = Person.builder()
                        .setFirstName("Codybuilder")
                        .setLastName("-dev")
                        .build();
        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
    }

    // builder 패턴을 적용하지 않을 경우, 아래와 같이 변수마다 일일히 할당해야 한ㄷ
    public static Person createPerson() {
        Person person = new Person();
        person.setFirstName("FirstName");
        person.setLastName("LastName");
        person.setAddressOne("Address1");
        person.setAddressTwo("Address2");
        person.setSex("Male");
        person.setDriverLicence(false);
        person.setMarried(false);
        // 이는 매우 귀찮고 힘든 일이다

        return person;
    }
}