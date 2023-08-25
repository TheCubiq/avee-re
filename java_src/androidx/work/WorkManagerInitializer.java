package androidx.work;

import android.content.Context;
import androidx.work.C0507a;
import com.daaw.dy1;
import com.daaw.ll0;
import com.daaw.wf0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements wf0<dy1> {

    /* renamed from: a */
    public static final String f2423a = ll0.m16883f("WrkMgrInitializer");

    @Override // com.daaw.wf0
    /* renamed from: a */
    public List<Class<? extends wf0<?>>> mo6098a() {
        return Collections.emptyList();
    }

    @Override // com.daaw.wf0
    /* renamed from: c */
    public dy1 mo6097b(Context context) {
        ll0.m16885c().mo16882a(f2423a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        dy1.m23813e(context, new C0507a.C0509b().m27974a());
        return dy1.m23814d(context);
    }
}
