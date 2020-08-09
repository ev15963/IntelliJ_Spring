package hello.hellospring.controller;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addaAttribute(addaAttribute : "data", addaAttribute : "hello!!");

        return "hello";
    }
}
