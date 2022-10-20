package com.opete95.view.controller;

import com.opete95.view.domain.SampleVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class PageController {
    @GetMapping("/")
    public String main(Model model){
        Map<String, Object> map =
                new HashMap<>();
        map.put("Language","Java11");
        map.put("IDE","IntelliJ");
        map.put("Framework","Spring Boot");
        map.put("Build Tool","Gradle");
        map.put("WAS","Tomcat");
        map.put("Database","MariaDB");

        //View에 데이터 전달
        model.addAttribute("map",map);

        List<String> list =
                new ArrayList<>();
        list.add("Back End Developer");
        list.add("Front End Developer");
        list.add("Operator");
        list.add("DBA");
        list.add("Data Analysis");
        list.add("Visualization Artist");
        list.add("Big Data");
        list.add("AI");
        list.add("Cloud - DevOps, MLOps, CI/CD");
        model.addAttribute("list",list);

        //뷰이름 리턴;
        return "main";
    }

    //요청을 처리하는 메서드가 아무것도 리턴하지 않으면
    //view 이름은 요청 URL이 됩니다.
    @GetMapping("/ex1")
    public void ex1(){}

    @GetMapping({"/ex2", "/exformat"})
    public void ex2(Model model){
        List<SampleVO> list =
                IntStream.rangeClosed(1,20).asLongStream().mapToObj(i->{
                SampleVO vo = SampleVO.builder()
                        .sno(i)
                        .first("First..."+i)
                        .end("End..."+i)
                        .regTime(LocalDateTime.now())
                        .build();
                return vo;
                }).collect(Collectors.toList());
        model.addAttribute("list",list);
    }
}
