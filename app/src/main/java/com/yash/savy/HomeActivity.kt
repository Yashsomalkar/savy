package com.yash.savy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelStores.of
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import com.yash.savy.db.UserEntity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity(), RecyclerViewAdapter.RowClickListener {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            recyclerViewAdapter = RecyclerViewAdapter(this@HomeActivity)
            adapter = recyclerViewAdapter
            val divider = DividerItemDecoration(applicationContext, VERTICAL)
            addItemDecoration(divider)

        }
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        viewModel.getAllUsersObservers().observe(this, Observer {
            recyclerViewAdapter.setListData(ArrayList(it))
            recyclerViewAdapter.notifyDataSetChanged()

        })


        saveButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()


            if (saveButton.text.equals("Save")) {
                val user = UserEntity(0, name, email)
                viewModel.insertUserInfo(user)

            } else {
                val user =
                    UserEntity(nameInput.getTag(nameInput.id).toString().toInt(), name, email)
                viewModel.updateUserInfo(user)
                saveButton.setText("Save")

            }
            nameInput.setText("")
            emailInput.setText("")
        }
    }

    override fun onDeleteUserClickListener(user: UserEntity) {
        viewModel.deleteUserInfo(user)
    }

    override fun onItemClickListener(user: UserEntity) {
        nameInput.setText(user.name)
        emailInput.setText(user.email)
        nameInput.setTag(nameInput.id, user.id)
        saveButton.setText("update")
    }
}