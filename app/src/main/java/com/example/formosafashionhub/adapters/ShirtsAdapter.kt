package com.example.formosafashionhub.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.formosafashionhub.R
import com.example.formosafashionhub.classes.Shirts

class ShirtsAdapter(var context: Context, var data:ArrayList<Shirts>): BaseAdapter(){
    private class ViewHolder(row: View?){
        var mTxtName: TextView
        var mTxtPrice: TextView
        var mTxtDescription: TextView
        var mNewImage: ImageView
        init {
            this.mTxtName = row?.findViewById(R.id.product_name) as TextView
            this.mTxtPrice = row?.findViewById(R.id.product_price) as TextView
            this.mTxtDescription = row?.findViewById(R.id.product_description) as TextView
            this.mNewImage = row?.findViewById(R.id.product_image) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.product_item,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:Shirts = getItem(position) as Shirts
        viewHolder.mTxtName.text = item.name
        viewHolder.mTxtPrice.text = item.price
        viewHolder.mTxtDescription.text = item.description
        Glide.with(context).load(item.imageUrls).into(viewHolder.mNewImage)
        return view as View
    }
    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }

}

