package com.futurebrains.whatsappv11.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.whatsappv11.databinding.CallsChatDesignBinding
import com.futurebrains.whatsappv11.models.CallModel

class CallRecyclerAdapter(val listiems: List<CallModel>) :
    RecyclerView.Adapter<CallRecyclerAdapter.ViewHolder>() {
    class ViewHolder(val items: CallsChatDesignBinding) : RecyclerView.ViewHolder(items.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = CallsChatDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.items.tvMycallName.text = listiems[position].callname
        holder.items.tvMycallTime.text = listiems[position].calltime
        holder.items.ivMycallImage.setImageResource(listiems[position].callimage)
        holder.items.ivMycallIcon.setImageResource(listiems[position].callicon)
        holder.items.tvMycallTime.setCompoundDrawablesRelativeWithIntrinsicBounds(
            listiems[position].recivedeny,
            0,
            0,
            0
        )
    }

    override fun getItemCount(): Int {
      return listiems.size

    }
}