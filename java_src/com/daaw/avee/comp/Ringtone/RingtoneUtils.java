package com.daaw.avee.comp.Ringtone;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class RingtoneUtils {
    public static boolean setRingtone(Context context, String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", str);
        contentValues.put("title", str3);
        contentValues.put("mime_type", str4);
        contentValues.put("artist", str2);
        contentValues.put("is_ringtone", (Boolean) true);
        contentValues.put("is_notification", (Boolean) false);
        contentValues.put("is_alarm", (Boolean) false);
        contentValues.put("is_music", (Boolean) false);
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(str);
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.delete(contentUriForPath, "_data=\"" + str + "\"", null);
        try {
            RingtoneManager.setActualDefaultRingtoneUri(context, 1, context.getContentResolver().insert(contentUriForPath, contentValues));
            EventsGlobalTextNotifier.onTextMsg.invoke(context.getResources().getString(R.string.ringtone_set));
            return true;
        } catch (Exception unused) {
            EventsGlobalTextNotifier.onTextMsg.invoke(context.getResources().getString(R.string.ringtone_failed_set));
            return false;
        }
    }

    public static void playCurrentRingtone(Context context) {
        RingtoneManager.getRingtone(context, RingtoneManager.getActualDefaultRingtoneUri(context, 1)).play();
    }
}
