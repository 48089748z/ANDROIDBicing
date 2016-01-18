package practica1.com.androidbicing.provider;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import practica1.com.androidbicing.BuildConfig;
import practica1.com.androidbicing.provider.stations.StationsColumns;

public class BicingSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = BicingSQLiteOpenHelper.class.getSimpleName();

    public static final String DATABASE_FILE_NAME = "Bicing.db";
    private static final int DATABASE_VERSION = 1;
    private static BicingSQLiteOpenHelper sInstance;
    private final Context mContext;
    private final BicingSQLiteOpenHelperCallbacks mOpenHelperCallbacks;

    // @formatter:off
    public static final String SQL_CREATE_TABLE_STATIONS = "CREATE TABLE IF NOT EXISTS "
            + StationsColumns.TABLE_NAME + " ( "
            + StationsColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + StationsColumns.TYPE + " TEXT, "
            + StationsColumns.LATITUDE + " TEXT, "
            + StationsColumns.LONGITUDE + " TEXT, "
            + StationsColumns.STREETNAME + " TEXT, "
            + StationsColumns.STREETNUMBER + " TEXT, "
            + StationsColumns.ALTITUDE + " TEXT, "
            + StationsColumns.SLOTS + " TEXT, "
            + StationsColumns.BIKES + " TEXT, "
            + StationsColumns.NEARBYSTATIONS + " TEXT, "
            + StationsColumns.STATUS + " TEXT "
            + " );";

    // @formatter:on

    public static BicingSQLiteOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = newInstance(context.getApplicationContext());
        }
        return sInstance;
    }

    private static BicingSQLiteOpenHelper newInstance(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return newInstancePreHoneycomb(context);
        }
        return newInstancePostHoneycomb(context);
    }


    /*
     * Pre Honeycomb.
     */
    private static BicingSQLiteOpenHelper newInstancePreHoneycomb(Context context) {
        return new BicingSQLiteOpenHelper(context);
    }

    private BicingSQLiteOpenHelper(Context context) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION);
        mContext = context;
        mOpenHelperCallbacks = new BicingSQLiteOpenHelperCallbacks();
    }


    /*
     * Post Honeycomb.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static BicingSQLiteOpenHelper newInstancePostHoneycomb(Context context) {
        return new BicingSQLiteOpenHelper(context, new DefaultDatabaseErrorHandler());
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private BicingSQLiteOpenHelper(Context context, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION, errorHandler);
        mContext = context;
        mOpenHelperCallbacks = new BicingSQLiteOpenHelperCallbacks();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
        mOpenHelperCallbacks.onPreCreate(mContext, db);
        db.execSQL(SQL_CREATE_TABLE_STATIONS);
        mOpenHelperCallbacks.onPostCreate(mContext, db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            setForeignKeyConstraintsEnabled(db);
        }
        mOpenHelperCallbacks.onOpen(mContext, db);
    }

    private void setForeignKeyConstraintsEnabled(SQLiteDatabase db) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            setForeignKeyConstraintsEnabledPreJellyBean(db);
        } else {
            setForeignKeyConstraintsEnabledPostJellyBean(db);
        }
    }

    private void setForeignKeyConstraintsEnabledPreJellyBean(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setForeignKeyConstraintsEnabledPostJellyBean(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        mOpenHelperCallbacks.onUpgrade(mContext, db, oldVersion, newVersion);
    }
}
