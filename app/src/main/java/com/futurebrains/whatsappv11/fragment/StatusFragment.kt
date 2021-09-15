package com.futurebrains.whatsappv11.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.whatsappv11.R
import com.futurebrains.whatsappv11.adapters.StatusRecyclerAdapter
import com.futurebrains.whatsappv11.databinding.StatusCardDesignBinding
import com.futurebrains.whatsappv11.models.StatusModel


class StatusFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerView.Adapter<StatusRecyclerAdapter.ViewHolder>
    lateinit var layoutManager: LinearLayoutManager

    var carditems: MutableList<StatusModel> = ArrayList()

    val newid = arrayOf(
        "Sweta",
        "Nandini",
        "Subha",
        "Pariniti",
        "Anwesha",
        "Roshni",
        "Sunny",
        "Dev",
        "Abhishek",
        "Mrutunjay",
        "Rashmi",
        "purnima",
        "Niharika",
        "Manisha",
        "pragyan"
    )
    val time = arrayOf(
        "Today 12:10pm",
        "15 minutes ago",
        "Yesterday 10:00A.M.",
        "10 minutes ago",
        " Recently",
        " 4 hour ago",
        "Today 12:10pm",
        "15 minutes ago",
        "Yesterday 10:00A.M.",
        "10 minutes ago",
        " Recently",
        " 4 hour ago",
        "Today 12:10pm",
        "15 minutes ago",
        "Yesterday 10:00A.M.",
    )

    val imageicons: IntArray = intArrayOf(
        R.drawable.girl1,
        R.drawable.girl2,
        R.drawable.girl3,
        R.drawable.girl4,
        R.drawable.girl5,
        R.drawable.girl6,
        R.drawable.booy2,
        R.drawable.boy3,
        R.drawable.boy4,
        R.drawable.boy5,
        R.drawable.boy6,
        R.drawable.girl10,
        R.drawable.girl7,
        R.drawable.girl8,
        R.drawable.girl9,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        addNewStatus()

    }

    private fun addNewStatus() {
        for (i in newid.indices) {
            val status = StatusModel()
            status.idname = newid[i]
            status.time = time[i]
            status.images = imageicons[i]
            carditems.add(status)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        val v : View = StatusCardDesignBinding.inflate(LayoutInflater.from(context), container, false )
        val v: View = inflater.inflate(R.layout.wpstatus, container, false)
        recyclerView = v.findViewById(R.id.rv_wpstatus)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = StatusRecyclerAdapter(carditems)
        recyclerView.adapter = adapter
        return v

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.wpstatus_menu, menu)
    }
}