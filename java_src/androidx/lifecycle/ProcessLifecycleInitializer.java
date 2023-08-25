package androidx.lifecycle;

import android.content.Context;
import com.daaw.c5;
import com.daaw.oj0;
import com.daaw.sj0;
import com.daaw.wf0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements wf0<sj0> {
    @Override // com.daaw.wf0
    public List<Class<? extends wf0<?>>> a() {
        return Collections.emptyList();
    }

    @Override // com.daaw.wf0
    /* renamed from: c */
    public sj0 b(Context context) {
        if (c5.e(context).g(ProcessLifecycleInitializer.class)) {
            oj0.a(context);
            h.l(context);
            return h.k();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
