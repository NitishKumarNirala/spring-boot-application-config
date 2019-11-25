package com.tagit.digital.commons.dbmm.admin.rest;

public class SingleLinkList {
   
   Node head; 
   static class Node{
      
      Node next;
      int data;
      
      Node(int data){
         this.data =data;
         next =null;
      }
   }
   public void printList() 
   { 
       Node n = head; 
       while (n != null) { 
           System.out.print(n.data + " "); 
           n = n.next; 
       } 
   } 
   
   public void findNthElement(int data) {
     int len =0,i;
     Node start =head;
     while(start!=null) {
       start = start.next;
       len++;
     }
     if (len < data) 
        return ; 
    start =head;
    for (i = 1; i < len - data + 1; i++) 
       start = start.next; 
      System.out.println(start.next.data); 
   }
   public static void main(String[] args) {
      SingleLinkList single=new SingleLinkList();
      single.head = new Node(1); 
      
      Node secodNode =new Node(2);
      Node thirdNode =new Node(3);
      Node fourthNode =new Node(4);
      Node fifthNode =new Node(50);
      Node sixthNode =new Node(6);
      single.head.next =secodNode;
      secodNode.next =thirdNode;
      thirdNode.next =fourthNode;
      fourthNode.next =  fifthNode;
      fifthNode.next = sixthNode;
      sixthNode.next =null;
      single.printList();
      System.out.println("\n *******************************************\n");
      single.findNthElement(5);
   }
}
