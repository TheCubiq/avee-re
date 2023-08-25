package androidx.activity.result;

import androidx.activity.result.a;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import com.daaw.sj0;
import com.daaw.u0;
import com.daaw.v0;
/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements d {
    public final /* synthetic */ String a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ v0 c;
    public final /* synthetic */ a d;

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        if (!c.b.ON_START.equals(bVar)) {
            if (c.b.ON_STOP.equals(bVar)) {
                this.d.f.remove(this.a);
                return;
            } else if (c.b.ON_DESTROY.equals(bVar)) {
                this.d.k(this.a);
                return;
            } else {
                return;
            }
        }
        this.d.f.put(this.a, new a.b<>(this.b, this.c));
        if (this.d.g.containsKey(this.a)) {
            Object obj = this.d.g.get(this.a);
            this.d.g.remove(this.a);
            this.b.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.d.h.getParcelable(this.a);
        if (activityResult != null) {
            this.d.h.remove(this.a);
            this.b.a(this.c.c(activityResult.b(), activityResult.a()));
        }
    }
}
