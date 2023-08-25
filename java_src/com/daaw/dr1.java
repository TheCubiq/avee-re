package com.daaw;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dr1 {
    public static int a(List<tx0> list, tx0 tx0Var, int i) {
        while (i < list.size()) {
            if (list.get(i).d(tx0Var)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List<tx0> b(Context context, int i) {
        Cursor e = dp0.e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "is_music != 0", null, "date_added DESC limit " + i);
        if (e != null) {
            List<tx0> e2 = e(e);
            e.close();
            return e2;
        }
        return new ArrayList();
    }

    public static void c(Context context, List<Long> list, List<String> list2) {
        String[] strArr = {"_id", "name"};
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            System.out.println("resolver = null");
            return;
        }
        Cursor e = dp0.e(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr, "name != ''", null, "name");
        if (e != null && e.getCount() > 0) {
            e.moveToFirst();
            while (!e.isAfterLast()) {
                list.add(Long.valueOf(e.getLong(0)));
                String string = e.getString(1);
                if (string == null) {
                    string = "unnamed";
                }
                list2.add(string);
                e.moveToNext();
            }
        }
        if (e != null) {
            e.close();
        }
    }

    public static int d(Context context, String str) {
        Cursor e = dp0.e(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "name=?", new String[]{str}, "name");
        if (e != null) {
            e.moveToFirst();
            r0 = e.isAfterLast() ? -1 : e.getInt(0);
            e.close();
        }
        return r0;
    }

    public static List<tx0> e(Cursor cursor) {
        return f(cursor, null);
    }

    public static List<tx0> f(Cursor cursor, List<tx0> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        int columnIndex = cursor.getColumnIndex("audio_id");
        if (columnIndex == -1) {
            columnIndex = cursor.getColumnIndex("_id");
        }
        if (columnIndex == -1) {
            return list;
        }
        while (cursor.moveToNext()) {
            list.add(new tx0(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cursor.getLong(columnIndex))));
        }
        return list;
    }
}
