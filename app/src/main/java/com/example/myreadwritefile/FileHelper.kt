package com.example.myreadwritefile

import android.content.Context
import android.util.Log
import java.io.IOException
import java.io.OutputStreamWriter

class FileHelper {
    private val TAG = FileHelper::class.java.name

    fun writeToFile(fileModel: FileModel,context: Context){
        try {
            val outputStreamWriter = OutputStreamWriter(context.openFileOutput(fileModel.filename.toString(),Context.MODE_PRIVATE))
            outputStreamWriter.write(fileModel.data.toString())
            outputStreamWriter.close()
        }catch (e:IOException){
            Log.e(TAG,"File Write Failder :", e)
        }
    }
}