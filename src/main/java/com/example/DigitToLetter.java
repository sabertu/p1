package com.example;
import java.util.*;
/*
0-9 映射26个字母
0-99 映射26个字母
 */
public class  DigitToLetter {
    /*
     1.定义一个list1用于存放已经排列组合好的数组
     2，再用这个定义好的list1,与另外一个list2做组合，组合后的结果再给list1
   */
    public static Map<String, List> map=new HashMap<String,List>();
    static{
        String[] abc={"a","b","c"};
        String[] edf={"d","e","f"};
        String[] ghi={"g","h","i"};
        String[] jkl={"j","k","l"};
        String[] mno={"m","n","o"};
        String[] pqrs={"p","q","r","s"};
        String[] tuv={"t","u","v"};
        String[] wxyz={"w","x","y","z"};
        map.put("2", Arrays.asList(abc));
        map.put("3",Arrays.asList(edf));
        map.put("4",Arrays.asList(ghi));
        map.put("5",Arrays.asList(jkl));
        map.put("6",Arrays.asList(mno));
        map.put("7",Arrays.asList(pqrs));
        map.put("8",Arrays.asList(tuv));
        map.put("9",Arrays.asList(wxyz));
    }
    //字符串拼接
    public static List<String> concat(List listone,List listtwo){
        List<String> all=new ArrayList<>();
        //遍历第一个list "a","b","c"
        for(int i=0;i<listone.size();i++){
            //拿到第一个list的每个值"a"
            String str=listone.get(i).toString();
            //遍历第二个list "e","d","f"
            for(int j=0;j<listtwo.size();j++){
                //将两个list1和list2做组合
                all.add(str+listtwo.get(j));
            }
        }
        //返回输出结果
        return all;
    }
    public List getList(String[] num){
        List list=new ArrayList();
        //添加验证
        if(null==num){
            list.add("输入内容不能为空");
            return list;
        }else {
            for (int i = 0; i < num.length; i++) {
                String n = num[i];
                //如果数组元素长度大于2
                if (n.length() > 2) {
                    list.add("输入的字符不能大于两位数");
                    return list;
                } else if (n.length() == 2 && num.length > 1) {
                    //如果输入两个两位数，如12,34
                    list.add("只能输入一个两位数，或者两个一位数");
                    return list;
                } else if (n.length() == 2 && num.length == 1) {//数组长度等于2 即23
                    char[] chars = n.toCharArray();//二位数23转成数组 2,3
                    //此时num的长度由1变成2
                    num = new String[chars.length];
                    //遍历字符串
                    for (int j = 0; j < chars.length; j++) {
                        char c = chars[j];
                        //判断输入的字符是否都是数字
                        if (!Character.isDigit(c)) {
                            list.add("输入的两个字符必须是数字");
                            return list;
                        } else {
                            //都是数字,遍历转成字符串
                            for (int k = 0; k < num.length; k++) {
                                if (j == k) {//转成字符串并赋值
                                    num[k] = Character.toString(c);
                                }
                            }
                        }
                    }
                }else if(n.length()==1){//数组长度等于1
                    //判断是否输入空格
                    if(n.trim().equals("")){
                        list.add("不能输入空格");
                        return list;
                    }{
                        char str=n.charAt(0);
                        //判断输入的字符是否是数字
                        if(!Character.isDigit(str)){
                            list.add("请输入数字");
                            return list;
                        }
                    }
                }else if(n.equals("")){//输入字符串为空
                    list.add("不能输入空的字符串");
                    return list;
                }
            }
        }

        List allList=map.get(num[0]);
        for(String n:num){
            if(n.equals("0")||n.equals("1")){
                return null;
            }
        }
        for(int i=1;i<num.length;i++){
            allList=concat(allList,map.get(num[i]));
        }
        return allList;
    }

}
