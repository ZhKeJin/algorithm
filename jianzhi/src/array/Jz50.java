package array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Zhangkj
 * @date 2019-12-21-22:59
 */

//找到字符流中的只有一个的字符
public class Jz50 {

    HashMap<Character, Integer> map=new HashMap();
    ArrayList<Character> list=new ArrayList<Character>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }


        //把字节流  每个字节  输入到  集合中
        list.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {   char c='#';
        for(char key : list){
            if(map.get(key)==1){
                c=key;
                break;
            }
        }

        return c;
    }






    int[] hashtable=new int[256];
    StringBuffer s=new StringBuffer();
    //Insert one char from stringstream
    public void Insert_1(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0)
            hashtable[ch]=1;
        else hashtable[ch]+=1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce_1()
    {
        char[] str=s.toString().toCharArray();
        for(char c:str)
        {
            if(hashtable[c]==1)
                return c;
        }
        return '#';
    }




}
