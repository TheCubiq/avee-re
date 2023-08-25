package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* renamed from: com.daaw.sk */
/* loaded from: classes.dex */
public final class C2946sk implements InterfaceC2200mp {

    /* renamed from: a */
    public final ContentResolver f26318a;

    /* renamed from: b */
    public final bn1<? super C2946sk> f26319b;

    /* renamed from: c */
    public Uri f26320c;

    /* renamed from: d */
    public AssetFileDescriptor f26321d;

    /* renamed from: e */
    public FileInputStream f26322e;

    /* renamed from: f */
    public long f26323f;

    /* renamed from: g */
    public boolean f26324g;

    /* renamed from: com.daaw.sk$a */
    /* loaded from: classes.dex */
    public static class C2947a extends IOException {
        public C2947a(IOException iOException) {
            super(iOException);
        }
    }

    public C2946sk(Context context, bn1<? super C2946sk> bn1Var) {
        this.f26318a = context.getContentResolver();
        this.f26319b = bn1Var;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f26323f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C2947a(e);
            }
        }
        int read = this.f26322e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f26323f == -1) {
                return -1;
            }
            throw new C2947a(new EOFException());
        }
        long j2 = this.f26323f;
        if (j2 != -1) {
            this.f26323f = j2 - read;
        }
        bn1<? super C2946sk> bn1Var = this.f26319b;
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
            this.f26320c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f26318a.openAssetFileDescriptor(uri, "r");
            this.f26321d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f26320c);
            }
            this.f26322e = new FileInputStream(this.f26321d.getFileDescriptor());
            long startOffset = this.f26321d.getStartOffset();
            long skip = this.f26322e.skip(c2570pp.f23118d + startOffset) - startOffset;
            if (skip == c2570pp.f23118d) {
                long j = c2570pp.f23119e;
                long j2 = -1;
                if (j != -1) {
                    this.f26323f = j;
                } else {
                    long length = this.f26321d.getLength();
                    if (length == -1) {
                        FileChannel channel = this.f26322e.getChannel();
                        long size = channel.size();
                        if (size != 0) {
                            j2 = size - channel.position();
                        }
                        this.f26323f = j2;
                    } else {
                        this.f26323f = length - skip;
                    }
                }
                this.f26324g = true;
                bn1<? super C2946sk> bn1Var = this.f26319b;
                if (bn1Var != null) {
                    bn1Var.mo16678c(this, c2570pp);
                }
                return this.f26323f;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C2947a(e);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        this.f26320c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f26322e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f26322e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f26321d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C2947a(e);
                    }
                } finally {
                    this.f26321d = null;
                    if (this.f26324g) {
                        this.f26324g = false;
                        bn1<? super C2946sk> bn1Var = this.f26319b;
                        if (bn1Var != null) {
                            bn1Var.mo16679b(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new C2947a(e2);
            }
        } catch (Throwable th) {
            this.f26322e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f26321d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f26321d = null;
                    if (this.f26324g) {
                        this.f26324g = false;
                        bn1<? super C2946sk> bn1Var2 = this.f26319b;
                        if (bn1Var2 != null) {
                            bn1Var2.mo16679b(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C2947a(e3);
                }
            } finally {
                this.f26321d = null;
                if (this.f26324g) {
                    this.f26324g = false;
                    bn1<? super C2946sk> bn1Var3 = this.f26319b;
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
        return this.f26320c;
    }
}
