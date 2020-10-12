package com.example;

import org.junit.jupiter.api.Test;
/*
0-9 映射26个字母测试
0-99 映射26个字母测试
 */
public class DigitToLetterTest {
    DigitToLetter dl=new DigitToLetter();
    //测试输入空值
    @Test
    public  void testOne() {
        String[] num=null;
        System.out.println("测试输入空值: "+dl.getList(num));
    }
    //测试输入一个三位数 123，或者两个三位数 123,456
    //或者一个两位数，一个三位数
    @Test
    public  void testTwo() {
        String[] num={"123"};
        System.out.println("测试输入一个三位数: "+dl.getList(num));
        String[] num1={"123","456"};
        System.out.println("测试输入两个三位数: "+dl.getList(num1));
        String[] num2={"12","456"};
        System.out.println("测试输入一个两位数,一个三位数: "+dl.getList(num1));
    }
    //测试输入两个两位数 12,34 或者多个两位数12,34,56
    @Test
    public void testThree(){
        String[] num={"12","34"};
        System.out.println("测试输入两个两位数 : "+dl.getList(num));
        String[] num1={"12","34","56"};
        System.out.println("测试输入多个两位数 : "+dl.getList(num1));
    }
    //测试输入字母组合ab 或者非法字符%$ 或者两个空格
    @Test
    public  void testFour() {
        String[] num={"ab"};
        System.out.println("测试输入字母组合ab: "+dl.getList(num));
        String[] num1={"%$"};
        System.out.println("测试输入字母组合%$: "+dl.getList(num1));
        String[] num2={"  "};
        System.out.println("测试输入字母组合是空格  : "+dl.getList(num2));
    }
    //测试输入一个正常的数字两位数22
    @Test
    public  void testfive() {
        String[] num={"22"};
        System.out.println("测试输入一个正常的数字两位数: "+dl.getList(num));
    }
    //测试输入一个空格
    @Test
    public  void testSix() {
        String[] num={" "};
        System.out.println("测试输入空格: "+dl.getList(num));
    }
    //测试输入一个非数字字符 $或j
    @Test
    public  void testSeven() {
        String[] num={"$"};
        System.out.println("测试输入一个非数字字符 $: "+dl.getList(num));
        String[] num1={"j"};
        System.out.println("测试输入一个非数字字符 j: "+dl.getList(num1));
    }
    //测试输入一个正常范围的数字 0或1 没有返回值
    @Test
    public void testEight(){
        String[] num={"0"};
        System.out.println("测试输入正常范围的数字0: "+dl.getList(num));
        String[] num1={"1"};
        System.out.println("测试输入正常范围的数字1: "+dl.getList(num1));
    }
    //测试输入一个正常范围且有对应字母的数字
    @Test
    public void testNine(){
        String[] num={"2"};
        System.out.println("测试输入正常范围的数字0: "+dl.getList(num));
    }
    //测试输入两个正常范围的数字 2,3 或 0,1
    @Test
    public void testTen(){
        String[] num={"2","3"};
        System.out.println("测试输入正常范围的数字2,3: "+dl.getList(num));
        String[] num1={"0","1"};
        System.out.println("测试输入正常范围的数字0,1: "+dl.getList(num1));
    }
    //测试输入两个非数字 #,t
    @Test
    public void testElven(){
        String[] num={"#","t"};
        System.out.println("测试输入正常范围的数字#,t: "+dl.getList(num));
    }

}
