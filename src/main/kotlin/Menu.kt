import java.util.Scanner

abstract class Menu {
   protected val listItem : ArrayList<ItemMenu<Storage>> = ArrayList() //не private

    val scanner = Scanner(System.`in`)
    //protected val currentMenu не понятно что хочу

    abstract val name : String

    fun addItem(item : ItemMenu<Storage>)
    {
        listItem.add(item)
    }
    fun printMenu()
    {
        for (i in listItem)
        {
            println("${i.comьand}: ${i.text}")
        }
    }
    fun clear()
    {
        listItem.clear()
    }
}