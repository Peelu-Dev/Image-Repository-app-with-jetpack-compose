package com.example.imagerepository.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.imagerepository.Image

@Dao
interface ImageDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE) // replaces same id of old and new one
    suspend fun insertImageList(images:List<Image>)

    @Query("SELECT * from IMAGE WHERE id=:id_")
    fun getImage(id_:Long):LiveData<Image>

    @Query("SELECT * from IMAGE")
    suspend fun getImageList():List<Image> // suspend function to use when we have to deal with multiple set of data
}