package org.mjulikelion.mjulikelion12thspringboot.controller;

import org.mjulikelion.mjulikelion12thspringboot.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// RestController는 Component를 포함하므로 Component 어노테이션을 해준것
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public  String hello(){
        // 이 기능은 Service 에서 구현한 것이 된다.
        return this.helloService.hello();
    }
}

// 클라이언트가 우리 서버로 GET https://123.123.123.123:8080/hello를 보내면 이 hello() 함수가 받기 위해 GET mapping을 사용
// http://localhost:8080/hello 로 가보면 hello() 함수가 실행된 것을 볼 수 있다.
// Controller에 모든 코드를 작성? X 서비스를 만든다.