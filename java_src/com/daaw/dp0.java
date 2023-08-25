package com.daaw;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.daaw.ie1;
/* loaded from: classes.dex */
public class dp0 {
    public static Cursor a = new a();

    /* loaded from: classes.dex */
    public class a implements Cursor {
        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        }

        @Override // android.database.Cursor
        public void deactivate() {
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return new byte[0];
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return 0;
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return 0;
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return 0;
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return null;
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return null;
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return null;
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return 0;
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return 0;
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return false;
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return false;
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return false;
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return false;
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return false;
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return false;
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return null;
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        }
    }

    public static String a(Cursor cursor, int i) {
        if (cursor == null) {
            return "";
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void b(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static String c(ie1.h hVar, int i) {
        int i2 = hVar.a;
        if (i2 != 8) {
            i = i2;
        }
        return d(hVar, i);
    }

    public static String d(ie1.h hVar, int i) {
        String str = null;
        if (hVar == null) {
            return null;
        }
        boolean z = hVar.b;
        switch (i) {
            case 0:
                str = "title";
                break;
            case 1:
                str = "artist";
                break;
            case 2:
                str = "album";
                break;
            case 3:
                str = "_data";
                break;
            case 4:
            case 5:
                z = !z;
                str = "date_added";
                break;
            case 6:
                z = !z;
                str = "duration";
                break;
            case 7:
                z = !z;
                str = "_size";
                break;
        }
        if (str == null || !z) {
            return str;
        }
        return str + " DESC";
    }

    public static Cursor e(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (Exception e) {
            lz1.c(e.getMessage());
            return null;
        }
    }

    public static Cursor f(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            Cursor query = contentResolver.query(uri, strArr, str, strArr2, str2);
            return query == null ? a : query;
        } catch (Exception e) {
            lz1.c(e.getMessage());
            return a;
        }
    }
}
