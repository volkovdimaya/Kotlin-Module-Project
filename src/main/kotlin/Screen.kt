import java.util.Scanner

class Screen<T : Storage>(val name : String, val previousScreen : Screen<T>?) {//как сделать  ковариантным Screen<out T: Storage> выдает ошубку строка 4
    val title : String = "Меню $name"
    val menu : Menu = createMenuListData()
    val arrayList : ArrayList<T> = ArrayList()

    val stateIdle : (name : String) -> Unit = {name -> Screen(name, this)}
    val stateCreate = ""
    val statePrint = ""


    private fun back()//проверить что будет без ретерн
    {
        previousScreen?.activeMenu() ?: return
    }


    private fun createMenuListData() : Menu
    {
        val newMenu : Menu = Menu()
        var command : Int = 0
        var text : String = "Создать $name"//как примерно сделать такую конструкцию T.type

        val itemMenu = ItemMenu(command, text)
        command++
        newMenu.addItem(itemMenu)

        for (item in arrayList)
        {
            val itemMenu = ItemMenu(command, item.name)
            newMenu.addItem(itemMenu)
            command++
        }
        newMenu.addItem(ItemMenu(command, "Выход"))

        return newMenu
    }
    private fun clearMenu()
    {
        menu.clear()
    }
    fun activeMenu()//тут уже можно скорее всего повторятся
    {
        println(title)
        val scanner = Scanner(System.`in`)
        while(true)
        {
            menu.printMenu()
            val command =  scanner.nextLine()
            arrayList[command].active()

        }

        //потом сканер
    }
    //список заметок или архивов
    //основные возможности меню

    //мне нужно в зависимости в зависимомти от типа дисплей создать нужное функцию
    //варианты
    //в дочерних нужно указать
}