package com.example.whatsappuiclone

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappuiclone.databinding.ActivityChatTileBinding

class ChatTileAdapter(
    private var chatList: ArrayList<ChatTileDataModel>,
    private var context: Context,
    private var chatItemClickListener: ChatItemClickListener
) :
    RecyclerView.Adapter<ChatTileAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ActivityChatTileBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            profileImage.setImageResource(chatList[position].image)
            userName.text = chatList[position].name
            lastMessage.text = chatList[position].lastMessage


        }
        holder.binding.root.setOnClickListener {
            chatItemClickListener.onChatItemClicked(chatList[position].name)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, chatList.size - position)
            Constants.removeItem(position)
        }
    }

    inner class MyViewHolder(var binding: ActivityChatTileBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }
}