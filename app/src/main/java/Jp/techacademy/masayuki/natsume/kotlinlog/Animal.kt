package Jp.techacademy.masayuki.natsume.kotlinlog

abstract class Animal{

    var name: String //ﾌﾟﾛﾊﾟﾃｲ変数に値設定
    var age: Int

    //引数付きｺﾝｽﾄﾗｸﾀ
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    abstract fun say() //宣言
}