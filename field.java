class characteristic {
    int leg;
    int arm;
    String country;

    characteristic() {
        leg = 2;
        arm = 2;
        country = "한국";
    }
    void walking(){
        System.out.println("빠르게 걷는다.");
    }

    void see() {
        System.out.println("멀리 있는 것도 볼 수 있다.");
    }

    void cleaning() {
        System.out.println("빨리 청소 할 수 있다.");
    }

    void print() {
        System.out.println("다리 갯수 : " + leg);
        System.out.println("팔 갯수 : " + arm);
        System.out.println("출신 나라 : " + country);
    }
}

