package com.example.formosafashionhub.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.formosafashionhub.classes.Product
import com.example.formosafashionhub.R


class ProductsAdapter(var context: Context, var data:ArrayList<Product>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtName:TextView
        var mTxtPrice:TextView
        var mProductImage: ImageView
        init {
            this.mTxtName = row?.findViewById(R.id.product_name) as TextView
            this.mTxtPrice = row?.findViewById(R.id.product_price) as TextView
            this.mProductImage = row?.findViewById(R.id.product_image) as ImageView

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder: ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.product_item,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item: Product = getItem(position) as Product
        viewHolder.mTxtName.text = item.name
        viewHolder.mTxtPrice.text = item.price

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
