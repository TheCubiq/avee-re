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
    public static final lo1<Integer, Integer> d = new lo1<>(8, Integer.valueOf((int) R.string.sort_mode_Default));
    public static final lo1<Integer, Integer> e = new lo1<>(0, Integer.valueOf((int) R.string.sort_mode_Title));
    public static final lo1<Integer, Integer> f = new lo1<>(3, Integer.valueOf((int) R.string.sort_mode_Path_url));
    public static final lo1<Integer, Integer> g = new lo1<>(9, Integer.valueOf((int) R.string.sort_mode_Bitrate));
    public er0<Integer, Integer> a = new er0<>();
    public er0<Integer, Integer> b = new er0<>();
    public List<Object> c = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements rw1.a<al, View> {
        public a() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(al alVar, View view) {
            je1.b(alVar, view, "regular");
        }
    }

    /* loaded from: classes.dex */
    public class b implements rw1.a<al, View> {
        public b() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(al alVar, View view) {
            je1.b(alVar, view, "files");
        }
    }

    /* loaded from: classes.dex */
    public class c implements rw1.a<al, View> {
        public c() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(al alVar, View view) {
            je1.b(alVar, view, "stations");
        }
    }

    /* loaded from: classes.dex */
    public class d implements yw1.a<Integer, sd0, String, i> {
        public d() {
        }

        @Override // com.daaw.yw1.a
        /* renamed from: b */
        public i a(Integer num, sd0 sd0Var, String str) {
            i c = ie1.this.c();
            if (str.equals("regular")) {
                return c;
            }
            if (str.equals("files")) {
                return c.a(8, 0, 3, 5, 7);
            }
            if (str.equals("stations")) {
                c.b(ie1.d, ie1.e, ie1.f, ie1.g);
            }
            return c;
        }
    }

    /* loaded from: classes.dex */
    public class e implements tw1.a<Integer, sd0, Integer, Integer> {
        public e() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Integer num, sd0 sd0Var, Integer num2, Integer num3) {
            j5.e().c0(j5.M, num2.intValue());
            j5.e().c0(j5.N, num3.intValue());
            ie1.this.d();
        }
    }

    /* loaded from: classes.dex */
    public class f implements xw1.a<Integer, sd0, h> {
        public f() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public h c(Integer num, sd0 sd0Var) {
            int k = j5.e().k(j5.M);
            int k2 = j5.e().k(j5.N);
            h hVar = new h();
            hVar.a = k;
            hVar.b = (k2 & 1) != 0;
            return hVar;
        }
    }

    /* loaded from: classes.dex */
    public class g implements yw1.a<Integer, sd0, File, Boolean> {
        public g() {
        }

        @Override // com.daaw.yw1.a
        /* renamed from: b */
        public Boolean a(Integer num, sd0 sd0Var, File file) {
            if (file.isDirectory()) {
                return Boolean.TRUE;
            }
            String i = cr1.i(file);
            if (!i.equals("mp3") && !i.equals("wav") && !i.equals("mp4") && !i.equals("m4a") && !i.equals("m4p") && !i.equals("m4b") && !i.equals("m4r") && !i.equals("m4v") && !i.equals("mp4v") && !i.equals("3gp") && !i.equals("3g2") && !i.equals("3gp2") && !i.equals("3gpp") && !i.equals("3ga") && !i.equals("webm") && !i.equals("flv") && !i.equals("aac") && !i.equals("mkv") && !i.equals("fmp4") && !i.equals("ts") && !i.equals("tsv") && !i.equals("tsa") && !i.equals("flac") && !i.equals("mid") && !i.equals("midi") && !i.equals("rmi") && !i.equals("xmf") && !i.equals("mxmf") && !i.equals("rtttl") && !i.equals("rtx") && !i.equals("ota") && !i.equals("imy") && !i.equals("ogg") && !i.equals("asf") && !i.equals("wma") && !i.equals("wmv") && !i.equals("wm") && !i.equals("asx") && !i.equals("wax") && !i.equals("wvx") && !i.equals("wmx") && !i.equals("wpl") && !i.equals("dvr-ms") && !i.equals("wmd") && !i.equals("avi") && !i.equals("mpg") && !i.equals("mpeg") && !i.equals("m1v") && !i.equals("mp2") && !i.equals("mpa") && !i.equals("mpe") && !i.equals("mpga") && !i.equals("aif") && !i.equals("aifc") && !i.equals("aiff") && !i.equals("au") && !i.equals("snd") && !i.equals("cda") && !i.equals("ivf") && !i.equals("mov") && !i.equals("adt") && !i.equals("adts") && !i.equals("m2ts") && !i.equals("amr") && !i.equals("aup") && !i.equals("caf") && !i.equals("kar") && !i.equals("mmf") && !i.equals("oma") && !i.equals("opus") && !i.equals("qcp") && !i.equals("ra") && !i.equals("ram") && !i.equals("xspf") && !i.equals("m3u") && !i.equals("m3u8")) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public int a;
        public boolean b;
    }

    /* loaded from: classes.dex */
    public static class i {
        public er0<Integer, Integer> a;
        public er0<Integer, Integer> b;
        public int c;
        public int d;

        public i a(int... iArr) {
            i iVar = new i();
            iVar.a = new er0<>();
            Iterator<lo1<Integer, Integer>> it = this.a.iterator();
            while (it.hasNext()) {
                lo1<Integer, Integer> next = it.next();
                if (ie1.b(iArr, next.a.intValue())) {
                    iVar.a.add(next);
                }
            }
            iVar.b = this.b;
            iVar.c = this.c;
            iVar.d = this.d;
            return iVar;
        }

        public void b(lo1<Integer, Integer>... lo1VarArr) {
            this.a = new er0<>();
            for (lo1<Integer, Integer> lo1Var : lo1VarArr) {
                this.a.add(lo1Var);
            }
        }
    }

    public ie1() {
        this.a.f(8, Integer.valueOf((int) R.string.sort_mode_Default));
        this.a.f(0, Integer.valueOf((int) R.string.sort_mode_Title));
        this.a.f(1, Integer.valueOf((int) R.string.sort_mode_Artist));
        this.a.f(2, Integer.valueOf((int) R.string.sort_mode_Album));
        this.a.f(3, Integer.valueOf((int) R.string.sort_mode_Path));
        this.a.f(4, Integer.valueOf((int) R.string.sort_mode_DateAdded));
        this.a.f(5, Integer.valueOf((int) R.string.sort_mode_DateModified));
        this.a.f(6, Integer.valueOf((int) R.string.sort_mode_Duration));
        this.a.f(7, Integer.valueOf((int) R.string.sort_mode_Size));
        this.b.f(1, Integer.valueOf((int) R.string.sort_Descending));
        dj0.W.b(new a(), this.c);
        dj0.V.b(new b(), this.c);
        dj0.U.b(new c(), this.c);
        je1.c.b(new d(), this.c);
        je1.d.b(new e(), this.c);
        dj0.Z.b(new f(), this.c);
        dj0.a0.b(new g(), this.c);
    }

    public static boolean b(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public i c() {
        int k = j5.e().k(j5.M);
        int k2 = j5.e().k(j5.N);
        i iVar = new i();
        iVar.a = this.a;
        iVar.b = this.b;
        iVar.c = k;
        iVar.d = k2;
        return iVar;
    }

    public final void d() {
        m30 o0 = MainActivity.o0();
        if (o0 != null) {
            o0.A();
        }
    }
}
