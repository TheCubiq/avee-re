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

    /* renamed from: a */
    public static final String f2536a = ll0.m16883f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ll0.m16885c().mo16882a(f2536a, "Requesting diagnostics", new Throwable[0]);
        try {
            dy1.m23814d(context).m23815b(ou0.m13932d(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            ll0.m16885c().mo16881b(f2536a, "WorkManager is not initialized", e);
        }
    }
}
