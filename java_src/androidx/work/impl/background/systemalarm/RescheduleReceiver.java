package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.daaw.ey1;
import com.daaw.ll0;
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2494a = ll0.m16883f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ll0.m16885c().mo16882a(f2494a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            context.startService(C0527a.m27928e(context));
            return;
        }
        try {
            ey1.m23004k(context).m22995t(goAsync());
        } catch (IllegalStateException e) {
            ll0.m16885c().mo16881b(f2494a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
