package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.is1;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(is1 is1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1155a = (IconCompat) is1Var.m19450v(remoteActionCompat.f1155a, 1);
        remoteActionCompat.f1156b = is1Var.m19456l(remoteActionCompat.f1156b, 2);
        remoteActionCompat.f1157c = is1Var.m19456l(remoteActionCompat.f1157c, 3);
        remoteActionCompat.f1158d = (PendingIntent) is1Var.m19453r(remoteActionCompat.f1158d, 4);
        remoteActionCompat.f1159e = is1Var.m19458h(remoteActionCompat.f1159e, 5);
        remoteActionCompat.f1160f = is1Var.m19458h(remoteActionCompat.f1160f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, is1 is1Var) {
        is1Var.m19449x(false, false);
        is1Var.m19464M(remoteActionCompat.f1155a, 1);
        is1Var.m19470D(remoteActionCompat.f1156b, 2);
        is1Var.m19470D(remoteActionCompat.f1157c, 3);
        is1Var.m19468H(remoteActionCompat.f1158d, 4);
        is1Var.m19448z(remoteActionCompat.f1159e, 5);
        is1Var.m19448z(remoteActionCompat.f1160f, 6);
    }
}
