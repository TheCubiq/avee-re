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
/* loaded from: classes.dex */
public final class i31 implements InterfaceC2200mp {

    /* renamed from: a */
    public final Resources f13210a;

    /* renamed from: b */
    public final bn1<? super i31> f13211b;

    /* renamed from: c */
    public Uri f13212c;

    /* renamed from: d */
    public AssetFileDescriptor f13213d;

    /* renamed from: e */
    public InputStream f13214e;

    /* renamed from: f */
    public long f13215f;

    /* renamed from: g */
    public boolean f13216g;

    /* renamed from: com.daaw.i31$a */
    /* loaded from: classes.dex */
    public static class C1654a extends IOException {
        public C1654a(IOException iOException) {
            super(iOException);
        }

        public C1654a(String str) {
            super(str);
        }
    }

    public i31(Context context, bn1<? super i31> bn1Var) {
        this.f13210a = context.getResources();
        this.f13211b = bn1Var;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13215f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C1654a(e);
            }
        }
        int read = this.f13214e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f13215f == -1) {
                return -1;
            }
            throw new C1654a(new EOFException());
        }
        long j2 = this.f13215f;
        if (j2 != -1) {
            this.f13215f = j2 - read;
        }
        bn1<? super i31> bn1Var = this.f13211b;
        if (bn1Var != null) {
            bn1Var.mo16680a(this, read);
        }
        return read;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    public long mo8641c(C2570pp c2570pp) {
        try {
            Uri uri = c2570pp.f23115a;
            this.f13212c = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    this.f13213d = this.f13210a.openRawResourceFd(Integer.parseInt(this.f13212c.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.f13213d.getFileDescriptor());
                    this.f13214e = fileInputStream;
                    fileInputStream.skip(this.f13213d.getStartOffset());
                    if (this.f13214e.skip(c2570pp.f23118d) >= c2570pp.f23118d) {
                        long j = c2570pp.f23119e;
                        long j2 = -1;
                        if (j != -1) {
                            this.f13215f = j;
                        } else {
                            long length = this.f13213d.getLength();
                            if (length != -1) {
                                j2 = length - c2570pp.f23118d;
                            }
                            this.f13215f = j2;
                        }
                        this.f13216g = true;
                        bn1<? super i31> bn1Var = this.f13211b;
                        if (bn1Var != null) {
                            bn1Var.mo16678c(this, c2570pp);
                        }
                        return this.f13215f;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C1654a("Resource identifier must be an integer.");
                }
            }
            throw new C1654a("URI must use scheme rawresource");
        } catch (IOException e) {
            throw new C1654a(e);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        this.f13212c = null;
        try {
            try {
                InputStream inputStream = this.f13214e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f13214e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13213d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C1654a(e);
                    }
                } finally {
                    this.f13213d = null;
                    if (this.f13216g) {
                        this.f13216g = false;
                        bn1<? super i31> bn1Var = this.f13211b;
                        if (bn1Var != null) {
                            bn1Var.mo16679b(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new C1654a(e2);
            }
        } catch (Throwable th) {
            this.f13214e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f13213d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f13213d = null;
                    if (this.f13216g) {
                        this.f13216g = false;
                        bn1<? super i31> bn1Var2 = this.f13211b;
                        if (bn1Var2 != null) {
                            bn1Var2.mo16679b(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C1654a(e3);
                }
            } finally {
                this.f13213d = null;
                if (this.f13216g) {
                    this.f13216g = false;
                    bn1<? super i31> bn1Var3 = this.f13211b;
                    if (bn1Var3 != null) {
                        bn1Var3.mo16679b(this);
                    }
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        return this.f13212c;
    }
}
