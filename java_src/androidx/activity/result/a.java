package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.d;
import com.daaw.s0;
import com.daaw.u0;
import com.daaw.v0;
import com.daaw.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class a {
    public Random a = new Random();
    public final Map<Integer, String> b = new HashMap();
    public final Map<String, Integer> c = new HashMap();
    public final Map<String, c> d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();
    public final transient Map<String, b<?>> f = new HashMap();
    public final Map<String, Object> g = new HashMap();
    public final Bundle h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0006a<I> extends y0<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ v0 b;

        public C0006a(String str, v0 v0Var) {
            this.a = str;
            this.b = v0Var;
        }

        @Override // com.daaw.y0
        public void b(I i, s0 s0Var) {
            Integer num = a.this.c.get(this.a);
            if (num != null) {
                a.this.e.add(this.a);
                a.this.f(num.intValue(), this.b, i, s0Var);
                return;
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // com.daaw.y0
        public void c() {
            a.this.k(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class b<O> {
        public final u0<O> a;
        public final v0<?, O> b;

        public b(u0<O> u0Var, v0<?, O> v0Var) {
            this.a = u0Var;
            this.b = v0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final androidx.lifecycle.c a;
        public final ArrayList<d> b;

        public void a() {
            Iterator<d> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c(it.next());
            }
            this.b.clear();
        }
    }

    public final void a(int i, String str) {
        this.b.put(Integer.valueOf(i), str);
        this.c.put(str, Integer.valueOf(i));
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d(str, i2, intent, this.f.get(str));
        return true;
    }

    public final <O> boolean c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        u0<?> u0Var;
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        b<?> bVar = this.f.get(str);
        if (bVar == null || (u0Var = bVar.a) == null) {
            this.h.remove(str);
            this.g.put(str, o);
            return true;
        } else if (this.e.remove(str)) {
            u0Var.a(o);
            return true;
        } else {
            return true;
        }
    }

    public final <O> void d(String str, int i, Intent intent, b<O> bVar) {
        if (bVar == null || bVar.a == null || !this.e.contains(str)) {
            this.g.remove(str);
            this.h.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        bVar.a.a(bVar.b.c(i, intent));
        this.e.remove(str);
    }

    public final int e() {
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.a.nextInt(2147418112);
        }
    }

    public abstract <I, O> void f(int i, v0<I, O> v0Var, @SuppressLint({"UnknownNullness"}) I i2, s0 s0Var);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.c.containsKey(str)) {
                Integer remove = this.c.remove(str);
                if (!this.h.containsKey(str)) {
                    this.b.remove(remove);
                }
            }
            a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> y0<I> i(String str, v0<I, O> v0Var, u0<O> u0Var) {
        j(str);
        this.f.put(str, new b<>(u0Var, v0Var));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            u0Var.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.h.getParcelable(str);
        if (activityResult != null) {
            this.h.remove(str);
            u0Var.a(v0Var.c(activityResult.b(), activityResult.a()));
        }
        return new C0006a(str, v0Var);
    }

    public final void j(String str) {
        if (this.c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final void k(String str) {
        Integer remove;
        if (!this.e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.h.getParcelable(str));
            this.h.remove(str);
        }
        c cVar = this.d.get(str);
        if (cVar != null) {
            cVar.a();
            this.d.remove(str);
        }
    }
}
