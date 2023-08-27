package com.daaw.avee.Common;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class UtilsMusic {
    public static int findSongInList(List<PlaylistSong> list, PlaylistSong playlistSong) {
        return findSongInList(list, playlistSong, 0);
    }

    public static int findSongInList(List<PlaylistSong> list, PlaylistSong playlistSong, int i) {
        while (i < list.size()) {
            if (list.get(i).compare(playlistSong)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List<PlaylistSong> songListFromCursor(Cursor cursor) {
        return songListFromCursor(cursor, null);
    }

    public static List<PlaylistSong> songListFromCursor(Cursor cursor, List<PlaylistSong> list) {
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
            list.add(new PlaylistSong(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cursor.getLong(columnIndex))));
        }
        return list;
    }

    public static int playlistIdForPlaylist(Context context, String str) {
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "name=?", new String[]{str}, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (querySafe != null) {
            querySafe.moveToFirst();
            r8 = querySafe.isAfterLast() ? -1 : querySafe.getInt(0);
            querySafe.close();
        }
        return r8;
    }

    public static void getPlayLists(Context context, List<Long> list, List<String> list2) {
        String[] strArr = {"_id", AppMeasurementSdk.ConditionalUserProperty.NAME};
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            System.out.println("resolver = null");
            return;
        }
        Cursor querySafe = MediaStoreUtils.querySafe(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr, "name != ''", null, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (querySafe != null && querySafe.getCount() > 0) {
            querySafe.moveToFirst();
            while (!querySafe.isAfterLast()) {
                list.add(Long.valueOf(querySafe.getLong(0)));
                String string = querySafe.getString(1);
                if (string == null) {
                    string = "unnamed";
                }
                list2.add(string);
                querySafe.moveToNext();
            }
        }
        if (querySafe != null) {
            querySafe.close();
        }
    }

    public static List<PlaylistSong> getMostRecentTrackListByCount(Context context, int i) {
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "is_music != 0", null, "date_added DESC limit " + i);
        if (querySafe != null) {
            List<PlaylistSong> songListFromCursor = songListFromCursor(querySafe);
            querySafe.close();
            return songListFromCursor;
        }
        return new ArrayList();
    }
}
