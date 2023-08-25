package com.daaw;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class m54 extends j54 {
    public static final Set u = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat v = new DecimalFormat("#,###");
    public static final /* synthetic */ int w = 0;
    public File s;
    public boolean t;

    public m54(y24 y24Var) {
        super(y24Var);
        File cacheDir = this.p.getCacheDir();
        if (cacheDir == null) {
            k04.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.s = file;
        if (!file.isDirectory() && !this.s.mkdirs()) {
            k04.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.s.getAbsolutePath())));
            this.s = null;
        } else if (this.s.setReadable(true, false) && this.s.setExecutable(true, false)) {
        } else {
            k04.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.s.getAbsolutePath())));
            this.s = null;
        }
    }

    @Override // com.daaw.j54
    public final void h() {
        this.t = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0349, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0351, code lost:
        if (com.daaw.k04.zzm(3) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0353, code lost:
        com.daaw.k04.zze("Preloaded " + com.daaw.m54.v.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0376, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037f, code lost:
        if (r0.isFile() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0381, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040d  */
    @Override // com.daaw.j54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.m54.s(java.lang.String):boolean");
    }

    public final File v(File file) {
        return new File(this.s, String.valueOf(file.getName()).concat(".done"));
    }
}
