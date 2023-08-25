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

    /* renamed from: a */
    public static final String f2489a = ll0.m16883f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: classes.dex */
    public class RunnableC0526a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Intent f2490p;

        /* renamed from: q */
        public final /* synthetic */ Context f2491q;

        /* renamed from: r */
        public final /* synthetic */ BroadcastReceiver.PendingResult f2492r;

        public RunnableC0526a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f2490p = intent;
            this.f2491q = context;
            this.f2492r = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f2490p.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f2490p.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f2490p.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f2490p.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                ll0.m16885c().mo16882a(ConstraintProxyUpdateReceiver.f2489a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                hv0.m20390a(this.f2491q, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                hv0.m20390a(this.f2491q, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                hv0.m20390a(this.f2491q, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                hv0.m20390a(this.f2491q, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f2492r.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m27933a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            ey1.m23004k(context).m22999p().mo6051b(new RunnableC0526a(intent, context, goAsync()));
        } else {
            ll0.m16885c().mo16882a(f2489a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
