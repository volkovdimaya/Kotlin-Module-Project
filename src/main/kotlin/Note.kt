class Note(name : String) : Storage() {
    var text : String = ""

    fun editNote(text : String)
    {
        this.text = text
    }


    fun remove() : Note
    {
        return this
    }

    fun create(name: String): Note {
        return Note(name)
    }
}