package com.daaw;
/* loaded from: classes.dex */
public final class xg8 {

    /* renamed from: a */
    public final String f32708a;

    /* renamed from: b */
    public int f32709b;

    /* renamed from: c */
    public long f32710c;

    /* renamed from: d */
    public pr8 f32711d;

    /* renamed from: e */
    public boolean f32712e;

    /* renamed from: f */
    public boolean f32713f;

    /* renamed from: g */
    public final /* synthetic */ zg8 f32714g;

    public xg8(zg8 zg8Var, String str, int i, pr8 pr8Var) {
        this.f32714g = zg8Var;
        this.f32708a = str;
        this.f32709b = i;
        this.f32710c = pr8Var == null ? -1L : pr8Var.f18808d;
        if (pr8Var == null || !pr8Var.m16079b()) {
            return;
        }
        this.f32711d = pr8Var;
    }

    /* renamed from: g */
    public final void m5123g(int i, pr8 pr8Var) {
        if (this.f32710c == -1 && i == this.f32709b && pr8Var != null) {
            this.f32710c = pr8Var.f18808d;
        }
    }

    /* renamed from: j */
    public final boolean m5120j(int i, pr8 pr8Var) {
        if (pr8Var == null) {
            return i == this.f32709b;
        }
        pr8 pr8Var2 = this.f32711d;
        return pr8Var2 == null ? !pr8Var.m16079b() && pr8Var.f18808d == this.f32710c : pr8Var.f18808d == pr8Var2.f18808d && pr8Var.f18806b == pr8Var2.f18806b && pr8Var.f18807c == pr8Var2.f18807c;
    }

    /* renamed from: k */
    public final boolean m5119k(ib8 ib8Var) {
        pr8 pr8Var = ib8Var.f13444d;
        if (pr8Var == null) {
            return this.f32709b != ib8Var.f13443c;
        }
        long j = this.f32710c;
        if (j == -1) {
            return false;
        }
        if (pr8Var.f18808d > j) {
            return true;
        }
        if (this.f32711d == null) {
            return false;
        }
        int mo4511a = ib8Var.f13442b.mo4511a(pr8Var.f18805a);
        int mo4511a2 = ib8Var.f13442b.mo4511a(this.f32711d.f18805a);
        pr8 pr8Var2 = ib8Var.f13444d;
        if (pr8Var2.f18808d < this.f32711d.f18808d || mo4511a < mo4511a2) {
            return false;
        }
        if (mo4511a > mo4511a2) {
            return true;
        }
        boolean m16079b = pr8Var2.m16079b();
        pr8 pr8Var3 = ib8Var.f13444d;
        if (!m16079b) {
            int i = pr8Var3.f18809e;
            return i == -1 || i > this.f32711d.f18806b;
        }
        int i2 = pr8Var3.f18806b;
        int i3 = pr8Var3.f18807c;
        pr8 pr8Var4 = this.f32711d;
        int i4 = pr8Var4.f18806b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > pr8Var4.f18807c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.mo4509c()) goto L6;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5118l(l64 l64Var, l64 l64Var2) {
        int i = this.f32709b;
        if (i < l64Var.mo4509c()) {
            l64Var.mo1923e(i, zg8.m2332h(this.f32714g), 0L);
            for (int i2 = zg8.m2332h(this.f32714g).f13279m; i2 <= zg8.m2332h(this.f32714g).f13280n; i2++) {
                int mo4511a = l64Var2.mo4511a(l64Var.mo4508f(i2));
                if (mo4511a != -1) {
                    i = l64Var2.mo1924d(mo4511a, zg8.m2333g(this.f32714g), false).f6450c;
                    break;
                }
            }
            i = -1;
        }
        this.f32709b = i;
        if (i == -1) {
            return false;
        }
        pr8 pr8Var = this.f32711d;
        return pr8Var == null || l64Var2.mo4511a(pr8Var.f18805a) != -1;
    }
}
