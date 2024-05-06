class Screen() {
    val arrayListUi: ArrayList<Ui> = ArrayList()

    fun addUi(newUi: Ui) {
        arrayListUi.add(newUi)
    }

    fun start() {
        for (ui in arrayListUi) {
            ui.work()
        }

    }
}