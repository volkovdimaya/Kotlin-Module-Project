import java.util.*
import kotlin.collections.ArrayList

class Menu<T : Storage>(
    val title: String,
    val listMenu: ArrayList<T>,
    val storage: T
) : Ui() {

    protected val listItem: ArrayList<ItemMenu<Storage>> = ArrayList()
    val scanner = Scanner(System.`in`)

    init {
        defaultMenu()
    }

    fun addItem(item: ItemMenu<Storage>) {
        listItem.add(item)
    }

    fun clear() {
        listItem.clear()
    }

    fun printMenu() {
        for (i in listItem) {
            println("${i.command}: ${i.text}")
        }
    }

    fun defaultMenu() {
        clear()
        if (storage.isNew) {
            listMenu.add(storage.copy() as T)//как быть
            storage.isNew = false

        }
        //добавляем ui для screen создания контента

        addItem(ItemMenu<Storage>(0, storage.printCreateString(), storage.createUi()))

        var command = 1
        for (item in listMenu) {
            val nameItem = item.propertContent[0]

            val itemMenu = ItemMenu<Storage>(command, nameItem, item.printUi())
            addItem(itemMenu)
            command++
        }
        addItem(ItemMenu(command, "Выход", null))
    }

    override fun work() {
        while (true) {
            defaultMenu()
            println(title)
            printMenu()

            if (scanner.hasNextInt()) {
                val command = scanner.nextInt()

                if (command < listItem.size && command > -1) {
                    //ТУТ должны определится что делать
                    if (listItem[command].properyUi != null) //если ничего не передали выходим в предыдущее меню или выходим из программы
                    {
                        val screen = Screen()
                        for (ui in listItem[command].properyUi!!) {
                            screen.addUi(ui)
                        }
                        screen.start()
                    } else {
                        println("Нажали на выход")
                        break
                    }
                } else {
                    println("Не корректная команда")
                }
            } else {
                println("Должно быть число")
                scanner.nextLine()
            }
        }
    }
}