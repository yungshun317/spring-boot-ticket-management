package yungshun.chang.springbootticketmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeController {
    @ResponseBody
    @RequestMapping("")
    public Map<String, Object> test() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", "Aloha");
        return map;
    }
}
