package com.example.mycustomadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyCustomAdapter extends BaseAdapter {
    //It tells the adapter how many items it should create views for and to get the number of items,
    // I need to create two variables and a constructor of custom adapter.
    //create a 2 variable
    private  Context context;
    private String[] items;

    public MyCustomAdapter(Context context,String[] items){
        this.context=context;
        this.items=items;

    }


    @Override
    public int getCount() {
        return items.length;
        //it return the how many item from your list. or return the no. of item in the data source.

    }

    @Override
    public Object getItem(int i) {
        return items[i];  //it return the data item in given position.i will give the position of item in the list
    }

    @Override
    public long getItemId(int i) {
        return i; //return the unique identifire for the item in given position.it will return item associate with perticular position.
    }

    @Override
    public View getView(int i, View converView, ViewGroup viewGroup) {
        return null; //Display the data at a position in the dataset
        RecyclerView.ViewHolder holder;
        //Here, the converted view parameter is recycled view that you can reuse if available for better performance.

        //Let's start with our Get view, but before we dive into the get view, we need to create an instance
        //from Viewholder and the Viewholder class is a static class that we need to create under the get view.
        if (converView == null){
        //ConvertView:- is a recyle view that you can reuse to improve the performance of your list
            converView = LayoutInflater.from().inflate(R.layout.my_list_item,parent,false);
            holder= new RecyclerView.ViewHolder() ;


    }else{
         //reusing the view (this is recyle view)

            holder= (RecyclerView.ViewHolder)converView.getTag();
        }
    static class ViewHolder{
        //hold the reference to the view with in item layout.
        TextView textView;
    }
}
