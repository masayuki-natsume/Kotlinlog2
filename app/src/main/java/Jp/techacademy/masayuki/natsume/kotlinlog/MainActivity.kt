package Jp.techacademy.masayuki.natsume.kotlinlog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //?Human(name,age)の一つ目のｲﾝｽﾀﾝｽを作る
        var na = Human("masayuki" ,70, "ski" )

        na.say()
        na.think()

        //?Human(hobby)の二つ目のｲﾝｽﾀﾝｽを作る
        var ha = Human("keiko",60,"fishing")

        ha.say()
        ha.think()
    }
}
