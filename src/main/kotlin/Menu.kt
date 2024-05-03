class Menu {
    private val listItem : ArrayList<ItemMenu> = ArrayList()

    fun addItem(item : ItemMenu)
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