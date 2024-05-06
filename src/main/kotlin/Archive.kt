class Archive() : Storage(), SubsciberCreateContent {

    override val propertyName: ArrayList<String> = arrayListOf("Введите название архива")
    val listNote: ArrayList<Note> = ArrayList()

    override fun copy(): Storage {
        val archive = Archive()
        archive.propertContent.addAll(propertContent)
        this.propertContent.clear()
        return archive
    }


    override fun printUi(): ArrayList<Ui> {
        val listNote: ArrayList<Note> = listNote

        val note = Note()

        val menu: Ui = Menu<Note>("Меню Архива", listNote, note)

        return arrayListOf(menu)

    }

    override fun createUi(): ArrayList<Ui> {

        val listUi: ArrayList<Ui> = arrayListOf()
        val uiTitle = UiTitle("Создание Архива")
        listUi.add(uiTitle)

        for (titleUi in propertyName) {
            val uiInput = UiInput(titleUi, this)
            listUi.add(uiInput)
        }
        return listUi
    }


    override fun printCreateString(): String {
        return "Создать Архив"
    }

    override fun createContent(text: String) {
        isNew = true
        propertContent.add(text)
    }

}