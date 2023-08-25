package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.C0530d;
import com.daaw.bw1;
import com.daaw.ll0;
import com.daaw.uj0;
/* loaded from: classes.dex */
public class SystemAlarmService extends uj0 implements C0530d.InterfaceC0533c {

    /* renamed from: s */
    public static final String f2495s = ll0.m16883f("SystemAlarmService");

    /* renamed from: q */
    public C0530d f2496q;

    /* renamed from: r */
    public boolean f2497r;

    @Override // androidx.work.impl.background.systemalarm.C0530d.InterfaceC0533c
    /* renamed from: b */
    public void mo27900b() {
        this.f2497r = true;
        ll0.m16885c().mo16882a(f2495s, "All commands completed in dispatcher", new Throwable[0]);
        bw1.m25785a();
        stopSelf();
    }

    /* renamed from: g */
    public final void m27932g() {
        C0530d c0530d = new C0530d(this);
        this.f2496q = c0530d;
        c0530d.m27901m(this);
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onCreate() {
        super.onCreate();
        m27932g();
        this.f2497r = false;
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2497r = true;
        this.f2496q.m27904j();
    }

    @Override // com.daaw.uj0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f2497r) {
            ll0.m16885c().mo16880d(f2495s, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2496q.m27904j();
            m27932g();
            this.f2497r = false;
        }
        if (intent != null) {
            this.f2496q.m27912a(intent, i2);
            return 3;
        }
        return 3;
    }
}
