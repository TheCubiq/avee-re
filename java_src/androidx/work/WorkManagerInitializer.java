package androidx.work;

import android.content.Context;
import androidx.work.a;
import com.daaw.dy1;
import com.daaw.ll0;
import com.daaw.wf0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements wf0<dy1> {
    public static final String a = ll0.f("WrkMgrInitializer");

    @Override // com.daaw.wf0
    public List<Class<? extends wf0<?>>> a() {
        return Collections.emptyList();
    }

    @Override // com.daaw.wf0
    /* renamed from: c */
    public dy1 b(Context context) {
        ll0.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        dy1.e(context, new a.b().a());
        return dy1.d(context);
    }
}
