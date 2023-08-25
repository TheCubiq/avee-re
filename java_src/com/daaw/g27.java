package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g27 extends sx5 {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public g27(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f);
                int length = this.f.getLength();
                this.l = length;
                c(length);
            } catch (SocketTimeoutException e) {
                throw new d17(e, 2002);
            } catch (IOException e2) {
                throw new d17(e2, 2001);
            }
        }
        int length2 = this.f.getLength();
        int i3 = this.l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, length2 - i3, bArr, i, min);
        this.l -= min;
        return min;
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        Uri uri = pa6Var.a;
        this.g = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.g.getPort();
        l(pa6Var);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.h = this.i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.k = true;
            m(pa6Var);
            return -1L;
        } catch (IOException e) {
            throw new d17(e, 2001);
        } catch (SecurityException e2) {
            throw new d17(e2, 2006);
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.g;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.j;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            k();
        }
    }
}
