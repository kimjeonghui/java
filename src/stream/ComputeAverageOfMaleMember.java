package stream;

import java.util.List;

public class ComputeAverageOfMaleMember {
    public double computeAverageOfMaleMember(List<Member> members) {
        //if(members.size() ==0 || members.stream().filter(i -> i.getGender() == "Male").count() == 0) return 0;
        return members.stream()
                .filter( i -> i.getGender() == "Male")
                .mapToInt(i -> i.getAge())
                .average()
                .orElse(0.0);
        }

    // 아래 코드는 변경하지 마세요.
    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
