package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /*
    필드 주입 방법 -> 그냥 별로
    private final MemberService memberService;
    @Autowired private MemberService memberService
   */

    /*
    세터인젝션 방법 -> final이 아니므로 협업중에 다른사람이 코드를 바꿀 수 있음.
    private MemberService memberService;
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }*/

    //생성자 방법
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
