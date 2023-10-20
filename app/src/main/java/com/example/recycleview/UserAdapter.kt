package com.example.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recycleview.databinding.ItemUserBinding

class UserAdapter(var userlist: MutableList<User>):RecyclerView.Adapter<UserViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userlist[position]
        holder.binding.name.text = user.name
        holder.binding.bio.text = user.Bio
        holder.binding.profile.load(user.imgUrl)
        holder.binding.time.text = user.time
    }
}