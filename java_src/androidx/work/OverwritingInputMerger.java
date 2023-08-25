package androidx.work;

import androidx.work.C0511b;
import com.daaw.cg0;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends cg0 {
    @Override // com.daaw.cg0
    /* renamed from: b */
    public C0511b mo25393b(List<C0511b> list) {
        C0511b.C0512a c0512a = new C0511b.C0512a();
        HashMap hashMap = new HashMap();
        for (C0511b c0511b : list) {
            hashMap.putAll(c0511b.m27965h());
        }
        c0512a.m27958d(hashMap);
        return c0512a.m27961a();
    }
}
