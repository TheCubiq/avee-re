package androidx.activity.result;

import androidx.activity.result.AbstractC0051a;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.AbstractC3274v0;
import com.daaw.InterfaceC3153u0;
import com.daaw.sj0;
/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0348d {

    /* renamed from: a */
    public final /* synthetic */ String f122a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC3153u0 f123b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3274v0 f124c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0051a f125d;

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        if (!AbstractC0344c.EnumC0346b.ON_START.equals(enumC0346b)) {
            if (AbstractC0344c.EnumC0346b.ON_STOP.equals(enumC0346b)) {
                this.f125d.f139f.remove(this.f122a);
                return;
            } else if (AbstractC0344c.EnumC0346b.ON_DESTROY.equals(enumC0346b)) {
                this.f125d.m30340k(this.f122a);
                return;
            } else {
                return;
            }
        }
        this.f125d.f139f.put(this.f122a, new AbstractC0051a.C0053b<>(this.f123b, this.f124c));
        if (this.f125d.f140g.containsKey(this.f122a)) {
            Object obj = this.f125d.f140g.get(this.f122a);
            this.f125d.f140g.remove(this.f122a);
            this.f123b.mo8646a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f125d.f141h.getParcelable(this.f122a);
        if (activityResult != null) {
            this.f125d.f141h.remove(this.f122a);
            this.f123b.mo8646a(this.f124c.mo5671c(activityResult.m30363b(), activityResult.m30364a()));
        }
    }
}
