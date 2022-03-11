package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello spring!");
        return "hello";
    }

    //ResponseBody 문자
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name; // "hello sping"    name=>spring
    }


    // ResponseBody 객체
    static class Hello {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam(value = "name", required = false) String name, @RequestParam("age") Integer age) {
        Hello hello = new Hello();
        hello.setName(name);
        hello.setAge(age);
        return hello;
    }
}
