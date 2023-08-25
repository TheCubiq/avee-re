package com.daaw;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzacn;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ts8 implements xw8, yq8 {

    /* renamed from: b */
    public final Uri f28032b;

    /* renamed from: c */
    public final ny6 f28033c;

    /* renamed from: d */
    public final os8 f28034d;

    /* renamed from: e */
    public final m09 f28035e;

    /* renamed from: f */
    public final ds4 f28036f;

    /* renamed from: h */
    public volatile boolean f28038h;

    /* renamed from: j */
    public long f28040j;

    /* renamed from: l */
    public m42 f28042l;

    /* renamed from: m */
    public boolean f28043m;

    /* renamed from: n */
    public final /* synthetic */ ys8 f28044n;

    /* renamed from: g */
    public final f42 f28037g = new f42();

    /* renamed from: i */
    public boolean f28039i = true;

    /* renamed from: a */
    public final long f28031a = ar8.m27119a();

    /* renamed from: k */
    public pa6 f28041k = m8832g(0);

    public ts8(ys8 ys8Var, Uri uri, p46 p46Var, os8 os8Var, m09 m09Var, ds4 ds4Var) {
        this.f28044n = ys8Var;
        this.f28032b = uri;
        this.f28033c = new ny6(p46Var);
        this.f28034d = os8Var;
        this.f28035e = m09Var;
        this.f28036f = ds4Var;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ long m8837b(ts8 ts8Var) {
        return ts8Var.f28031a;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ long m8836c(ts8 ts8Var) {
        return ts8Var.f28040j;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ pa6 m8835d(ts8 ts8Var) {
        return ts8Var.f28041k;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ny6 m8834e(ts8 ts8Var) {
        return ts8Var.f28033c;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m8833f(ts8 ts8Var, long j, long j2) {
        ts8Var.f28037g.f9093a = j;
        ts8Var.f28040j = j2;
        ts8Var.f28039i = true;
        ts8Var.f28043m = false;
    }

    @Override // com.daaw.yq8
    /* renamed from: a */
    public final void mo3399a(ik5 ik5Var) {
        long m3281y;
        long max;
        if (this.f28043m) {
            m3281y = this.f28044n.m3281y(true);
            max = Math.max(m3281y, this.f28040j);
        } else {
            max = this.f28040j;
        }
        int m19713i = ik5Var.m19713i();
        m42 m42Var = this.f28042l;
        Objects.requireNonNull(m42Var);
        k42.m18050b(m42Var, ik5Var, m19713i);
        m42Var.mo16222b(max, 1, m19713i, 0, null);
        this.f28043m = true;
    }

    /* renamed from: g */
    public final pa6 m8832g(long j) {
        Map map;
        j86 j86Var = new j86();
        j86Var.m18727d(this.f28032b);
        j86Var.m18728c(j);
        j86Var.m18730a(6);
        map = ys8.f34015a0;
        j86Var.m18729b(map);
        return j86Var.m18726e();
    }

    @Override // com.daaw.xw8
    public final void zzg() {
        this.f28038h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0084 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009a A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b0 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c6 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00e2 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0117 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x012b A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x016b A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0174 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01ca A[SYNTHETIC] */
    @Override // com.daaw.xw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        int i;
        int i2;
        boolean z;
        int i3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i4;
        zzacn zzacnVar;
        xp8 xp8Var;
        zzacn zzacnVar2;
        int i5;
        int i6;
        int i7;
        long j;
        Handler handler;
        Runnable runnable;
        zzacn zzacnVar3;
        zzacn zzacnVar4;
        f92 f92Var;
        int i8;
        int i9;
        while (!this.f28038h) {
            try {
                long j2 = this.f28037g.f9093a;
                pa6 m8832g = m8832g(j2);
                this.f28041k = m8832g;
                long mo1978g = this.f28033c.mo1978g(m8832g);
                if (mo1978g != -1) {
                    mo1978g += j2;
                    r8.f34018B.post(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: INVOKE  
                          (wrap: android.os.Handler : 0x0000: IGET  (r8v13 com.daaw.ys8) com.daaw.ys8.B android.os.Handler)
                          (wrap: java.lang.Runnable : 0x0004: CONSTRUCTOR  
                          (wrap: com.daaw.ys8 : 0x0020: IGET  (r8v13 com.daaw.ys8 A[REMOVE]) = (r24v0 'this' com.daaw.ts8 A[IMMUTABLE_TYPE, THIS]) com.daaw.ts8.n com.daaw.ys8)
                         call: com.daaw.rs8.<init>(com.daaw.ys8):void type: CONSTRUCTOR)
                         type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.daaw.ts8.zzh():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.daaw.rs8, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 33 more
                        */
                    /*
                        Method dump skipped, instructions count: 525
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.ts8.zzh():void");
                }
            }
