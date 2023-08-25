package com.daaw;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class x51 {
    public static boolean a(Context context, String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", str);
        contentValues.put("title", str3);
        contentValues.put("mime_type", str4);
        contentValues.put("artist", str2);
        contentValues.put("is_ringtone", Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        contentValues.put("is_notification", bool);
        contentValues.put("is_alarm", bool);
        contentValues.put("is_music", bool);
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(str);
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.delete(contentUriForPath, "_data=\"" + str + "\"", null);
        try {
            RingtoneManager.setActualDefaultRingtoneUri(context, 1, context.getContentResolver().insert(contentUriForPath, contentValues));
            vy.a.a(context.getResources().getString(R.string.ringtone_set));
            return true;
        } catch (Exception unused) {
            vy.a.a(context.getResources().getString(R.string.ringtone_failed_set));
            return false;
        }
    }
}
