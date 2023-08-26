package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class NotificationApiHelperForM {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }

    private NotificationApiHelperForM() {
    }
}
