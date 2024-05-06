import java.util.*

class UiInput(val title : String, val subscriber : SubsciberCreateContent?) : Ui() {
    var text : String = ""
    val scanner = Scanner(System.`in`)

    override fun work() {
        while (cheked(text))
        {
            println(title)
            text = scanner.nextLine()
        }
        subscriber?.createContent(text)
    }

    private fun cheked(text : String) : Boolean
    {
        if(text.isEmpty())
        {

            return true
        }

        return false
    }
}