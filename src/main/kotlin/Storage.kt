abstract class Storage(open val name : String, open val type : String) {
    abstract fun create()
}
//только наследники этого класа