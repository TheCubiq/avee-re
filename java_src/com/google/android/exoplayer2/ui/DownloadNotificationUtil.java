package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.DownloadManager;
/* loaded from: classes.dex */
public final class DownloadNotificationUtil {
    private static final int NULL_STRING_ID = 0;

    private DownloadNotificationUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Notification buildProgressNotification(Context context, int i, String str, PendingIntent pendingIntent, String str2, DownloadManager.TaskState[] taskStateArr) {
        int i2;
        int i3;
        float f = 0.0f;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        for (DownloadManager.TaskState taskState : taskStateArr) {
            if (!taskState.action.isRemoveAction && taskState.state == 1) {
                if (taskState.downloadPercentage != -1.0f) {
                    f += taskState.downloadPercentage;
                    z2 = false;
                }
                z |= taskState.downloadedBytes > 0;
                i4++;
            }
        }
        boolean z3 = i4 > 0;
        if (z3) {
            i3 = R.string.exo_download_downloading;
        } else if (taskStateArr.length <= 0) {
            i2 = 0;
            NotificationCompat.Builder newNotificationBuilder = newNotificationBuilder(context, i, str, pendingIntent, str2, i2);
            newNotificationBuilder.setProgress(100, !z3 ? (int) (f / i4) : 0, z3 || (z2 && z));
            newNotificationBuilder.setOngoing(true);
            newNotificationBuilder.setShowWhen(false);
            return newNotificationBuilder.build();
        } else {
            i3 = R.string.exo_download_removing;
        }
        i2 = i3;
        NotificationCompat.Builder newNotificationBuilder2 = newNotificationBuilder(context, i, str, pendingIntent, str2, i2);
        newNotificationBuilder2.setProgress(100, !z3 ? (int) (f / i4) : 0, z3 || (z2 && z));
        newNotificationBuilder2.setOngoing(true);
        newNotificationBuilder2.setShowWhen(false);
        return newNotificationBuilder2.build();
    }

    public static Notification buildDownloadCompletedNotification(Context context, int i, String str, PendingIntent pendingIntent, String str2) {
        return newNotificationBuilder(context, i, str, pendingIntent, str2, R.string.exo_download_completed).build();
    }

    public static Notification buildDownloadFailedNotification(Context context, int i, String str, PendingIntent pendingIntent, String str2) {
        return newNotificationBuilder(context, i, str, pendingIntent, str2, R.string.exo_download_failed).build();
    }

    private static NotificationCompat.Builder newNotificationBuilder(Context context, int i, String str, PendingIntent pendingIntent, String str2, int i2) {
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, str).setSmallIcon(i);
        if (i2 != 0) {
            smallIcon.setContentTitle(context.getResources().getString(i2));
        }
        if (pendingIntent != null) {
            smallIcon.setContentIntent(pendingIntent);
        }
        if (str2 != null) {
            smallIcon.setStyle(new NotificationCompat.BigTextStyle().bigText(str2));
        }
        return smallIcon;
    }
}
