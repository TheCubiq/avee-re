package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.daaw.ey1;
import com.daaw.hv0;
import com.daaw.ll0;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = ll0.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Intent p;
        public final /* synthetic */ Context q;
        public final /* synthetic */ BroadcastReceiver.PendingResult r;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.p = intent;
            this.q = context;
            this.r = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.p.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.p.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.p.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.p.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                ll0.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                hv0.a(this.q, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                hv0.a(this.q, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                hv0.a(this.q, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                hv0.a(this.q, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.r.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            ey1.k(context).p().b(new a(intent, context, goAsync()));
        } else {
            ll0.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
