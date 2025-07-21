package org.example.beans.beanCollection;


import java.util.List;

public class CustomerListHolder {
    private List<Object> lists;
    public  List<Object>  getLists()
    {
        return lists;
    }
    public void setLists(List<Object> lists)
    {
        this.lists = lists;
    }
    public void printList()
    {
        for(Object obj : lists)
        {
            System.out.println(obj);
        }
    }
 }
