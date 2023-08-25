package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.AbstractC3274v0;
import com.daaw.AbstractC3658y0;
import com.daaw.C2901s0;
import com.daaw.InterfaceC3153u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public abstract class AbstractC0051a {

    /* renamed from: a */
    public Random f134a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f135b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f136c = new HashMap();

    /* renamed from: d */
    public final Map<String, C0054c> f137d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f138e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C0053b<?>> f139f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f140g = new HashMap();

    /* renamed from: h */
    public final Bundle f141h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    public class C0052a<I> extends AbstractC3658y0<I> {

        /* renamed from: a */
        public final /* synthetic */ String f142a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC3274v0 f143b;

        public C0052a(String str, AbstractC3274v0 abstractC3274v0) {
            this.f142a = str;
            this.f143b = abstractC3274v0;
        }

        @Override // com.daaw.AbstractC3658y0
        /* renamed from: b */
        public void mo4278b(I i, C2901s0 c2901s0) {
            Integer num = AbstractC0051a.this.f136c.get(this.f142a);
            if (num != null) {
                AbstractC0051a.this.f138e.add(this.f142a);
                AbstractC0051a.this.mo30345f(num.intValue(), this.f143b, i, c2901s0);
                return;
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f143b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // com.daaw.AbstractC3658y0
        /* renamed from: c */
        public void mo4277c() {
            AbstractC0051a.this.m30340k(this.f142a);
        }
    }

    /* renamed from: androidx.activity.result.a$b */
    /* loaded from: classes.dex */
    public static class C0053b<O> {

        /* renamed from: a */
        public final InterfaceC3153u0<O> f145a;

        /* renamed from: b */
        public final AbstractC3274v0<?, O> f146b;

        public C0053b(InterfaceC3153u0<O> interfaceC3153u0, AbstractC3274v0<?, O> abstractC3274v0) {
            this.f145a = interfaceC3153u0;
            this.f146b = abstractC3274v0;
        }
    }

    /* renamed from: androidx.activity.result.a$c */
    /* loaded from: classes.dex */
    public static class C0054c {

        /* renamed from: a */
        public final AbstractC0344c f147a;

        /* renamed from: b */
        public final ArrayList<InterfaceC0348d> f148b;

        /* renamed from: a */
        public void m30339a() {
            Iterator<InterfaceC0348d> it = this.f148b.iterator();
            while (it.hasNext()) {
                this.f147a.mo29046c(it.next());
            }
            this.f148b.clear();
        }
    }

    /* renamed from: a */
    public final void m30350a(int i, String str) {
        this.f135b.put(Integer.valueOf(i), str);
        this.f136c.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean m30349b(int i, int i2, Intent intent) {
        String str = this.f135b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m30347d(str, i2, intent, this.f139f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m30348c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        InterfaceC3153u0<?> interfaceC3153u0;
        String str = this.f135b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0053b<?> c0053b = this.f139f.get(str);
        if (c0053b == null || (interfaceC3153u0 = c0053b.f145a) == null) {
            this.f141h.remove(str);
            this.f140g.put(str, o);
            return true;
        } else if (this.f138e.remove(str)) {
            interfaceC3153u0.mo8646a(o);
            return true;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public final <O> void m30347d(String str, int i, Intent intent, C0053b<O> c0053b) {
        if (c0053b == null || c0053b.f145a == null || !this.f138e.contains(str)) {
            this.f140g.remove(str);
            this.f141h.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        c0053b.f145a.mo8646a(c0053b.f146b.mo5671c(i, intent));
        this.f138e.remove(str);
    }

    /* renamed from: e */
    public final int m30346e() {
        int nextInt = this.f134a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f135b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f134a.nextInt(2147418112);
        }
    }

    /* renamed from: f */
    public abstract <I, O> void mo30345f(int i, AbstractC3274v0<I, O> abstractC3274v0, @SuppressLint({"UnknownNullness"}) I i2, C2901s0 c2901s0);

    /* renamed from: g */
    public final void m30344g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f138e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f134a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f141h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f136c.containsKey(str)) {
                Integer remove = this.f136c.remove(str);
                if (!this.f141h.containsKey(str)) {
                    this.f135b.remove(remove);
                }
            }
            m30350a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    /* renamed from: h */
    public final void m30343h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f136c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f136c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f138e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f141h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f134a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <I, O> AbstractC3658y0<I> m30342i(String str, AbstractC3274v0<I, O> abstractC3274v0, InterfaceC3153u0<O> interfaceC3153u0) {
        m30341j(str);
        this.f139f.put(str, new C0053b<>(interfaceC3153u0, abstractC3274v0));
        if (this.f140g.containsKey(str)) {
            Object obj = this.f140g.get(str);
            this.f140g.remove(str);
            interfaceC3153u0.mo8646a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f141h.getParcelable(str);
        if (activityResult != null) {
            this.f141h.remove(str);
            interfaceC3153u0.mo8646a(abstractC3274v0.mo5671c(activityResult.m30363b(), activityResult.m30364a()));
        }
        return new C0052a(str, abstractC3274v0);
    }

    /* renamed from: j */
    public final void m30341j(String str) {
        if (this.f136c.get(str) != null) {
            return;
        }
        m30350a(m30346e(), str);
    }

    /* renamed from: k */
    public final void m30340k(String str) {
        Integer remove;
        if (!this.f138e.contains(str) && (remove = this.f136c.remove(str)) != null) {
            this.f135b.remove(remove);
        }
        this.f139f.remove(str);
        if (this.f140g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f140g.get(str));
            this.f140g.remove(str);
        }
        if (this.f141h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f141h.getParcelable(str));
            this.f141h.remove(str);
        }
        C0054c c0054c = this.f137d.get(str);
        if (c0054c != null) {
            c0054c.m30339a();
            this.f137d.remove(str);
        }
    }
}
