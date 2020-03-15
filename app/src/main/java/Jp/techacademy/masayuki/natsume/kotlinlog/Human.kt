package Jp.techacademy.masayuki.natsume.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable{

    //引数付きｺﾝｽﾄﾗｸﾀ　Thinkableｲﾝﾀｰﾌｪｲｽのhobbyのﾒﾝﾊﾞｰ変数をﾌﾞﾛｯｸの中に
    constructor(name: String, age: Int, hobby: String): super(name,age) {
        this.hobby = hobby
    }

    //Animalｸﾗｽのﾒｿｯﾄﾞをｵｰﾊﾞｰﾗｲﾄﾞ
    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」")
    }

    //?
    public var hobby: String

    //Thinkableｲﾝﾀｰﾌｪｲｽのﾒｿｯﾄﾞをｵｰﾊﾞｰﾗｲﾄﾞ
    override fun think() {
        Log.d("kotlintest", "「私は" + hobby + "について考える。」")
    }
}
