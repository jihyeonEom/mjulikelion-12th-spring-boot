package org.mjulikelion.mjulikelion12thspringboot.service;

import org.springframework.stereotype.Service;

// Bean으로 등록하기 위해 Service는 @Service 라는 어노테이션을 사용한다.
// 아직은 문자열만 반환하지만 나중에는 Db와 소통하는 등 여러 가지 역할을 한다.
@Service
public class HelloService {
    public String hello(){
        return "Hello Likelion!.";
    }
}
