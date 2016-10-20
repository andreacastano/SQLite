package com.yolimaandrea.sqlite;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ContactosSQLiteHelper extends SQLiteOpenHelper {


    String sqlcreate = "CREATE TABLE Contactos (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nombre TEXT, " +
            "telefono INTEGER, " +
            "correo TEXT )";

    public ContactosSQLiteHelper (Context context, String name, SQLiteDatabase.CursorFactory factory, int version ){
        super (context,name,factory,version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlcreate);
    }



    public void onUpgrade (SQLiteDatabase db, int i, int i1){
        db.execSQL("DROP TABLE IF EXISTS Contactos");
        db.execSQL(sqlcreate);

    }
}
