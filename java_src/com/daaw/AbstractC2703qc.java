package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: com.daaw.qc */
/* loaded from: classes.dex */
public abstract class AbstractC2703qc<T> extends AbstractC2554pj<T> {

    /* renamed from: h */
    public static final String f23851h = ll0.m16883f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final BroadcastReceiver f23852g;

    /* renamed from: com.daaw.qc$a */
    /* loaded from: classes.dex */
    public class C2704a extends BroadcastReceiver {
        public C2704a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC2703qc.this.mo12625h(context, intent);
            }
        }
    }

    public AbstractC2703qc(Context context, wj1 wj1Var) {
        super(context, wj1Var);
        this.f23852g = new C2704a();
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: e */
    public void mo12628e() {
        ll0.m16885c().mo16882a(f23851h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f22982b.registerReceiver(this.f23852g, mo12626g());
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: f */
    public void mo12627f() {
        ll0.m16885c().mo16882a(f23851h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f22982b.unregisterReceiver(this.f23852g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo12626g();

    /* renamed from: h */
    public abstract void mo12625h(Context context, Intent intent);
}
