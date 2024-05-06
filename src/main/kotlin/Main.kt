fun main(args: Array<String>) {

    val listArchive: ArrayList<Archive> = ArrayList()//создаем список архивов
    val archive = Archive()

    val menu: Ui = Menu<Archive>("Меню Архивов", listArchive, archive)
    //добавление menu в ui

    val screen = Screen()
    screen.addUi(menu)
    screen.start()

    //screen.activeMenu()

}