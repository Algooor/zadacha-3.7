fun main() {

    val firstNote = Note(
        nid = 0,
        isDeleting = false,
        userId = 321,
        noteId = 122,
        title = "Название заметки",
        text = "Текст заметки",
        privacy = 0,
        commentPrivacy = 0,
        privacyComment = "all",
        privacyView = "all"
    )
    val secondNote = Note(
        nid = 0,
        isDeleting = false,
        userId = 12345,
        noteId = 123454,
        title = "Название заметки",
        text = "Текст заметки",
        privacy = 0,
        commentPrivacy = 0,
        privacyComment = "all",
        privacyView = "all"
    )
    val threeNote = Note(
        nid = 0,
        isDeleting = false,
        userId = 123,
        noteId = 123,
        title = "Название заметки",
        text = "Текст заметки",
        privacy = 0,
        commentPrivacy = 0,
        privacyComment = "all",
        privacyView = "all"
    )

    val result = NoteService()
    val resultComment = CommentService()

    println(result.addNote(firstNote))
    println(result.editNote(secondNote))
    println(result.getById(1))
    println(resultComment.addNote(Comment(1, false, 123, 122, "Комментарий")))
    println(resultComment.editNote(Comment(0, false, 122, 12, "Комментарий")))
    println(resultComment.deleteNote(1))
    println(resultComment.restoreComment(1))
    println(resultComment.getComments(1))
    println(resultComment.deleteAllforNote(1))
}