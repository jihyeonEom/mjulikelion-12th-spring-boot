package org.mjulikelion.likelion12thspringboot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
// business login
// Student에 대한 Controller와 Service를 만들어야 한다.
// Controller에서 처리할 API를 설계한다.
// 1. 모든 학생의 정보 조회
// --- 모든 학생의 정보니까 URI는 "/students"
// --- 조회니까 HTTP 메서드는 GET

// 2. 특정 학생의 정보를 학생 ID를 통해 조회
// --- 특정 학생의 정보니까 URI는 "/students/{id}"
// --- 조회니까 HTTP 메서드는 GET

// 3. 학생 한 명 생성
// --- 학생 한 명을 생성하니까 URI는 "/students"
// --- 생성이니까 HTTP 메서드는 POST
// --- 생성 후 학생의 정보를 받아야 하니까 생성할 학생의 정보는 Request Body에 Student로 받는다.
// * Request Body는 요청을 처리하는데 필요한 데이터를 담는다.

// 4. 특정 학생을 학생 ID를 통해 삭제
// --- 특정 학생을 삭제하니까 URI는 "/students{id}"
// --- 제거니까 HTTP 메서드는 DELETE

// 5. 특정 학생을 학생 ID를 통해 수정(학생 ID는 변경 불가)
// --- 특정 학생이니까 URI는 "/students/{id}"
// --- 수정이니까 HTTP 메서드는 PATCH
// --- 수정할 학생의 정보를 Request Body에 name만 받자.(ID는 변경불가이므로)

public class Student {
    private final String id;
    private final String name;

}
