package tv.codely.app.mooc.controller.health_check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class GretterController {
    @GetMapping("/greeter/{name}")
    public HashMap<String, String> index(@PathVariable(value = "name") String name) {
        HashMap<String, String> hello = new HashMap<>();
        hello.put("hello", name);

        return hello;
    }
}
