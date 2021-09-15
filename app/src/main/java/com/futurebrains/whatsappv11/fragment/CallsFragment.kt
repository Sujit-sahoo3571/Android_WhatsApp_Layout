package com.futurebrains.whatsappv11.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.whatsappv11.R
import com.futurebrains.whatsappv11.adapters.CallRecyclerAdapter
import com.futurebrains.whatsappv11.models.CallModel


class CallsFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: RecyclerView.Adapter<CallRecyclerAdapter.ViewHolder>

    var listiems : MutableList<CallModel> = ArrayList()

    val callnames = arrayOf("Sweta",
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
        "Nandini",
        "Manisha",
        "pragyan"
        )
    val calltimes = arrayOf(
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

    val callicons: IntArray = intArrayOf(
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_call_24,
        R.drawable.ic_baseline_videocam_24,
        R.drawable.ic_baseline_call_24,


        )

    val receivedenyicons : IntArray = intArrayOf(
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
        R.drawable.ic_baseline_call_received_24_green,
        R.drawable.ic_baseline_call_received_24,
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        addNewCalls()

    }

    private fun addNewCalls() {
        for (i in callnames.indices){
            val mycall = CallModel()
            mycall.callname = callnames[i]
            mycall.calltime = calltimes[i]
            mycall.callimage = imageicons[i]
            mycall.callicon = callicons [i]
            mycall.recivedeny = receivedenyicons [i]
            listiems.add(mycall)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v : View =  inflater.inflate(R.layout.wpcalls, container, false)
        recyclerView = v.findViewById(R.id.rv_wpcalls)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = CallRecyclerAdapter(listiems)
        recyclerView.adapter= adapter

        return v
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.wpcalls_menu, menu)
    }

}