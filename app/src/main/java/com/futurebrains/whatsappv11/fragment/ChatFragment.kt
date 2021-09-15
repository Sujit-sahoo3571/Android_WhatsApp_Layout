package com.futurebrains.whatsappv11.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.whatsappv11.R
import com.futurebrains.whatsappv11.adapters.ChatRecyclerAdapter
import com.futurebrains.whatsappv11.models.ChatModel


class ChatFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: RecyclerView.Adapter<ChatRecyclerAdapter.ViewHolder>

    var carditems: MutableList<ChatModel> = ArrayList()

    val newname: Array<String> =
        arrayOf("Niharika",
            "Swagatika",
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
    val textmessage: Array<String> = arrayOf(
        "You are Beautiful ",
        "One day we will meet agin...",
        "super cool",
        " nothing new ",
        "This is Monday ",
        "on my way",
        "I am coming with you ",
        "come in ",
        "i am in hall way",
        "bring one bottle",
        "i prefer whisky",
        "show me map",
        "bring the lamo",
        "what the hell we lost",
        "one way go"
    )
    val imagesicon: IntArray = intArrayOf(
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

    val chatmsgicons = intArrayOf(
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.circular_button,
        R.drawable.transparent_button
    )
    val chattexts = arrayOf("5",
        "7",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "2",
        "5",
        "3",
        "9"  )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        addNewPeople()
    }

    private fun addNewPeople() {
        for (i in newname.indices) {
            val mycard = ChatModel()
            mycard.name = newname[i]
            mycard.msg = textmessage[i]
            mycard.img = imagesicon[i]
            mycard.chaticon = chatmsgicons[i]
            mycard.chattext = chattexts[i]
            carditems.add(mycard)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.wpchat, container, false)
        recyclerView = v.findViewById(R.id.rv_wpchat)
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = ChatRecyclerAdapter(carditems)
        recyclerView.adapter = adapter

        return v


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.wpchat_menu,menu )
    }

}