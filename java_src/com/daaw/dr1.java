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
    /* renamed from: a */
    public static int m24065a(List<tx0> list, tx0 tx0Var, int i) {
        while (i < list.size()) {
            if (list.get(i).m8748d(tx0Var)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static List<tx0> m24064b(Context context, int i) {
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "is_music != 0", null, "date_added DESC limit " + i);
        if (m24109e != null) {
            List<tx0> m24061e = m24061e(m24109e);
            m24109e.close();
            return m24061e;
        }
        return new ArrayList();
    }

    /* renamed from: c */
    public static void m24063c(Context context, List<Long> list, List<String> list2) {
        String[] strArr = {"_id", "name"};
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            System.out.println("resolver = null");
            return;
        }
        Cursor m24109e = dp0.m24109e(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr, "name != ''", null, "name");
        if (m24109e != null && m24109e.getCount() > 0) {
            m24109e.moveToFirst();
            while (!m24109e.isAfterLast()) {
                list.add(Long.valueOf(m24109e.getLong(0)));
                String string = m24109e.getString(1);
                if (string == null) {
                    string = "unnamed";
                }
                list2.add(string);
                m24109e.moveToNext();
            }
        }
        if (m24109e != null) {
            m24109e.close();
        }
    }

    /* renamed from: d */
    public static int m24062d(Context context, String str) {
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "name=?", new String[]{str}, "name");
        if (m24109e != null) {
            m24109e.moveToFirst();
            r0 = m24109e.isAfterLast() ? -1 : m24109e.getInt(0);
            m24109e.close();
        }
        return r0;
    }

    /* renamed from: e */
    public static List<tx0> m24061e(Cursor cursor) {
        return m24060f(cursor, null);
    }

    /* renamed from: f */
    public static List<tx0> m24060f(Cursor cursor, List<tx0> list) {
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
