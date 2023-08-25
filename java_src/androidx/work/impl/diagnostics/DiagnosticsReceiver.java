package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.daaw.dy1;
import com.daaw.ll0;
import com.daaw.ou0;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = ll0.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ll0.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            dy1.d(context).b(ou0.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            ll0.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
