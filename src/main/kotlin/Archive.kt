class Archive(override val name : String) : Storage(name = name, Archive.type)
{
    val listNote : ArrayList<Note> = ArrayList()



    override fun create()
    {

    }


    companion object{
        val type : String = "Архив"
        val create: (nameArchive : String) -> Archive = { name ->  Archive(name) }
    }

}