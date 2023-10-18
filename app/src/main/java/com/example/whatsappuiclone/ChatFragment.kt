package com.example.whatsappuiclone

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappuiclone.databinding.ActivityChatTileBinding
import com.example.whatsappuiclone.databinding.FragmentChatBinding
import java.util.Date


class ChatFragment : Fragment(), ChatItemClickListener {
    private lateinit var chatTileAdapter: ChatTileAdapter
    private lateinit var binding: FragmentChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChatBinding.inflate(inflater, container, false)
        chatTileAdapter = ChatTileAdapter(
            Constants.getChatsList(), requireContext(),
            this
        )
        binding.chatlist.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.chatlist.adapter = chatTileAdapter
        binding.fab.setOnClickListener {
            Constants.chatList.add(
                ChatTileDataModel(
                    R.drawable.jett,
                    "NEW",
                    "last message from JETT",
                    Date()
                )
            )
            chatTileAdapter.notifyItemInserted(Constants.chatList.size)

        }
        binding.fab.setOnLongClickListener {
            Constants.chatList[0].name="modified"
            chatTileAdapter.notifyItemChanged(0)
            true
        }

        return binding.root


    }

    companion object {

    }

    override fun onChatItemClicked(name: String) {
        Log.d("toast", name)
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
    }
}