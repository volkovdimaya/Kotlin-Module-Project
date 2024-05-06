class Note() : Storage(), SubsciberCreateContent {

    override val propertyName: ArrayList<String> =
        arrayListOf("Введите название заметки", "Введите текст заметки")


    override fun copy(): Storage {
        val note = Note()
        note.propertContent.addAll(propertContent)
        this.propertContent.clear()
        return note
    }

    override fun printCreateString(): String {
        return "Создание заметки"
    }

    override fun createUi(): ArrayList<Ui> {

        val listUi: ArrayList<Ui> = arrayListOf()

        val uiTitle = UiTitle(printCreateString())
        listUi.add(uiTitle)


        for (titleUi in propertyName) {
            val uiInput = UiInput(titleUi, this)
            listUi.add(uiInput)

        }
        return listUi
    }

    override fun printUi(): ArrayList<Ui> {

        val listUi: ArrayList<Ui> = arrayListOf()

        val uiTitle = UiTitle("Просмотр заметки")
        listUi.add(uiTitle)

        for (i in 0 until propertyName.size) {
            //listUi.add(UiTitle(propertyName[i]))//можно изменить и выводить названия поля
            listUi.add(UiTitle(propertContent[i]))

        }
        listUi.add(UiInput("Введите любой символ чтобы выйти", null))
        return listUi
    }

    override fun createContent(text: String) {
        isNew = true
        propertContent.add(text)
    }
}