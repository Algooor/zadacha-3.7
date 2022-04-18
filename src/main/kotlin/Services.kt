open class Services<T : ChangeableValues> {

    private var nextId = 1
    val elements = mutableListOf<T>()

    fun addNote(element: T): Int {
        element.id = nextId++
        elements.add(element)
        return elements.last().id
    }

    fun editNote(element: T): Int {
        for ((index, node) in elements.withIndex()) {
            if (node.id == element.id) {
                elements[index] = element
                return 1
            }
        }
        return 180
    }

    fun getById(id: Int): T? {
        for ((index, node) in elements.withIndex()) if (node.id == id) {
            return node
        }
        return null
    }

    fun deleteNote(id: Int): Int {
        for ((index, note) in elements.withIndex()) if (note.id == id) {
            elements[index].isDeleting = true
            return 1
        }
        return 180
    }

    fun get(userId: Int): MutableList<T> {
        val results = mutableListOf<T>()
        for ((index, node) in elements.withIndex()) if (node.userId == userId) {
            results.add(node)
        }
        return results
    }

}






