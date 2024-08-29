package com.example.crud_b1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;   // tipo de clase abstrata
import android.text.Spannable;


public class databaseHelper extends SQLiteOpenHelper {     //sentencia de java

    private static  final  String DATABASE_NAME = "crud-db";
    private static  final  String TABLE_NAME = "students";
    private static  final  String COL_1 = "ID";
    private static  final  String COL_2 = "NAME";
    private static  final  String COL_3 = "SURNAME";
    private static  final  String COL_4 = "MARKS";

    public databaseHelper (Context context) {               // Esté es el constructor
        super(context,DATABASE_NAME, null,1);

        public void onCreate(SQLiteDatabase db) {  // ESTE ES EL PRIMER METODO
            db.execSQL("CREATE TABLE" + TABLE_NAME +"(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, SURNAME TEXT, MARKS INTEGER)");
        }
}