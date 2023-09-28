import java.util.*;
class ArrayList
{
   class Node
    {
      Object data;
       int next;
       Node(Object ob,int i)
       {
        data=ob;
         next=i;
        }
}
int MAXSIZE;
Node list[];
int head, count;
/*public void createList(int n);
public void insertFirst(Object ob);
public void insertAfter(Object ob, Oject pos);
public Object deleteFirst();
public Object delete After(object pos);
public boolean isEmpty();
public int size();*/
ArrayList(int s)
{
    MAXSIZE=s;
    list=new Node[MAXSIZE];
}
public void initializeList()
{
    for(int p=0;p<MAXSIZE-1;p++)
    list[p] = new Node (null, p+1);
    list[MAXSIZE-1] = new Node(null, -1);
}
public void createList (int n)
{
    int p;
    for (p = 0; p <n; p++)
{
   list[p] = new Node(11+11*p, p+1);
   count++;
}
   list[p-1].next=-1;
}
public void insertFirst (Object item)
{
   if (count==MAXSIZE)
   {
      System.out.println("***List is FULL");
       return;
   }
       int p = getNode();
       if (p!=-1)
 {
list [p].data=item;
   if( isEmpty ()) list[p].next = -1;
   else list[p].next = head;
   head = p;
   count++;
 }
}
public void insertAfter(Object item, Object x)
{
     if(count == MAXSIZE)
     {
        System.out.println("***List is full");
        return;
     }
        int q = getNode();
        int p = find(x);
        if(q != -1)
     {    
        list[q].data = item;
        list[q].next = list[p].next;
        list[p].next = q;
        count++;
     }}
public int getNode()
{
      for(int p = 0; p<MAXSIZE;p++)
      if(list[p].data==null) return p;
      return -1;
}
public int  find (Object ob)
{
     int p = head;
     while(p != -1)
     {
         if(list[p].data==ob) return p;
     p = list[p].next;
     }
     return-1;
     }
     public Object deleteFirst()
           {
              if(isEmpty())
              {
                   System.out.println("List is empty: no deletion");
                   return null;
}
   Object tmp = list[head].data;
    if (list[head].next == -1)
        head = -1;
     else
        head = list[head].next;
count--;
return tmp;
}
public Object deleteAfter(Object x)
{
    int p = find(x);
    if(p == -1 || list[p].next == -1)
{
    System.out.println("No deletion");
     return null;
}
     int q = list[p].next;
     Object tmp = list[q].data;
      list[p].next = list[q].next;
      count--;
      return tmp;
}
public void display()
{
    int p = head;
    System.out.print("\nList:[");
    while(p != -1)
     {
     System.out.print(list[p].data+" ");
     p = list[p].next;
}
System.out.println("]\n");
}
public boolean isEmpty()
{
if(count == 0) return true;
else return false;
}
public int size()
       {
        return count;
        }}
public class ArrayListDemo
{
public static void main(String[] args)
{
     ArrayList linkedList = new ArrayList(10);
     linkedList.initializeList();
     linkedList.createList(4);
     linkedList.display();
     System.out.println("InsertFirst 55:");
     linkedList.insertFirst(55);
     linkedList.display();
     System.out.println("Insert 66 after 33:");
     linkedList.insertAfter(66, 33);
     linkedList.display();
     Object item = linkedList.deleteFirst();
     System.out.println("Deleted node:" +item);
     linkedList.display();
     System.out.print("InsertFirst 77:");
     linkedList.insertFirst(77);
     linkedList.display();
     item = linkedList.deleteAfter(22);
     System.out.println("Deleted node:" +item);
     linkedList.display();
     System.out.println("size():" +linkedList.size());
     }
}