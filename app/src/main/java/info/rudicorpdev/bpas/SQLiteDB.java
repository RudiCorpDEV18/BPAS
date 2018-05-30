package info.rudicorpdev.bpas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDB  extends SQLiteOpenHelper{

    public static final int MYDATABASE_VERSION = 1;
    public static final String MYDATABASE_NAME = "bpas";
    public static final String MYDATABASE_TABLE1 = "bab";
    public static final String MYDATABASE_TABLE2 = "subbab";
    public static final String MYDATABASE_TABLE3 = "isi";
    public static final String KEY_ID = "_id";
    public static final String BAB = "bab";
    public static final String ISI = "isi";
    public static final String DOA = "doa";
    public static final String DOArab = "doarab";
    public static final String DOALatin = "doalatin";
    public static final String Terjemah = "terjemah";
    public static final String Suara = "suara";

    //-------------DEKLARASI UNTUK MEMBUAT TABEL-------------//
    private static final String SCRIPT_CREATE_bab =
            "create table " + MYDATABASE_TABLE1 + " ("
                    + KEY_ID + " integer primary key autoincrement, "
                    + BAB + " text not null, "
                    + ISI + " text not null);";

    private static final String SCRIPT_CREATE_subbab =
            "create table " + MYDATABASE_TABLE2 + " ("
                    + KEY_ID + " integer primary key autoincrement, "
                    + DOA + " text not null);";

    private static final String SCRIPT_CREATE_isi =
            "create table " + MYDATABASE_TABLE3 + " ("
                    + KEY_ID + " integer primary key autoincrement, "
                    + DOArab + " text not null, "
                    + DOALatin + " text not null, "
                    + Terjemah + " text not null, "
                    + Suara + " text );";

    //-------------DEKLARASI UNTUK MENGHAPUS TABEL-------------//
    private static final String SCRIPT_DELETE_TABLE="DROP TABLE IF EXISTS " + MYDATABASE_TABLE1;
    private static final String SCRIPT_DELETE_TABLE="DROP TABLE IF EXISTS " + MYDATABASE_TABLE2;
    private static final String SCRIPT_DELETE_TABLE="DROP TABLE IF EXISTS " + MYDATABASE_TABLE3;


    //-------------DEKLARASI UNTUK MEMASUKKAN DATA DALAM TABEL-------------//



    public SQLiteDB(Context context){
        //BUAT DATABASE JIKA TIDAK ADA
        super(context,MYDATABASE_NAME,null,MYDATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //BUAT TABEL
        db.execSQL(SCRIPT_CREATE_bab);
        db.execSQL(SCRIPT_CREATE_subbab);
        db.execSQL(SCRIPT_CREATE_isi);
        //   db.execSQL(SCRIPT_MASUK_DATA1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SCRIPT_DELETE_TABLE);
        onCreate(db);
    }
}
