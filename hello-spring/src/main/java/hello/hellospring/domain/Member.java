package hello.hellospring.domain;

public class Member {

    private Long id; //시스템 자체에서 저장하는 아이디
    private String name; // 사용자가 주는 아이디

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
