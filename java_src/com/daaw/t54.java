package com.daaw;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class t54 extends SSLSocketFactory {

    /* renamed from: a */
    public final SSLSocketFactory f27014a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    public final /* synthetic */ u54 f27015b;

    public t54(u54 u54Var) {
        this.f27015b = u54Var;
    }

    /* renamed from: a */
    public final Socket m9518a(Socket socket) {
        int i;
        int i2;
        u54 u54Var = this.f27015b;
        i = u54Var.f28574s;
        if (i > 0) {
            i2 = u54Var.f28574s;
            socket.setReceiveBufferSize(i2);
        }
        this.f27015b.f28575t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f27014a.createSocket(str, i);
        m9518a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f27014a.createSocket(str, i, inetAddress, i2);
        m9518a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f27014a.createSocket(inetAddress, i);
        m9518a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f27014a.createSocket(inetAddress, i, inetAddress2, i2);
        m9518a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f27014a.createSocket(socket, str, i, z);
        m9518a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f27014a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f27014a.getSupportedCipherSuites();
    }
}
