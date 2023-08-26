package com.shoutcastwhitelabel.player;

import android.os.Environment;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.GregorianCalendar;
/* loaded from: classes2.dex */
public class ShoutcastFile {
    int m_bitrate;
    long m_current_write_pos;
    File m_file;
    String m_file_name;
    File m_nagare_dir;
    String m_shoutcast_name;
    long m_buffer_mark_pos = 0;
    boolean m_done = false;
    boolean m_notified_buffering_done = false;
    String m_errors = "";

    public ShoutcastFile(URLConnection uRLConnection) {
        this.m_shoutcast_name = uRLConnection.getHeaderField("icy-name");
        this.m_bitrate = Integer.parseInt(uRLConnection.getHeaderField("icy-br"));
        build_file_name();
    }

    public void build_file_name() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.m_file_name = this.m_shoutcast_name.replaceAll("[\\/:*?\"<>|]", "_");
        this.m_file_name += "-" + gregorianCalendar.get(1) + gregorianCalendar.get(2) + gregorianCalendar.get(5) + gregorianCalendar.get(11) + gregorianCalendar.get(12) + gregorianCalendar.get(13) + DefaultHlsExtractorFactory.MP3_FILE_EXTENSION;
        File file = new File(Environment.getExternalStorageDirectory() + "/Nagare");
        this.m_nagare_dir = file;
        file.mkdirs();
        this.m_file = new File(this.m_nagare_dir.getAbsolutePath(), this.m_file_name);
    }

    public void done() {
        this.m_done = true;
    }

    public String errors() {
        return this.m_errors;
    }

    public String file_path() {
        return this.m_file.getAbsolutePath();
    }

    public void download(DownloadThread downloadThread, InputStream inputStream) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.m_file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1 || this.m_done) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                this.m_current_write_pos += read;
            }
        } catch (Exception e) {
            this.m_errors += e.toString() + "\n";
        }
        done();
    }

    public void rebuffer() {
        this.m_buffer_mark_pos = this.m_current_write_pos;
        this.m_notified_buffering_done = false;
    }
}
