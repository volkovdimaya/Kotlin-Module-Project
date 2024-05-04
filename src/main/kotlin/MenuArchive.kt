import java.util.Scanner

class MenuArchive<T : Storage>(val listArchive : ArrayList<T>) : Menu() {


    lateinit var title : String
    init {
        defaultMenu()
    }

    fun defaultMenu()
    {
        title = "Меню Архивов"
        val itemMenu = ItemMenu<Storage>(0, "Создать Архив")
        addItem(itemMenu)

        //добавляем список Архивов

        var command : Int = 1
        for (item in listArchive)
        {
            val itemMenu = ItemMenu<Storage>(command, item.name)
            addItem(itemMenu)
            command++
        }

        addItem(ItemMenu(command, "Выход"))

        println("Меню Архивов")
        printMenu()
    }

    fun createArchiveMenu()
    {
        title = "Напишите название архива"


    }


    fun onSet()
    {
        println(title)

        while(true)
        {
            printMenu()
            val command =  scanner.nextLine()
            //ТУТ дальше вызвать лямду
            // listItem[command].active()

        }
    }

    override val name: String
        get() {
            return "Создать архив"
        }

}