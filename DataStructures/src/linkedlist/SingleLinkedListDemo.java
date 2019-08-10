package linkedlist;

import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-07-31-9:23
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "张三", "青蛙a");
        HeroNode heroNode2 = new HeroNode(2, "张三q", "青蛙a");
        HeroNode heroNode3 = new HeroNode(3, "张三w", "青蛙r");
        HeroNode heroNode4 = new HeroNode(4, "张三e", "青蛙r");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
  /*      singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);
        singleLinkedList.add(heroNode4);*/
        singleLinkedList.addNO(heroNode4);
        singleLinkedList.addNO(heroNode1);
        singleLinkedList.addNO(heroNode2);
        singleLinkedList.addNO(heroNode3);

        singleLinkedList.show();


        singleLinkedList.modify(new HeroNode(3,"zhagnleajf"));

        singleLinkedList.show();

        //singleLinkedList.delete(new HeroNode(6,"asdfasdf"));

        //resvers(singleLinkedList.getHead());
        stackresvers(singleLinkedList.getHead());
        singleLinkedList.show();



    }

    public static void stackresvers(HeroNode head){

        Stack<HeroNode> heroNodes = new Stack<>();

        HeroNode cur = head.nextq;
        while(cur!=null){

            heroNodes.push(cur);
            cur = cur.nextq;

        }

        while(!heroNodes.empty()){
            System.out.println(heroNodes.pop());
        }

    }

    //翻转链表
    public static void resvers(HeroNode head){

        HeroNode cur = head.nextq;

        if(cur.nextq==null || cur.nextq.nextq ==null)
            return ;
        HeroNode curHead = new HeroNode(0,"","");

        HeroNode nextq = null;

        while(cur!=null) {

            // nextq = cur.nextq;

            /*if ( cur == null)
                break;*/
            nextq = cur.nextq;

            cur.nextq = curHead.nextq;
            curHead.nextq = cur;

            //cur = cur.nextq;

            //中间发现有记录 的 节点变了需要用  另一个 节点来保存********    最后一个 和  空
             cur = nextq;
        }

        head.nextq = curHead.nextq;
    }
}

class SingleLinkedList{

    private HeroNode head = new HeroNode(0,"","");


    public HeroNode getHead() {
        return head;
    }

    public void show(){

        if(head.nextq ==null){
            System.out.println("链表为空");
            return;
        }

        HeroNode temp = head.nextq;
/*
        while(true){

            System.out.println(temp.toString());
            if(temp.nextq==null)
                break;
            temp = temp.nextq;
        }
        */

        while(temp != null){

            System.out.println(temp.toString());

            temp = temp.nextq;
        }

    }





    //修改信息 根据编号修改
    public void modify(HeroNode heroNode){

        HeroNode temp = head.nextq;

        while(true){
            if(temp == null)
                return ;
            if(temp.no == heroNode.no)
                break;
            temp = temp.nextq;
        }

        temp.nikename  =  heroNode.nikename;



    }

    //删除节点
    public void delete(HeroNode heroNode){

        HeroNode temp = head;

        while(true){
            if(temp.nextq == null){
                System.out.println("没找到");
                return;
            }else if (heroNode.no == temp.nextq.no){
                break;
            }
            temp = temp.nextq;
        }
        temp.nextq=temp.nextq.nextq;

    }




    public void addNO(HeroNode heroNode){
/*
        HeroNode heroNode1 = head;

        HeroNode temp = head.nextq;

        if(temp == null){
            temp = heroNode;
            return ;
        }
        while(true){
            if(temp == null){
                temp = heroNode;
                return;
            }
            if(heroNode.no<temp.no && heroNode.no>heroNode1.no)
                break;
            heroNode1 = temp;
            temp = temp.nextq;
        }

        heroNode.nextq = temp;
        heroNode1.nextq = heroNode;*/

        //定义 一个临时节点
        HeroNode temp = head;

        while(true){

            if(temp.nextq == null){
                break;
            }else if(heroNode.no<temp.nextq.no){

                break;
            }else if(heroNode.no == temp.no){
                System.out.println("已有该编号");
                return ;
            }

            temp = temp.nextq;
        }
        heroNode.nextq = temp.nextq;
        temp.nextq = heroNode;




/*
        方法二定义两个  临时节点
        HeroNode heroNode1 = head;

        HeroNode temp = head;

        if(temp.nextq == null){
            temp.nextq = heroNode;
            return ;
        }
        while(true){
            if(heroNode1.nextq == null){
                heroNode1.nextq = heroNode;
                return;
            }
            if(heroNode.no<temp.no && heroNode.no>heroNode1.no)
                break;
            heroNode1 = temp;
            temp = temp.nextq;
        }

        heroNode.nextq = temp;
        heroNode1.nextq = heroNode;
*/



    }



    public void add(HeroNode heroNode){
        HeroNode temp = head;
       /* System.out.println("add......");
        while(temp!=null){
            System.out.println("add......");

            temp = temp.nextq;
        }

        // System.out.println("add......");
        //链表没有相接
        // temp = heroNode;
*/
        while(true){

            if(temp.nextq == null)
                break;
            temp = temp.nextq;

        }

        temp.nextq = heroNode;

    }



}


class HeroNode{

    public int no;
    public String name;
    public String nikename;
    public HeroNode nextq;

    public HeroNode() {
    }

    public HeroNode(int no, String nikename) {
        this.no = no;
        this.nikename = nikename;
    }

    public HeroNode(int no, String name, String nikename) {
        this.no = no;
        this.name = name;
        this.nikename = nikename;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikename='" + nikename + '\'' +
                '}';
    }
}
