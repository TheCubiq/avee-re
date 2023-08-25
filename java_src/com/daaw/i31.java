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
public final class i31 implements mp {
    public final Resources a;
    public final bn1<? super i31> b;
    public Uri c;
    public AssetFileDescriptor d;
    public InputStream e;
    public long f;
    public boolean g;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str) {
            super(str);
        }
    }

    public i31(Context context, bn1<? super i31> bn1Var) {
        this.a = context.getResources();
        this.b = bn1Var;
    }

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int read = this.e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
        }
        bn1<? super i31> bn1Var = this.b;
        if (bn1Var != null) {
            bn1Var.a(this, read);
        }
        return read;
    }

    @Override // com.daaw.mp
    public long c(pp ppVar) {
        try {
            Uri uri = ppVar.a;
            this.c = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    this.d = this.a.openRawResourceFd(Integer.parseInt(this.c.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.d.getFileDescriptor());
                    this.e = fileInputStream;
                    fileInputStream.skip(this.d.getStartOffset());
                    if (this.e.skip(ppVar.d) >= ppVar.d) {
                        long j = ppVar.e;
                        long j2 = -1;
                        if (j != -1) {
                            this.f = j;
                        } else {
                            long length = this.d.getLength();
                            if (length != -1) {
                                j2 = length - ppVar.d;
                            }
                            this.f = j2;
                        }
                        this.g = true;
                        bn1<? super i31> bn1Var = this.b;
                        if (bn1Var != null) {
                            bn1Var.c(this, ppVar);
                        }
                        return this.f;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new a("Resource identifier must be an integer.");
                }
            }
            throw new a("URI must use scheme rawresource");
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.mp
    public void close() {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        bn1<? super i31> bn1Var = this.b;
                        if (bn1Var != null) {
                            bn1Var.b(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        bn1<? super i31> bn1Var2 = this.b;
                        if (bn1Var2 != null) {
                            bn1Var2.b(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    bn1<? super i31> bn1Var3 = this.b;
                    if (bn1Var3 != null) {
                        bn1Var3.b(this);
                    }
                }
            }
        }
    }

    @Override // com.daaw.mp
    public Uri d() {
        return this.c;
    }
}
