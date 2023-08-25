package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.bw1;
import com.daaw.ll0;
import com.daaw.uj0;
/* loaded from: classes.dex */
public class SystemAlarmService extends uj0 implements d.c {
    public static final String s = ll0.f("SystemAlarmService");
    public d q;
    public boolean r;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void b() {
        this.r = true;
        ll0.c().a(s, "All commands completed in dispatcher", new Throwable[0]);
        bw1.a();
        stopSelf();
    }

    public final void g() {
        d dVar = new d(this);
        this.q = dVar;
        dVar.m(this);
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onCreate() {
        super.onCreate();
        g();
        this.r = false;
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.r = true;
        this.q.j();
    }

    @Override // com.daaw.uj0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.r) {
            ll0.c().d(s, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.q.j();
            g();
            this.r = false;
        }
        if (intent != null) {
            this.q.a(intent, i2);
            return 3;
        }
        return 3;
    }
}
