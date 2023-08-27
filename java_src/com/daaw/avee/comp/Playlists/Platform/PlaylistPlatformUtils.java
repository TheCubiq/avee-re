package com.daaw.avee.comp.Playlists.Platform;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.Common.tlog;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class PlaylistPlatformUtils {
    public static int createPlaylist(Context context, String str) {
        return createPlaylist(context, str, null);
    }

    public static int createPlaylist(Context context, String str, long[] jArr) {
        Uri uri;
        ContentResolver contentResolver = context.getContentResolver();
        if (UtilsMusic.playlistIdForPlaylist(context, str) >= 0) {
            return -1;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        ContentValues[] contentValuesArr = null;
        try {
            uri = contentResolver.insert(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e) {
            tlog.w("failed to create playlist: " + e.getMessage());
            e.printStackTrace();
            uri = null;
        }
        if (uri == null || jArr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < jArr.length; i2 += 1000) {
            contentValuesArr = makeInsertItems(contentValuesArr, jArr, i2, 1000, 0);
            i += contentResolver.bulkInsert(uri, contentValuesArr);
        }
        return i;
    }

    public static int deletePlaylist(Context context, long j) {
        return context.getContentResolver().delete(ContentUris.withAppendedId(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, j), null, null) > 0 ? 1 : 0;
    }

    public static void renamePlaylist(Context context, long j, String str) {
        renamePlaylist(context, "" + j, str);
    }

    public static void renamePlaylist(Context context, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        contentResolver.update(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues, "_id=?", new String[]{str});
    }

    private static ContentValues[] makeInsertItems(ContentValues[] contentValuesArr, long[] jArr, int i, int i2, int i3) {
        if (i + i2 > jArr.length) {
            i2 = jArr.length - i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i + i4];
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("play_order", Integer.valueOf(i3 + i + i4));
                contentValues.put("audio_id", Long.valueOf(j));
                arrayList.add(contentValues);
            }
        }
        if (contentValuesArr == null || contentValuesArr.length != arrayList.size()) {
            contentValuesArr = new ContentValues[arrayList.size()];
        }
        return (ContentValues[]) arrayList.toArray(contentValuesArr);
    }

    public static int addToPlaylist(Context context, long j, long[] jArr, boolean z) {
        int length = jArr.length;
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {"_id"};
        Uri contentUri = MediaStore.Audio.Playlists.Members.getContentUri("external", j);
        ContentValues[] contentValuesArr = null;
        if (z) {
            contentResolver.delete(contentUri, null, null);
        }
        Cursor querySafe = MediaStoreUtils.querySafe(contentResolver, contentUri, strArr, null, null, null);
        if (querySafe != null) {
            int count = querySafe.getCount();
            int i = 0;
            for (int i2 = 0; i2 < length; i2 += 1000) {
                contentValuesArr = makeInsertItems(contentValuesArr, jArr, i2, 1000, count);
                i += contentResolver.bulkInsert(contentUri, contentValuesArr);
            }
            return i;
        }
        return 0;
    }
}
