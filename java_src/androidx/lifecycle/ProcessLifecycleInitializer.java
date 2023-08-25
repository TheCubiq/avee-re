package androidx.lifecycle;

import android.content.Context;
import com.daaw.C0914c5;
import com.daaw.oj0;
import com.daaw.sj0;
import com.daaw.wf0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements wf0<sj0> {
    @Override // com.daaw.wf0
    /* renamed from: a */
    public List<Class<? extends wf0<?>>> mo6098a() {
        return Collections.emptyList();
    }

    @Override // com.daaw.wf0
    /* renamed from: c */
    public sj0 mo6097b(Context context) {
        if (C0914c5.m25621e(context).m25619g(ProcessLifecycleInitializer.class)) {
            oj0.m14257a(context);
            C0353h.m29016l(context);
            return C0353h.m29017k();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
