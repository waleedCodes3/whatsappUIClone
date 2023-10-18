package com.example.whatsappuiclone

import android.util.Log
import android.widget.Toast
import java.util.Date
import kotlin.coroutines.coroutineContext

object Constants {
    var chatList: ArrayList<ChatTileDataModel> = ArrayList<ChatTileDataModel>()
    fun getChatsList(): ArrayList<ChatTileDataModel> {

        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))

        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))

        chatList.add(ChatTileDataModel(R.drawable.jett, "ALi", "last message from JETT", Date()))
        chatList.add(
            ChatTileDataModel(
                R.drawable.jett,
                "Reyna",
                "sfdfksdl kflds fddddfdfd fdf sdf sd fsd fsd fsd fsdf sdfsd f sdfds fsd fsd f sd fsd f",
                Date()
            )
        )
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))
        chatList.add(ChatTileDataModel(R.drawable.jett, "JETT", "last message from JETT", Date()))


        return chatList
    }
    fun  removeItem(position:Int){
        chatList.removeAt(position)
        Log.d("deleted ${chatList.size}",position.toString())


    }
}