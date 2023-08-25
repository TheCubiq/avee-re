package androidx.work;

import androidx.work.b;
import com.daaw.cg0;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends cg0 {
    @Override // com.daaw.cg0
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b bVar : list) {
            hashMap.putAll(bVar.h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
