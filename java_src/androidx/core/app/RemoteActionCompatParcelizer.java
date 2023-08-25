package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.is1;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(is1 is1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) is1Var.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = is1Var.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = is1Var.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) is1Var.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = is1Var.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = is1Var.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, is1 is1Var) {
        is1Var.x(false, false);
        is1Var.M(remoteActionCompat.a, 1);
        is1Var.D(remoteActionCompat.b, 2);
        is1Var.D(remoteActionCompat.c, 3);
        is1Var.H(remoteActionCompat.d, 4);
        is1Var.z(remoteActionCompat.e, 5);
        is1Var.z(remoteActionCompat.f, 6);
    }
}
