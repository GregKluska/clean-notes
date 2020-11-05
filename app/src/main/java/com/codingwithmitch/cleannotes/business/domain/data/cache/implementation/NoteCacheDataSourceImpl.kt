package com.codingwithmitch.cleannotes.business.domain.data.cache.implementation

import com.codingwithmitch.cleannotes.business.domain.data.cache.abstraction.NoteCacheDataSource
import com.codingwithmitch.cleannotes.business.domain.model.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteCacheDataSourceImpl
@Inject
constructor(
    private val noteDaoService: NoteDaoService
): NoteCacheDataSource {
    override suspend fun insertNote(note: Note)
            = noteDaoService.insertNote(note)

    override suspend fun deleteNote(primaryKey: String)
            = noteDaoService.deleteNote(primaryKey)

    override suspend fun deleteNotes(note: List<Note>)
            = noteDaoService.deleteNotes(note)

    override suspend fun updateNote(primaryKey: String, newTitle: String, newBody: String)
            = noteDaoService.updateNote(primaryKey, newTitle, newBody)

    override suspend fun searchNotes(query: String, filterAndOrder: String, page: Int)
            = noteDaoService.searchNotes(query, filterAndOrder, page)

    override suspend fun searchNoteById(primaryKey: String)
            = noteDaoService.searchNoteById(primaryKey)

    override suspend fun getNumNotes()
            = noteDaoService.getNumNotes()

    override suspend fun insertNotes(notes: List<Note>)
            = noteDaoService.insertNotes(notes)

}