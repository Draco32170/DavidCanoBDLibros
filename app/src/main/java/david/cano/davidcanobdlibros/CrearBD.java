package david.cano.davidcanobdlibros;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CrearBD extends SQLiteOpenHelper {





    public CrearBD(@Nullable Context context){super(context,"bdlibros.sbd", null, 1);

    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists libros(codigo varchar(10) primary key, titulo varchar(20), autor varchar(20));");    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
