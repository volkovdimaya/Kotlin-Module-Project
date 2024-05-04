

class Screen<T : Storage>(val previousScreen : Screen<T>?) {//как сделать  ковариантным Screen<out T: Storage> выдает ошубку строка 4
    //val title : String = "Меню $name"
    val arrayList : ArrayList<T> = ArrayList()
    val menu : Menu = MenuArchive(arrayList)





    private fun back()//проверить что будет без ретерн
    {
        previousScreen?.activeMenu() ?: return
    }

    private fun startMenu(newMenu : Menu)
    {
        var command : Int = 0
        var text : String = "Создать name"

        val itemMenu = ItemMenu<Storage>(command, text)
        command++
        newMenu.addItem(itemMenu)
    }

    private fun finishMenu(command : Int, newMenu : Menu)
    {
        newMenu.addItem(ItemMenu<Storage>(command, "Выход"))
    }


    /*
    private fun createMenuListData() : Menu
    {
        val newMenu : Menu = MenuListData()
        startMenu(newMenu)

        var command : Int = 1
        for (item in arrayList)
        {
            val itemMenu = ItemMenu<Storage>(command, item.name)
            newMenu.addItem(itemMenu)
            command++
        }

        finishMenu(command, newMenu)


        return newMenu
    }
    */
    private fun clearMenu()
    {
        menu.clear()
    }
    fun activeMenu()//тут уже можно скорее всего повторятся
    {


        //потом сканер
    }
    //список заметок или архивов
    //основные возможности меню

    //мне нужно в зависимости в зависимомти от типа дисплей создать нужное функцию
    //варианты
    //в дочерних нужно указать
}