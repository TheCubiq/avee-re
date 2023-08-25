package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.daaw.C2830r7;
import com.daaw.InterfaceC2154m7;
import com.daaw.InterfaceC2411o7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* renamed from: com.daaw.kq */
/* loaded from: classes.dex */
public final class C1972kq implements InterfaceC2411o7 {

    /* renamed from: Z */
    public static boolean f16624Z;

    /* renamed from: a0 */
    public static boolean f16625a0;

    /* renamed from: A */
    public long f16626A;

    /* renamed from: B */
    public ByteBuffer f16627B;

    /* renamed from: C */
    public int f16628C;

    /* renamed from: D */
    public int f16629D;

    /* renamed from: E */
    public long f16630E;

    /* renamed from: F */
    public long f16631F;

    /* renamed from: G */
    public int f16632G;

    /* renamed from: H */
    public long f16633H;

    /* renamed from: I */
    public long f16634I;

    /* renamed from: J */
    public int f16635J;

    /* renamed from: K */
    public int f16636K;

    /* renamed from: L */
    public long f16637L;

    /* renamed from: M */
    public float f16638M;

    /* renamed from: N */
    public InterfaceC2154m7[] f16639N;

    /* renamed from: O */
    public ByteBuffer[] f16640O;

    /* renamed from: P */
    public ByteBuffer f16641P;

    /* renamed from: Q */
    public ByteBuffer f16642Q;

    /* renamed from: R */
    public byte[] f16643R;

    /* renamed from: S */
    public int f16644S;

    /* renamed from: T */
    public int f16645T;

    /* renamed from: U */
    public boolean f16646U;

    /* renamed from: V */
    public boolean f16647V;

    /* renamed from: W */
    public int f16648W;

    /* renamed from: X */
    public boolean f16649X;

    /* renamed from: Y */
    public long f16650Y;

    /* renamed from: a */
    public final C1372g7 f16651a;

    /* renamed from: b */
    public final InterfaceC1975c f16652b;

    /* renamed from: c */
    public final boolean f16653c;

    /* renamed from: d */
    public final C3201ue f16654d;

    /* renamed from: e */
    public final co1 f16655e;

    /* renamed from: f */
    public final InterfaceC2154m7[] f16656f;

    /* renamed from: g */
    public final InterfaceC2154m7[] f16657g;

    /* renamed from: h */
    public final ConditionVariable f16658h;

    /* renamed from: i */
    public final C2830r7 f16659i;

    /* renamed from: j */
    public final ArrayDeque<C1978f> f16660j;

    /* renamed from: k */
    public InterfaceC2411o7.InterfaceC2414c f16661k;

    /* renamed from: l */
    public AudioTrack f16662l;

    /* renamed from: m */
    public AudioTrack f16663m;

    /* renamed from: n */
    public boolean f16664n;

    /* renamed from: o */
    public boolean f16665o;

    /* renamed from: p */
    public int f16666p;

    /* renamed from: q */
    public int f16667q;

    /* renamed from: r */
    public int f16668r;

    /* renamed from: s */
    public int f16669s;

    /* renamed from: t */
    public C1255f7 f16670t;

    /* renamed from: u */
    public boolean f16671u;

    /* renamed from: v */
    public boolean f16672v;

    /* renamed from: w */
    public int f16673w;

    /* renamed from: x */
    public zw0 f16674x;

    /* renamed from: y */
    public zw0 f16675y;

    /* renamed from: z */
    public long f16676z;

    /* renamed from: com.daaw.kq$a */
    /* loaded from: classes.dex */
    public class C1973a extends Thread {

        /* renamed from: p */
        public final /* synthetic */ AudioTrack f16677p;

        public C1973a(AudioTrack audioTrack) {
            this.f16677p = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f16677p.flush();
                this.f16677p.release();
            } finally {
                C1972kq.this.f16658h.open();
            }
        }
    }

    /* renamed from: com.daaw.kq$b */
    /* loaded from: classes.dex */
    public class C1974b extends Thread {

        /* renamed from: p */
        public final /* synthetic */ AudioTrack f16679p;

        public C1974b(AudioTrack audioTrack) {
            this.f16679p = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f16679p.release();
        }
    }

    /* renamed from: com.daaw.kq$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1975c {
        /* renamed from: a */
        long mo17497a(long j);

        /* renamed from: b */
        zw0 mo17496b(zw0 zw0Var);

        /* renamed from: c */
        long mo17495c();

        /* renamed from: d */
        InterfaceC2154m7[] mo17494d();
    }

    /* renamed from: com.daaw.kq$d */
    /* loaded from: classes.dex */
    public static class C1976d implements InterfaceC1975c {

        /* renamed from: a */
        public final InterfaceC2154m7[] f16681a;

        /* renamed from: b */
        public final bd1 f16682b;

        /* renamed from: c */
        public final he1 f16683c;

        public C1976d(InterfaceC2154m7... interfaceC2154m7Arr) {
            InterfaceC2154m7[] interfaceC2154m7Arr2 = (InterfaceC2154m7[]) Arrays.copyOf(interfaceC2154m7Arr, interfaceC2154m7Arr.length + 2);
            this.f16681a = interfaceC2154m7Arr2;
            bd1 bd1Var = new bd1();
            this.f16682b = bd1Var;
            he1 he1Var = new he1();
            this.f16683c = he1Var;
            interfaceC2154m7Arr2[interfaceC2154m7Arr.length] = bd1Var;
            interfaceC2154m7Arr2[interfaceC2154m7Arr.length + 1] = he1Var;
        }

        @Override // com.daaw.C1972kq.InterfaceC1975c
        /* renamed from: a */
        public long mo17497a(long j) {
            return this.f16683c.m20835a(j);
        }

        @Override // com.daaw.C1972kq.InterfaceC1975c
        /* renamed from: b */
        public zw0 mo17496b(zw0 zw0Var) {
            this.f16682b.m26213u(zw0Var.f35607c);
            return new zw0(this.f16683c.m20833m(zw0Var.f35605a), this.f16683c.m20834b(zw0Var.f35606b), zw0Var.f35607c);
        }

        @Override // com.daaw.C1972kq.InterfaceC1975c
        /* renamed from: c */
        public long mo17495c() {
            return this.f16682b.m26220n();
        }

        @Override // com.daaw.C1972kq.InterfaceC1975c
        /* renamed from: d */
        public InterfaceC2154m7[] mo17494d() {
            return this.f16681a;
        }
    }

    /* renamed from: com.daaw.kq$e */
    /* loaded from: classes.dex */
    public static final class C1977e extends RuntimeException {
        public C1977e(String str) {
            super(str);
        }

        public /* synthetic */ C1977e(String str, C1973a c1973a) {
            this(str);
        }
    }

    /* renamed from: com.daaw.kq$f */
    /* loaded from: classes.dex */
    public static final class C1978f {

        /* renamed from: a */
        public final zw0 f16684a;

        /* renamed from: b */
        public final long f16685b;

        /* renamed from: c */
        public final long f16686c;

        public C1978f(zw0 zw0Var, long j, long j2) {
            this.f16684a = zw0Var;
            this.f16685b = j;
            this.f16686c = j2;
        }

        public /* synthetic */ C1978f(zw0 zw0Var, long j, long j2, C1973a c1973a) {
            this(zw0Var, j, j2);
        }
    }

    /* renamed from: com.daaw.kq$g */
    /* loaded from: classes.dex */
    public final class C1979g implements C2830r7.InterfaceC2831a {
        public C1979g() {
        }

        public /* synthetic */ C1979g(C1972kq c1972kq, C1973a c1973a) {
            this();
        }

        @Override // com.daaw.C2830r7.InterfaceC2831a
        /* renamed from: a */
        public void mo11689a(int i, long j) {
            if (C1972kq.this.f16661k != null) {
                C1972kq.this.f16661k.mo14495b(i, j, SystemClock.elapsedRealtime() - C1972kq.this.f16650Y);
            }
        }

        @Override // com.daaw.C2830r7.InterfaceC2831a
        /* renamed from: b */
        public void mo11688b(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
        }

        @Override // com.daaw.C2830r7.InterfaceC2831a
        /* renamed from: c */
        public void mo11687c(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1972kq.this.m17520H() + ", " + C1972kq.this.m17519I();
            if (C1972kq.f16625a0) {
                throw new C1977e(str, null);
            }
        }

        @Override // com.daaw.C2830r7.InterfaceC2831a
        /* renamed from: d */
        public void mo11686d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1972kq.this.m17520H() + ", " + C1972kq.this.m17519I();
            if (C1972kq.f16625a0) {
                throw new C1977e(str, null);
            }
        }
    }

    public C1972kq(C1372g7 c1372g7, InterfaceC1975c interfaceC1975c, boolean z) {
        this.f16651a = c1372g7;
        this.f16652b = (InterfaceC1975c) C2914s6.m10686e(interfaceC1975c);
        this.f16653c = z;
        this.f16658h = new ConditionVariable(true);
        this.f16659i = new C2830r7(new C1979g(this, null));
        C3201ue c3201ue = new C3201ue();
        this.f16654d = c3201ue;
        co1 co1Var = new co1();
        this.f16655e = co1Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new w41(), c3201ue, co1Var);
        Collections.addAll(arrayList, interfaceC1975c.mo17494d());
        this.f16656f = (InterfaceC2154m7[]) arrayList.toArray(new InterfaceC2154m7[arrayList.size()]);
        this.f16657g = new InterfaceC2154m7[]{new p20()};
        this.f16638M = 1.0f;
        this.f16636K = 0;
        this.f16670t = C1255f7.f9202e;
        this.f16648W = 0;
        this.f16675y = zw0.f35604e;
        this.f16645T = -1;
        this.f16639N = new InterfaceC2154m7[0];
        this.f16640O = new ByteBuffer[0];
        this.f16660j = new ArrayDeque<>();
    }

    public C1972kq(C1372g7 c1372g7, InterfaceC2154m7[] interfaceC2154m7Arr) {
        this(c1372g7, interfaceC2154m7Arr, false);
    }

    public C1972kq(C1372g7 c1372g7, InterfaceC2154m7[] interfaceC2154m7Arr, boolean z) {
        this(c1372g7, new C1976d(interfaceC2154m7Arr), z);
    }

    /* renamed from: G */
    public static int m17521G(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C1139dv.m23934e(byteBuffer);
        }
        if (i == 5) {
            return C3150u.m8655b();
        }
        if (i == 6) {
            return C3150u.m8649h(byteBuffer);
        }
        if (i == 14) {
            int m8656a = C3150u.m8656a(byteBuffer);
            if (m8656a == -1) {
                return 0;
            }
            return C3150u.m8648i(byteBuffer, m8656a) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    @TargetApi(21)
    /* renamed from: R */
    public static void m17510R(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: S */
    public static void m17509S(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    @TargetApi(21)
    /* renamed from: V */
    public static int m17506V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: A */
    public final AudioTrack m17527A() {
        AudioAttributes build = this.f16649X ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.f16670t.m22879a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f16668r).setEncoding(this.f16669s).setSampleRate(this.f16667q).build();
        int i = this.f16648W;
        return new AudioTrack(build, build2, this.f16673w, 1, i != 0 ? i : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:8:0x0010). Please submit an issue!!! */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m17526B() {
        boolean z;
        int i;
        InterfaceC2154m7[] interfaceC2154m7Arr;
        if (this.f16645T == -1) {
            int i2 = this.f16671u ? 0 : this.f16639N.length;
            this.f16645T = i2;
            z = true;
            i = this.f16645T;
            interfaceC2154m7Arr = this.f16639N;
            if (i < interfaceC2154m7Arr.length) {
                InterfaceC2154m7 interfaceC2154m7 = interfaceC2154m7Arr[i];
                if (z) {
                    interfaceC2154m7.mo6535k();
                }
                m17513O(-9223372036854775807L);
                if (!interfaceC2154m7.mo6543c()) {
                    return false;
                }
                i2 = this.f16645T + 1;
                this.f16645T = i2;
                z = true;
                i = this.f16645T;
                interfaceC2154m7Arr = this.f16639N;
                if (i < interfaceC2154m7Arr.length) {
                    ByteBuffer byteBuffer = this.f16642Q;
                    if (byteBuffer != null) {
                        m17507U(byteBuffer, -9223372036854775807L);
                        if (this.f16642Q != null) {
                            return false;
                        }
                    }
                    this.f16645T = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.f16645T;
            interfaceC2154m7Arr = this.f16639N;
            if (i < interfaceC2154m7Arr.length) {
            }
        }
    }

    /* renamed from: C */
    public final long m17525C(long j) {
        return (j * this.f16667q) / 1000000;
    }

    /* renamed from: D */
    public final void m17524D() {
        int i = 0;
        while (true) {
            InterfaceC2154m7[] interfaceC2154m7Arr = this.f16639N;
            if (i >= interfaceC2154m7Arr.length) {
                return;
            }
            InterfaceC2154m7 interfaceC2154m7 = interfaceC2154m7Arr[i];
            interfaceC2154m7.flush();
            this.f16640O[i] = interfaceC2154m7.mo6540f();
            i++;
        }
    }

    /* renamed from: E */
    public final long m17523E(long j) {
        return (j * 1000000) / this.f16667q;
    }

    /* renamed from: F */
    public final InterfaceC2154m7[] m17522F() {
        return this.f16665o ? this.f16657g : this.f16656f;
    }

    /* renamed from: H */
    public final long m17520H() {
        return this.f16664n ? this.f16630E / this.f16629D : this.f16631F;
    }

    /* renamed from: I */
    public final long m17519I() {
        return this.f16664n ? this.f16633H / this.f16632G : this.f16634I;
    }

    /* renamed from: J */
    public final void m17518J() {
        this.f16658h.block();
        AudioTrack m17517K = m17517K();
        this.f16663m = m17517K;
        int audioSessionId = m17517K.getAudioSessionId();
        if (f16624Z && sq1.f26525a < 21) {
            AudioTrack audioTrack = this.f16662l;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                m17512P();
            }
            if (this.f16662l == null) {
                this.f16662l = m17516L(audioSessionId);
            }
        }
        if (this.f16648W != audioSessionId) {
            this.f16648W = audioSessionId;
            InterfaceC2411o7.InterfaceC2414c interfaceC2414c = this.f16661k;
            if (interfaceC2414c != null) {
                interfaceC2414c.mo14496a(audioSessionId);
            }
        }
        this.f16675y = this.f16672v ? this.f16652b.mo17496b(this.f16675y) : zw0.f35604e;
        m17508T();
        this.f16659i.m11691s(this.f16663m, this.f16669s, this.f16632G, this.f16673w);
        m17511Q();
    }

    /* renamed from: K */
    public final AudioTrack m17517K() {
        AudioTrack audioTrack;
        if (sq1.f26525a >= 21) {
            audioTrack = m17527A();
        } else {
            int m10044A = sq1.m10044A(this.f16670t.f9205c);
            audioTrack = this.f16648W == 0 ? new AudioTrack(m10044A, this.f16667q, this.f16668r, this.f16669s, this.f16673w, 1) : new AudioTrack(m10044A, this.f16667q, this.f16668r, this.f16669s, this.f16673w, 1, this.f16648W);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new InterfaceC2411o7.C2413b(state, this.f16667q, this.f16668r, this.f16673w);
    }

    /* renamed from: L */
    public final AudioTrack m17516L(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    /* renamed from: M */
    public final long m17515M(long j) {
        return (j * 1000000) / this.f16666p;
    }

    /* renamed from: N */
    public final boolean m17514N() {
        return this.f16663m != null;
    }

    /* renamed from: O */
    public final void m17513O(long j) {
        ByteBuffer byteBuffer;
        int length = this.f16639N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f16640O[i - 1];
            } else {
                byteBuffer = this.f16641P;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC2154m7.f18485a;
                }
            }
            if (i == length) {
                m17507U(byteBuffer, j);
            } else {
                InterfaceC2154m7 interfaceC2154m7 = this.f16639N[i];
                interfaceC2154m7.mo6539g(byteBuffer);
                ByteBuffer mo6540f = interfaceC2154m7.mo6540f();
                this.f16640O[i] = mo6540f;
                if (mo6540f.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* renamed from: P */
    public final void m17512P() {
        AudioTrack audioTrack = this.f16662l;
        if (audioTrack == null) {
            return;
        }
        this.f16662l = null;
        new C1974b(audioTrack).start();
    }

    /* renamed from: Q */
    public final void m17511Q() {
        if (m17514N()) {
            if (sq1.f26525a >= 21) {
                m17510R(this.f16663m, this.f16638M);
            } else {
                m17509S(this.f16663m, this.f16638M);
            }
        }
    }

    /* renamed from: T */
    public final void m17508T() {
        InterfaceC2154m7[] m17522F;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2154m7 interfaceC2154m7 : m17522F()) {
            if (interfaceC2154m7.mo6542d()) {
                arrayList.add(interfaceC2154m7);
            } else {
                interfaceC2154m7.flush();
            }
        }
        int size = arrayList.size();
        this.f16639N = (InterfaceC2154m7[]) arrayList.toArray(new InterfaceC2154m7[size]);
        this.f16640O = new ByteBuffer[size];
        m17524D();
    }

    /* renamed from: U */
    public final void m17507U(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f16642Q;
            int i = 0;
            if (byteBuffer2 != null) {
                C2914s6.m10690a(byteBuffer2 == byteBuffer);
            } else {
                this.f16642Q = byteBuffer;
                if (sq1.f26525a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f16643R;
                    if (bArr == null || bArr.length < remaining) {
                        this.f16643R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f16643R, 0, remaining);
                    byteBuffer.position(position);
                    this.f16644S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (sq1.f26525a < 21) {
                int m11707c = this.f16659i.m11707c(this.f16633H);
                if (m11707c > 0) {
                    i = this.f16663m.write(this.f16643R, this.f16644S, Math.min(remaining2, m11707c));
                    if (i > 0) {
                        this.f16644S += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (this.f16649X) {
                C2914s6.m10685f(j != -9223372036854775807L);
                i = m17505W(this.f16663m, byteBuffer, remaining2, j);
            } else {
                i = m17506V(this.f16663m, byteBuffer, remaining2);
            }
            this.f16650Y = SystemClock.elapsedRealtime();
            if (i < 0) {
                throw new InterfaceC2411o7.C2415d(i);
            }
            boolean z = this.f16664n;
            if (z) {
                this.f16633H += i;
            }
            if (i == remaining2) {
                if (!z) {
                    this.f16634I += this.f16635J;
                }
                this.f16642Q = null;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: W */
    public final int m17505W(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f16627B == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f16627B = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f16627B.putInt(1431633921);
        }
        if (this.f16628C == 0) {
            this.f16627B.putInt(4, i);
            this.f16627B.putLong(8, j * 1000);
            this.f16627B.position(0);
            this.f16628C = i;
        }
        int remaining = this.f16627B.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f16627B, remaining, 1);
            if (write < 0) {
                this.f16628C = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int m17506V = m17506V(audioTrack, byteBuffer, i);
        if (m17506V < 0) {
            this.f16628C = 0;
            return m17506V;
        }
        this.f16628C -= m17506V;
        return m17506V;
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: a */
    public void mo14515a() {
        mo14512e();
        m17512P();
        for (InterfaceC2154m7 interfaceC2154m7 : this.f16656f) {
            interfaceC2154m7.mo6541e();
        }
        for (InterfaceC2154m7 interfaceC2154m72 : this.f16657g) {
            interfaceC2154m72.mo6541e();
        }
        this.f16648W = 0;
        this.f16647V = false;
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: b */
    public void mo14514b() {
        this.f16647V = false;
        if (m17514N() && this.f16659i.m11694p()) {
            this.f16663m.pause();
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: c */
    public boolean mo14513c() {
        return !m17514N() || (this.f16646U && !mo14507k());
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: e */
    public void mo14512e() {
        if (m17514N()) {
            this.f16630E = 0L;
            this.f16631F = 0L;
            this.f16633H = 0L;
            this.f16634I = 0L;
            this.f16635J = 0;
            zw0 zw0Var = this.f16674x;
            if (zw0Var != null) {
                this.f16675y = zw0Var;
                this.f16674x = null;
            } else if (!this.f16660j.isEmpty()) {
                this.f16675y = this.f16660j.getLast().f16684a;
            }
            this.f16660j.clear();
            this.f16676z = 0L;
            this.f16626A = 0L;
            this.f16641P = null;
            this.f16642Q = null;
            m17524D();
            this.f16646U = false;
            this.f16645T = -1;
            this.f16627B = null;
            this.f16628C = 0;
            this.f16636K = 0;
            if (this.f16659i.m11701i()) {
                this.f16663m.pause();
            }
            AudioTrack audioTrack = this.f16663m;
            this.f16663m = null;
            this.f16659i.m11693q();
            this.f16658h.close();
            new C1973a(audioTrack).start();
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: f */
    public zw0 mo14511f(zw0 zw0Var) {
        if (m17514N() && !this.f16672v) {
            zw0 zw0Var2 = zw0.f35604e;
            this.f16675y = zw0Var2;
            return zw0Var2;
        }
        zw0 zw0Var3 = this.f16674x;
        if (zw0Var3 == null) {
            zw0Var3 = !this.f16660j.isEmpty() ? this.f16660j.getLast().f16684a : this.f16675y;
        }
        if (!zw0Var.equals(zw0Var3)) {
            if (m17514N()) {
                this.f16674x = zw0Var;
            } else {
                this.f16675y = this.f16652b.mo17496b(zw0Var);
            }
        }
        return this.f16675y;
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: h */
    public zw0 mo14510h() {
        return this.f16675y;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0135  */
    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo14509i(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) {
        int i7;
        boolean z;
        int i8;
        boolean z2;
        int i9;
        int i10;
        InterfaceC2154m7[] m17522F;
        int i11 = i4;
        this.f16666p = i3;
        this.f16664n = sq1.m10036I(i);
        this.f16665o = this.f16653c && mo14498t(1073741824) && sq1.m10037H(i);
        if (this.f16664n) {
            this.f16629D = sq1.m9991y(i, i2);
        }
        int i12 = 4;
        if (this.f16664n) {
            i7 = i;
            if (i7 != 4) {
                z = true;
                this.f16672v = (z || this.f16665o) ? false : true;
                if (z) {
                    i8 = i3;
                    z2 = false;
                    i9 = i2;
                } else {
                    this.f16655e.m25172a(i5, i6);
                    this.f16654d.m8305a(iArr);
                    i8 = i3;
                    z2 = false;
                    i9 = i2;
                    for (InterfaceC2154m7 interfaceC2154m7 : m17522F()) {
                        try {
                            z2 |= interfaceC2154m7.mo6534l(i8, i9, i7);
                            if (interfaceC2154m7.mo6542d()) {
                                i9 = interfaceC2154m7.mo6538h();
                                i8 = interfaceC2154m7.mo6537i();
                                i7 = interfaceC2154m7.mo6536j();
                            }
                        } catch (InterfaceC2154m7.C2155a e) {
                            throw new InterfaceC2411o7.C2412a(e);
                        }
                    }
                }
                int i13 = 252;
                int i14 = 12;
                switch (i9) {
                    case 1:
                        break;
                    case 2:
                        i12 = 12;
                        break;
                    case 3:
                        i12 = 28;
                        break;
                    case 4:
                        i12 = 204;
                        break;
                    case 5:
                        i12 = 220;
                        break;
                    case 6:
                        i12 = 252;
                        break;
                    case 7:
                        i12 = 1276;
                        break;
                    case 8:
                        i12 = C1075dd.f6941a;
                        break;
                    default:
                        throw new InterfaceC2411o7.C2412a("Unsupported channel count: " + i9);
                }
                i10 = sq1.f26525a;
                if (i10 <= 23 && "foster".equals(sq1.f26526b) && "NVIDIA".equals(sq1.f26527c)) {
                    if (i9 != 3 && i9 != 5) {
                        if (i9 == 7) {
                            i13 = C1075dd.f6941a;
                        }
                    }
                    if (i10 <= 25 || !"fugu".equals(sq1.f26526b) || this.f16664n || i9 != 1) {
                        i14 = i13;
                    }
                    if (z2 && m17514N() && this.f16669s == i7 && this.f16667q == i8 && this.f16668r == i14) {
                        return;
                    }
                    mo14512e();
                    this.f16671u = z;
                    this.f16667q = i8;
                    this.f16668r = i14;
                    this.f16669s = i7;
                    this.f16632G = !this.f16664n ? sq1.m9991y(i7, i9) : -1;
                    if (i11 == 0) {
                        if (this.f16664n) {
                            int minBufferSize = AudioTrack.getMinBufferSize(i8, i14, this.f16669s);
                            C2914s6.m10685f(minBufferSize != -2);
                            i11 = sq1.m10004l(minBufferSize * 4, ((int) m17525C(250000L)) * this.f16632G, (int) Math.max(minBufferSize, m17525C(750000L) * this.f16632G));
                        } else {
                            int i15 = this.f16669s;
                            i11 = (i15 == 5 || i15 == 6) ? 20480 : i15 == 7 ? 49152 : 294912;
                        }
                    }
                    this.f16673w = i11;
                }
                i13 = i12;
                if (i10 <= 25) {
                }
                i14 = i13;
                if (z2) {
                }
                mo14512e();
                this.f16671u = z;
                this.f16667q = i8;
                this.f16668r = i14;
                this.f16669s = i7;
                this.f16632G = !this.f16664n ? sq1.m9991y(i7, i9) : -1;
                if (i11 == 0) {
                }
                this.f16673w = i11;
            }
        } else {
            i7 = i;
        }
        z = false;
        this.f16672v = (z || this.f16665o) ? false : true;
        if (z) {
        }
        int i132 = 252;
        int i142 = 12;
        switch (i9) {
        }
        i10 = sq1.f26525a;
        if (i10 <= 23) {
            if (i9 != 3) {
                if (i9 == 7) {
                }
            }
            if (i10 <= 25) {
            }
            i142 = i132;
            if (z2) {
            }
            mo14512e();
            this.f16671u = z;
            this.f16667q = i8;
            this.f16668r = i142;
            this.f16669s = i7;
            this.f16632G = !this.f16664n ? sq1.m9991y(i7, i9) : -1;
            if (i11 == 0) {
            }
            this.f16673w = i11;
        }
        i132 = i12;
        if (i10 <= 25) {
        }
        i142 = i132;
        if (z2) {
        }
        mo14512e();
        this.f16671u = z;
        this.f16667q = i8;
        this.f16668r = i142;
        this.f16669s = i7;
        this.f16632G = !this.f16664n ? sq1.m9991y(i7, i9) : -1;
        if (i11 == 0) {
        }
        this.f16673w = i11;
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: j */
    public void mo14508j() {
        if (!this.f16646U && m17514N() && m17526B()) {
            this.f16659i.m11703g(m17519I());
            this.f16663m.stop();
            this.f16628C = 0;
            this.f16646U = true;
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: k */
    public boolean mo14507k() {
        return m17514N() && this.f16659i.m11702h(m17519I());
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: l */
    public long mo14506l(boolean z) {
        if (!m17514N() || this.f16636K == 0) {
            return Long.MIN_VALUE;
        }
        return this.f16637L + m17499y(m17498z(Math.min(this.f16659i.m11706d(z), m17523E(m17519I()))));
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: m */
    public void mo14505m() {
        if (this.f16649X) {
            this.f16649X = false;
            this.f16648W = 0;
            mo14512e();
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: n */
    public void mo14504n(C1255f7 c1255f7) {
        if (this.f16670t.equals(c1255f7)) {
            return;
        }
        this.f16670t = c1255f7;
        if (this.f16649X) {
            return;
        }
        mo14512e();
        this.f16648W = 0;
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: o */
    public void mo14503o() {
        if (this.f16636K == 1) {
            this.f16636K = 2;
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: p */
    public void mo14502p(float f) {
        if (this.f16638M != f) {
            this.f16638M = f;
            m17511Q();
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: q */
    public boolean mo14501q(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2 = this.f16641P;
        C2914s6.m10690a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!m17514N()) {
            m17518J();
            if (this.f16647V) {
                mo14499s();
            }
        }
        if (this.f16659i.m11699k(m17519I())) {
            if (this.f16641P == null) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                if (!this.f16664n && this.f16635J == 0) {
                    int m17521G = m17521G(this.f16669s, byteBuffer);
                    this.f16635J = m17521G;
                    if (m17521G == 0) {
                        return true;
                    }
                }
                if (this.f16674x != null) {
                    if (!m17526B()) {
                        return false;
                    }
                    zw0 zw0Var = this.f16674x;
                    this.f16674x = null;
                    this.f16660j.add(new C1978f(this.f16652b.mo17496b(zw0Var), Math.max(0L, j), m17523E(m17519I()), null));
                    m17508T();
                }
                if (this.f16636K == 0) {
                    this.f16637L = Math.max(0L, j);
                    this.f16636K = 1;
                } else {
                    long m17515M = this.f16637L + m17515M(m17520H());
                    if (this.f16636K == 1 && Math.abs(m17515M - j) > 200000) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Discontinuity detected [expected ");
                        sb.append(m17515M);
                        sb.append(", got ");
                        sb.append(j);
                        sb.append("]");
                        this.f16636K = 2;
                    }
                    if (this.f16636K == 2) {
                        this.f16637L += j - m17515M;
                        this.f16636K = 1;
                        InterfaceC2411o7.InterfaceC2414c interfaceC2414c = this.f16661k;
                        if (interfaceC2414c != null) {
                            interfaceC2414c.mo14494c();
                        }
                    }
                }
                if (this.f16664n) {
                    this.f16630E += byteBuffer.remaining();
                } else {
                    this.f16631F += this.f16635J;
                }
                this.f16641P = byteBuffer;
            }
            if (this.f16671u) {
                m17513O(j);
            } else {
                m17507U(this.f16641P, j);
            }
            if (!this.f16641P.hasRemaining()) {
                this.f16641P = null;
                return true;
            } else if (this.f16659i.m11700j(m17519I())) {
                mo14512e();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: r */
    public void mo14500r(int i) {
        C2914s6.m10685f(sq1.f26525a >= 21);
        if (this.f16649X && this.f16648W == i) {
            return;
        }
        this.f16649X = true;
        this.f16648W = i;
        mo14512e();
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: s */
    public void mo14499s() {
        this.f16647V = true;
        if (m17514N()) {
            this.f16659i.m11690t();
            this.f16663m.play();
        }
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: t */
    public boolean mo14498t(int i) {
        if (sq1.m10036I(i)) {
            return i != 4 || sq1.f26525a >= 21;
        }
        C1372g7 c1372g7 = this.f16651a;
        return c1372g7 != null && c1372g7.m21897c(i);
    }

    @Override // com.daaw.InterfaceC2411o7
    /* renamed from: u */
    public void mo14497u(InterfaceC2411o7.InterfaceC2414c interfaceC2414c) {
        this.f16661k = interfaceC2414c;
    }

    /* renamed from: y */
    public final long m17499y(long j) {
        return j + m17523E(this.f16652b.mo17495c());
    }

    /* renamed from: z */
    public final long m17498z(long j) {
        long j2;
        long m9993w;
        C1978f c1978f = null;
        while (!this.f16660j.isEmpty() && j >= this.f16660j.getFirst().f16686c) {
            c1978f = this.f16660j.remove();
        }
        if (c1978f != null) {
            this.f16675y = c1978f.f16684a;
            this.f16626A = c1978f.f16686c;
            this.f16676z = c1978f.f16685b - this.f16637L;
        }
        if (this.f16675y.f35605a == 1.0f) {
            return (j + this.f16676z) - this.f16626A;
        }
        if (this.f16660j.isEmpty()) {
            j2 = this.f16676z;
            m9993w = this.f16652b.mo17497a(j - this.f16626A);
        } else {
            j2 = this.f16676z;
            m9993w = sq1.m9993w(j - this.f16626A, this.f16675y.f35605a);
        }
        return j2 + m9993w;
    }
}
