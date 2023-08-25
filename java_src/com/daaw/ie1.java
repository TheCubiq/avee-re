package com.daaw;

import android.view.View;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.rw1;
import com.daaw.tw1;
import com.daaw.xw1;
import com.daaw.yw1;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ie1 {

    /* renamed from: d */
    public static final lo1<Integer, Integer> f13546d = new lo1<>(8, Integer.valueOf((int) R.string.sort_mode_Default));

    /* renamed from: e */
    public static final lo1<Integer, Integer> f13547e = new lo1<>(0, Integer.valueOf((int) R.string.sort_mode_Title));

    /* renamed from: f */
    public static final lo1<Integer, Integer> f13548f = new lo1<>(3, Integer.valueOf((int) R.string.sort_mode_Path_url));

    /* renamed from: g */
    public static final lo1<Integer, Integer> f13549g = new lo1<>(9, Integer.valueOf((int) R.string.sort_mode_Bitrate));

    /* renamed from: a */
    public er0<Integer, Integer> f13550a = new er0<>();

    /* renamed from: b */
    public er0<Integer, Integer> f13551b = new er0<>();

    /* renamed from: c */
    public List<Object> f13552c = new LinkedList();

    /* renamed from: com.daaw.ie1$a */
    /* loaded from: classes.dex */
    public class C1688a implements rw1.InterfaceC2894a<C0645al, View> {
        public C1688a() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C0645al c0645al, View view) {
            je1.m18547b(c0645al, view, "regular");
        }
    }

    /* renamed from: com.daaw.ie1$b */
    /* loaded from: classes.dex */
    public class C1689b implements rw1.InterfaceC2894a<C0645al, View> {
        public C1689b() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C0645al c0645al, View view) {
            je1.m18547b(c0645al, view, "files");
        }
    }

    /* renamed from: com.daaw.ie1$c */
    /* loaded from: classes.dex */
    public class C1690c implements rw1.InterfaceC2894a<C0645al, View> {
        public C1690c() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C0645al c0645al, View view) {
            je1.m18547b(c0645al, view, "stations");
        }
    }

    /* renamed from: com.daaw.ie1$d */
    /* loaded from: classes.dex */
    public class C1691d implements yw1.InterfaceC3757a<Integer, sd0, String, C1696i> {
        public C1691d() {
        }

        @Override // com.daaw.yw1.InterfaceC3757a
        /* renamed from: b */
        public C1696i mo3153a(Integer num, sd0 sd0Var, String str) {
            C1696i m19896c = ie1.this.m19896c();
            if (str.equals("regular")) {
                return m19896c;
            }
            if (str.equals("files")) {
                return m19896c.m19887a(8, 0, 3, 5, 7);
            }
            if (str.equals("stations")) {
                m19896c.m19886b(ie1.f13546d, ie1.f13547e, ie1.f13548f, ie1.f13549g);
            }
            return m19896c;
        }
    }

    /* renamed from: com.daaw.ie1$e */
    /* loaded from: classes.dex */
    public class C1692e implements tw1.InterfaceC3140a<Integer, sd0, Integer, Integer> {
        public C1692e() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Integer num, sd0 sd0Var, Integer num2, Integer num3) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14277M, num2.intValue());
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14278N, num3.intValue());
            ie1.this.m19895d();
        }
    }

    /* renamed from: com.daaw.ie1$f */
    /* loaded from: classes.dex */
    public class C1693f implements xw1.InterfaceC3648a<Integer, sd0, C1695h> {
        public C1693f() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public C1695h mo4423c(Integer num, sd0 sd0Var) {
            int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14277M);
            int m18916k2 = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14278N);
            C1695h c1695h = new C1695h();
            c1695h.f13560a = m18916k;
            c1695h.f13561b = (m18916k2 & 1) != 0;
            return c1695h;
        }
    }

    /* renamed from: com.daaw.ie1$g */
    /* loaded from: classes.dex */
    public class C1694g implements yw1.InterfaceC3757a<Integer, sd0, File, Boolean> {
        public C1694g() {
        }

        @Override // com.daaw.yw1.InterfaceC3757a
        /* renamed from: b */
        public Boolean mo3153a(Integer num, sd0 sd0Var, File file) {
            if (file.isDirectory()) {
                return Boolean.TRUE;
            }
            String m25071i = cr1.m25071i(file);
            if (!m25071i.equals("mp3") && !m25071i.equals("wav") && !m25071i.equals("mp4") && !m25071i.equals("m4a") && !m25071i.equals("m4p") && !m25071i.equals("m4b") && !m25071i.equals("m4r") && !m25071i.equals("m4v") && !m25071i.equals("mp4v") && !m25071i.equals("3gp") && !m25071i.equals("3g2") && !m25071i.equals("3gp2") && !m25071i.equals("3gpp") && !m25071i.equals("3ga") && !m25071i.equals("webm") && !m25071i.equals("flv") && !m25071i.equals("aac") && !m25071i.equals("mkv") && !m25071i.equals("fmp4") && !m25071i.equals("ts") && !m25071i.equals("tsv") && !m25071i.equals("tsa") && !m25071i.equals("flac") && !m25071i.equals("mid") && !m25071i.equals("midi") && !m25071i.equals("rmi") && !m25071i.equals("xmf") && !m25071i.equals("mxmf") && !m25071i.equals("rtttl") && !m25071i.equals("rtx") && !m25071i.equals("ota") && !m25071i.equals("imy") && !m25071i.equals("ogg") && !m25071i.equals("asf") && !m25071i.equals("wma") && !m25071i.equals("wmv") && !m25071i.equals("wm") && !m25071i.equals("asx") && !m25071i.equals("wax") && !m25071i.equals("wvx") && !m25071i.equals("wmx") && !m25071i.equals("wpl") && !m25071i.equals("dvr-ms") && !m25071i.equals("wmd") && !m25071i.equals("avi") && !m25071i.equals("mpg") && !m25071i.equals("mpeg") && !m25071i.equals("m1v") && !m25071i.equals("mp2") && !m25071i.equals("mpa") && !m25071i.equals("mpe") && !m25071i.equals("mpga") && !m25071i.equals("aif") && !m25071i.equals("aifc") && !m25071i.equals("aiff") && !m25071i.equals("au") && !m25071i.equals("snd") && !m25071i.equals("cda") && !m25071i.equals("ivf") && !m25071i.equals("mov") && !m25071i.equals("adt") && !m25071i.equals("adts") && !m25071i.equals("m2ts") && !m25071i.equals("amr") && !m25071i.equals("aup") && !m25071i.equals("caf") && !m25071i.equals("kar") && !m25071i.equals("mmf") && !m25071i.equals("oma") && !m25071i.equals("opus") && !m25071i.equals("qcp") && !m25071i.equals("ra") && !m25071i.equals("ram") && !m25071i.equals("xspf") && !m25071i.equals("m3u") && !m25071i.equals("m3u8")) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.ie1$h */
    /* loaded from: classes.dex */
    public static class C1695h {

        /* renamed from: a */
        public int f13560a;

        /* renamed from: b */
        public boolean f13561b;
    }

    /* renamed from: com.daaw.ie1$i */
    /* loaded from: classes.dex */
    public static class C1696i {

        /* renamed from: a */
        public er0<Integer, Integer> f13562a;

        /* renamed from: b */
        public er0<Integer, Integer> f13563b;

        /* renamed from: c */
        public int f13564c;

        /* renamed from: d */
        public int f13565d;

        /* renamed from: a */
        public C1696i m19887a(int... iArr) {
            C1696i c1696i = new C1696i();
            c1696i.f13562a = new er0<>();
            Iterator<lo1<Integer, Integer>> it = this.f13562a.iterator();
            while (it.hasNext()) {
                lo1<Integer, Integer> next = it.next();
                if (ie1.m19897b(iArr, next.f17576a.intValue())) {
                    c1696i.f13562a.add(next);
                }
            }
            c1696i.f13563b = this.f13563b;
            c1696i.f13564c = this.f13564c;
            c1696i.f13565d = this.f13565d;
            return c1696i;
        }

        /* renamed from: b */
        public void m19886b(lo1<Integer, Integer>... lo1VarArr) {
            this.f13562a = new er0<>();
            for (lo1<Integer, Integer> lo1Var : lo1VarArr) {
                this.f13562a.add(lo1Var);
            }
        }
    }

    public ie1() {
        this.f13550a.m23274f(8, Integer.valueOf((int) R.string.sort_mode_Default));
        this.f13550a.m23274f(0, Integer.valueOf((int) R.string.sort_mode_Title));
        this.f13550a.m23274f(1, Integer.valueOf((int) R.string.sort_mode_Artist));
        this.f13550a.m23274f(2, Integer.valueOf((int) R.string.sort_mode_Album));
        this.f13550a.m23274f(3, Integer.valueOf((int) R.string.sort_mode_Path));
        this.f13550a.m23274f(4, Integer.valueOf((int) R.string.sort_mode_DateAdded));
        this.f13550a.m23274f(5, Integer.valueOf((int) R.string.sort_mode_DateModified));
        this.f13550a.m23274f(6, Integer.valueOf((int) R.string.sort_mode_Duration));
        this.f13550a.m23274f(7, Integer.valueOf((int) R.string.sort_mode_Size));
        this.f13551b.m23274f(1, Integer.valueOf((int) R.string.sort_Descending));
        dj0.f7159W.m10861b(new C1688a(), this.f13552c);
        dj0.f7158V.m10861b(new C1689b(), this.f13552c);
        dj0.f7157U.m10861b(new C1690c(), this.f13552c);
        je1.f15041c.m3154b(new C1691d(), this.f13552c);
        je1.f15042d.m8755b(new C1692e(), this.f13552c);
        dj0.f7162Z.m4424b(new C1693f(), this.f13552c);
        dj0.f7163a0.m3154b(new C1694g(), this.f13552c);
    }

    /* renamed from: b */
    public static boolean m19897b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C1696i m19896c() {
        int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14277M);
        int m18916k2 = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14278N);
        C1696i c1696i = new C1696i();
        c1696i.f13562a = this.f13550a;
        c1696i.f13563b = this.f13551b;
        c1696i.f13564c = m18916k;
        c1696i.f13565d = m18916k2;
        return c1696i;
    }

    /* renamed from: d */
    public final void m19895d() {
        m30 m26906o0 = MainActivity.m26906o0();
        if (m26906o0 != null) {
            m26906o0.m16263A();
        }
    }
}
