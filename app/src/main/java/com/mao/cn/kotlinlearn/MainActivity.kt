package com.mao.cn.kotlinlearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mao.cn.kotlinlearn.contant.Contants
import com.mao.cn.kotlinlearn.domain.UserDomain
import com.mao.cn.kotlinlearn.domain.UserDomainOne
import com.mao.cn.kotlinlearn.tools.toast
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_show.text = "hello kotlin"
/*
        btn.setOnClickListener { Toast.makeText(this,"hello kotlin",Toast.LENGTH_LONG).show()}
*/
       /* btn.setOnClickListener { view ->
            Toast.makeText(this,"hello kotlin",Toast.LENGTH_LONG).show()
        }*/

        L.d(Contants.TAG,"jskldlajflkjsldjflksdjlfk")

        btn.setOnClickListener {
            toast("ssss")
            var user = UserDomainOne("second")
            user.id = "9999999"
            SecondActivity.startActivity(this,user)
        }


        val userDomain = UserDomain("hello","1021010918")

        L.d(Contants.TAG," 用户名字 "+userDomain.name)
        L.d(Contants.TAG," 用户id "+userDomain.id)
        L.d(Contants.TAG," 用户信息 "+userDomain.toString())


        val userDomainOne = UserDomainOne("hello one")

        userDomainOne.name  = "hello one one"
        userDomainOne.id = "111111111"

        L.d(Contants.TAG," 用户名字one "+userDomain.name)
        L.d(Contants.TAG," 用户id one "+userDomain.id)
        L.d(Contants.TAG," 用户信息 one "+userDomain.toString())


        val userDomainOneOne = UserDomainOne("hello one","2222222hello one")

        L.d(Contants.TAG," 用户名字one userDomainOneOne "+userDomainOneOne.name)
        L.d(Contants.TAG," 用户id one userDomainOneOne"+userDomainOneOne.id)
        L.d(Contants.TAG," 用户信息 one userDomainOneOne"+userDomainOneOne.toString())

        L.d(Contants.TAG,"  SecondActivity.to() "+ SecondActivity.to())
        L.d(Contants.TAG,"  SecondActivity.jump() "+ SecondActivity.jump())
        L.d(Contants.TAG,"  SecondActivity.jump(name) "+ SecondActivity.jump("测试"))

        // 这事一个测试

    }
}

