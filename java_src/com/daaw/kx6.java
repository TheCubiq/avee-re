package com.daaw;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Objects;
/* loaded from: classes.dex */
public final class kx6 extends sx5 {

    /* renamed from: e */
    public final Resources f16823e;

    /* renamed from: f */
    public final String f16824f;

    /* renamed from: g */
    public Uri f16825g;

    /* renamed from: h */
    public AssetFileDescriptor f16826h;

    /* renamed from: i */
    public InputStream f16827i;

    /* renamed from: j */
    public long f16828j;

    /* renamed from: k */
    public boolean f16829k;

    public kx6(Context context) {
        super(false);
        this.f16823e = context.getResources();
        this.f16824f = context.getPackageName();
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f16828j;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new hw6(null, e, 2000);
                }
            }
            InputStream inputStream = this.f16827i;
            int i3 = it5.f13991a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.f16828j == -1) {
                    return -1;
                }
                throw new hw6("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j2 = this.f16828j;
            if (j2 != -1) {
                this.f16828j = j2 - read;
            }
            m9782c(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r1.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    @Override // com.daaw.p46
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1978g(pa6 pa6Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri uri = pa6Var.f22769a;
        this.f16825g = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        Objects.requireNonNull(lastPathSegment);
                    }
                    if (TextUtils.equals("android.resource", uri.getScheme())) {
                        String path = uri.getPath();
                        Objects.requireNonNull(path);
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        String host = uri.getHost();
                        parseInt = this.f16823e.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.f16824f);
                        if (parseInt == 0) {
                            throw new hw6("Resource not found.", null, 2005);
                        }
                        m9780l(pa6Var);
                        openRawResourceFd = this.f16823e.openRawResourceFd(parseInt);
                        this.f16826h = openRawResourceFd;
                        if (openRawResourceFd == null) {
                            long length = openRawResourceFd.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.f16827i = fileInputStream;
                            if (length != -1) {
                                try {
                                    if (pa6Var.f22774f > length) {
                                        throw new hw6(null, null, 2008);
                                    }
                                } catch (hw6 e) {
                                    throw e;
                                } catch (IOException e2) {
                                    throw new hw6(null, e2, 2000);
                                }
                            }
                            long startOffset = openRawResourceFd.getStartOffset();
                            long skip = fileInputStream.skip(pa6Var.f22774f + startOffset) - startOffset;
                            if (skip == pa6Var.f22774f) {
                                if (length == -1) {
                                    FileChannel channel = fileInputStream.getChannel();
                                    if (channel.size() == 0) {
                                        this.f16828j = -1L;
                                        j = -1;
                                    } else {
                                        j = channel.size() - channel.position();
                                        this.f16828j = j;
                                        if (j < 0) {
                                            throw new hw6(null, null, 2008);
                                        }
                                    }
                                } else {
                                    j = length - skip;
                                    this.f16828j = j;
                                    if (j < 0) {
                                        throw new s56(2008);
                                    }
                                }
                                long j2 = pa6Var.f22775g;
                                if (j2 != -1) {
                                    if (j != -1) {
                                        j2 = Math.min(j, j2);
                                    }
                                    this.f16828j = j2;
                                }
                                this.f16829k = true;
                                m9779m(pa6Var);
                                long j3 = pa6Var.f22775g;
                                return j3 != -1 ? j3 : this.f16828j;
                            }
                            throw new hw6(null, null, 2008);
                        }
                        throw new hw6("Resource is compressed: ".concat(String.valueOf(uri)), null, 2000);
                    }
                    throw new hw6("URI must either use scheme rawresource or android.resource", null, 1004);
                }
                openRawResourceFd = this.f16823e.openRawResourceFd(parseInt);
                this.f16826h = openRawResourceFd;
                if (openRawResourceFd == null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new hw6(null, e3, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            Objects.requireNonNull(lastPathSegment2);
            parseInt = Integer.parseInt(lastPathSegment2);
            m9780l(pa6Var);
        } catch (NumberFormatException unused) {
            throw new hw6("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f16825g;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f16825g = null;
        try {
            try {
                InputStream inputStream = this.f16827i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f16827i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16826h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f16826h = null;
                        if (this.f16829k) {
                            this.f16829k = false;
                            m9781k();
                        }
                    }
                } catch (IOException e) {
                    throw new hw6(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new hw6(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.f16827i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f16826h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f16826h = null;
                    if (this.f16829k) {
                        this.f16829k = false;
                        m9781k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new hw6(null, e3, 2000);
                }
            } catch (Throwable th2) {
                this.f16826h = null;
                if (this.f16829k) {
                    this.f16829k = false;
                    m9781k();
                }
                throw th2;
            }
        }
    }
}
