package com.futurebrains.whatsappv11.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.whatsappv11.databinding.ChatCardDesignBinding
import com.futurebrains.whatsappv11.models.ChatModel

class ChatRecyclerAdapter(val carditems: List<ChatModel>) :
    RecyclerView.Adapter<ChatRecyclerAdapter.ViewHolder>() {

    class ViewHolder(val items: ChatCardDesignBinding) : RecyclerView.ViewHolder(items.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ChatCardDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.items.tvName.text = carditems[position].name
        holder.items.tvText.text = carditems[position].msg
        holder.items.ivCardimage.setImageResource(carditems[position].img)
        holder.items.btnChatIcon.setBackgroundResource( carditems[position].chaticon)
        holder.items.btnChatIcon.text = carditems[position].chattext

    }

    override fun getItemCount(): Int {
        return carditems.size
    }
}