package com.daaw;

import android.database.Cursor;
import com.daaw.ki1;
import java.util.List;
/* loaded from: classes.dex */
public class d61 extends ki1.AbstractC1949a {

    /* renamed from: b */
    public C2963sp f6542b;

    /* renamed from: c */
    public final AbstractC1055a f6543c;

    /* renamed from: d */
    public final String f6544d;

    /* renamed from: e */
    public final String f6545e;

    /* renamed from: com.daaw.d61$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1055a {

        /* renamed from: a */
        public final int f6546a;

        public AbstractC1055a(int i) {
            this.f6546a = i;
        }

        /* renamed from: a */
        public abstract void mo24626a(ji1 ji1Var);

        /* renamed from: b */
        public abstract void mo24625b(ji1 ji1Var);

        /* renamed from: c */
        public abstract void mo24624c(ji1 ji1Var);

        /* renamed from: d */
        public abstract void mo24623d(ji1 ji1Var);

        /* renamed from: e */
        public abstract void mo24622e(ji1 ji1Var);

        /* renamed from: f */
        public abstract void mo24621f(ji1 ji1Var);

        /* renamed from: g */
        public abstract C1056b mo24620g(ji1 ji1Var);
    }

    /* renamed from: com.daaw.d61$b */
    /* loaded from: classes.dex */
    public static class C1056b {

        /* renamed from: a */
        public final boolean f6547a;

        /* renamed from: b */
        public final String f6548b;

        public C1056b(boolean z, String str) {
            this.f6547a = z;
            this.f6548b = str;
        }
    }

    public d61(C2963sp c2963sp, AbstractC1055a abstractC1055a, String str, String str2) {
        super(abstractC1055a.f6546a);
        this.f6542b = c2963sp;
        this.f6543c = abstractC1055a;
        this.f6544d = str;
        this.f6545e = str2;
    }

    /* renamed from: j */
    public static boolean m24629j(ji1 ji1Var) {
        Cursor mo18504B = ji1Var.mo18504B("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (mo18504B.moveToFirst()) {
                if (mo18504B.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo18504B.close();
        }
    }

    /* renamed from: k */
    public static boolean m24628k(ji1 ji1Var) {
        Cursor mo18504B = ji1Var.mo18504B("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (mo18504B.moveToFirst()) {
                if (mo18504B.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo18504B.close();
        }
    }

    @Override // com.daaw.ki1.AbstractC1949a
    /* renamed from: b */
    public void mo17729b(ji1 ji1Var) {
        super.mo17729b(ji1Var);
    }

    @Override // com.daaw.ki1.AbstractC1949a
    /* renamed from: d */
    public void mo17727d(ji1 ji1Var) {
        boolean m24629j = m24629j(ji1Var);
        this.f6543c.mo24626a(ji1Var);
        if (!m24629j) {
            C1056b mo24620g = this.f6543c.mo24620g(ji1Var);
            if (!mo24620g.f6547a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo24620g.f6548b);
            }
        }
        m24627l(ji1Var);
        this.f6543c.mo24624c(ji1Var);
    }

    @Override // com.daaw.ki1.AbstractC1949a
    /* renamed from: e */
    public void mo17726e(ji1 ji1Var, int i, int i2) {
        mo17724g(ji1Var, i, i2);
    }

    @Override // com.daaw.ki1.AbstractC1949a
    /* renamed from: f */
    public void mo17725f(ji1 ji1Var) {
        super.mo17725f(ji1Var);
        m24631h(ji1Var);
        this.f6543c.mo24623d(ji1Var);
        this.f6542b = null;
    }

    @Override // com.daaw.ki1.AbstractC1949a
    /* renamed from: g */
    public void mo17724g(ji1 ji1Var, int i, int i2) {
        boolean z;
        List<gq0> m26451c;
        C2963sp c2963sp = this.f6542b;
        if (c2963sp == null || (m26451c = c2963sp.f26467d.m26451c(i, i2)) == null) {
            z = false;
        } else {
            this.f6543c.mo24621f(ji1Var);
            for (gq0 gq0Var : m26451c) {
                gq0Var.mo21346a(ji1Var);
            }
            C1056b mo24620g = this.f6543c.mo24620g(ji1Var);
            if (!mo24620g.f6547a) {
                throw new IllegalStateException("Migration didn't properly handle: " + mo24620g.f6548b);
            }
            this.f6543c.mo24622e(ji1Var);
            m24627l(ji1Var);
            z = true;
        }
        if (z) {
            return;
        }
        C2963sp c2963sp2 = this.f6542b;
        if (c2963sp2 != null && !c2963sp2.m10096a(i, i2)) {
            this.f6543c.mo24625b(ji1Var);
            this.f6543c.mo24626a(ji1Var);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* renamed from: h */
    public final void m24631h(ji1 ji1Var) {
        if (!m24628k(ji1Var)) {
            C1056b mo24620g = this.f6543c.mo24620g(ji1Var);
            if (mo24620g.f6547a) {
                this.f6543c.mo24622e(ji1Var);
                m24627l(ji1Var);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo24620g.f6548b);
        }
        Cursor mo18500I = ji1Var.mo18500I(new id1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = mo18500I.moveToFirst() ? mo18500I.getString(0) : null;
            mo18500I.close();
            if (!this.f6544d.equals(string) && !this.f6545e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            mo18500I.close();
            throw th;
        }
    }

    /* renamed from: i */
    public final void m24630i(ji1 ji1Var) {
        ji1Var.mo18496h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: l */
    public final void m24627l(ji1 ji1Var) {
        m24630i(ji1Var);
        ji1Var.mo18496h(c61.m25570a(this.f6544d));
    }
}
