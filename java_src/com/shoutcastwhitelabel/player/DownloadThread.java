package com.shoutcastwhitelabel.player;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes2.dex */
public class DownloadThread extends Thread {
    public String m_errors = "";
    public ShoutcastFile m_shoutcast_file = null;
    public URL m_url;

    public DownloadThread(URL url) {
        this.m_url = url;
    }

    public void done() {
        ShoutcastFile shoutcastFile = this.m_shoutcast_file;
        if (shoutcastFile != null) {
            shoutcastFile.done();
        }
    }

    public String errors() {
        if (this.m_shoutcast_file != null) {
            return this.m_errors + this.m_shoutcast_file.errors();
        }
        return this.m_errors;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        try {
            URLConnection openConnection = this.m_url.openConnection();
            openConnection.setRequestProperty(AbstractSpiCall.HEADER_USER_AGENT, "Nagare");
            openConnection.connect();
            ShoutcastFile shoutcastFile = new ShoutcastFile(openConnection);
            this.m_shoutcast_file = shoutcastFile;
            shoutcastFile.download(this, openConnection.getInputStream());
        } catch (Exception e) {
            this.m_errors += e.toString() + "\n";
        }
    }
}
