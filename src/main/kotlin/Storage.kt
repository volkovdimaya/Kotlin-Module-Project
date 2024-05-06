abstract class Storage() {

    abstract val propertyName : ArrayList<String>
    val propertContent : ArrayList<String> = arrayListOf()
    abstract fun copy() : Storage
    var isNew : Boolean = false
    abstract fun printCreateString() : String
    abstract fun createUi(): ArrayList<Ui>
    abstract fun printUi(): ArrayList<Ui>
}
