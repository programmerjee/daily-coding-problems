package com.programmerjee.dailycodingproblems.dailycodingproblems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

@GetMapping("/")
public String showHomePage() {
	return "index";
}

@RequestMapping("/1")
@ResponseBody
public String showProblem1() {
    Problem1 problem1 = new Problem1();
    int[] test = {10, 15, 3, 7};
    int sum = 17;
    return problem1.getSolution(test, sum);
}

@RequestMapping("/108")
@ResponseBody
public String showProblem108 () {
    Problem108 problem108 = new Problem108();
    String testA = "abcde";
    String testB = "eabc";
    return problem108.getSolution(testA, testB);
}

@RequestMapping("/118")
@ResponseBody
public String showProblem118 () {
    Problem118 problem118 = new Problem118();
    int[] test = {-9, -2, 0, 2, 3};
    return problem118.getSolution(test);
}

@RequestMapping("/124")
@ResponseBody
public String showProblem124 () {
    Problem124 problem124 = new Problem124();
    return problem124.getSolution(100);
}

@RequestMapping("/126")
@ResponseBody
public String showProblem126() {
    Problem126 problem126 = new Problem126();
    int[] test = {1, 2, 3, 4, 5, 6};
    return problem126.getSolution(test, 2);
}

@RequestMapping("/129")
@ResponseBody
public String showProblem129() {
    Problem129 problem129 = new Problem129();
    int test = 100;
    return problem129.getSolution(test);
}
    
}