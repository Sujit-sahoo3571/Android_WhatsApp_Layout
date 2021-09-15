package com.futurebrains.whatsappv11.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.whatsappv11.databinding.StatusCardDesignBinding
import com.futurebrains.whatsappv11.models.StatusModel

class StatusRecyclerAdapter(val carditems: List<StatusModel>) :
    RecyclerView.Adapter<StatusRecyclerAdapter.ViewHolder>() {

    class ViewHolder(val items: StatusCardDesignBinding) : RecyclerView.ViewHolder(items.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = StatusCardDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.items.tvMystatusName.text = carditems[position].idname
      holder.items.tvMystatusTime.text = carditems[position].time
      holder.items.ivMystatusImage.setImageResource(carditems[position].images)
    }

    override fun getItemCount(): Int {
        return carditems.size
    }
}