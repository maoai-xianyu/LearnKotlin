package com.mao.cn.kotlinlearn

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mao.cn.kotlinlearn.contant.Contants
import com.mao.cn.kotlinlearn.domain.UserDomainOne
import com.mao.cn.kotlinlearn.tools.toast
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val serializableExtra = intent.getSerializableExtra(USER) as UserDomainOne

        L.d(Contants.TAG, serializableExtra.toString())

        toast(serializableExtra.name)
        tv_show_user_name.text = serializableExtra.name

        tv_show_user_id.text = serializableExtra.id
    }

    // 伴生对象  对应的 static
    companion object {
        fun to(): String = "mmms"

        fun jump(): String {
            return "这是一个测试"
        }

        fun jump(name: String): String {
            return name + " 这我的名字"
        }

        // extra key
        val USER = "USER"

        fun startActivity(conext: Context, user: UserDomainOne) {
            var intent = Intent(conext, SecondActivity::class.java)
            intent.putExtra(USER, user)
            L.i(Contants.TAG, user.toString())
            L.i(Contants.TAG, "ssss")
            conext.startActivity(intent)
        }
    }

    fun showId(id: String): String {
        return id + " id 的显示"
    }

}

