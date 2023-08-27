package com.daaw.avee.comp.VisualizerExporter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.VisualizerExporter.AudioEncoderCore;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class AudioEncoderManager2B implements Runnable {
    private static final int MSG_FRAME_AVAILABLE = 2;
    private static final int MSG_STOP_RECORDING = 1;
    private static final String TAG = "AudioEncoderManager2B";
    private static final boolean VERBOSE = false;
    private volatile EncoderHandler mHandler;
    private boolean mReady;
    private boolean mRunning;
    private AudioEncoderCore mVideoEncoder;
    private Object mReadyFence = new Object();
    private AtomicInteger audioEncodeFrameFailed = new AtomicInteger();

    public AudioEncoderManager2B(AudioEncoderCore audioEncoderCore) {
        Log.d(TAG, "Encoder: startRecording()");
        this.mVideoEncoder = audioEncoderCore;
        synchronized (this.mReadyFence) {
            if (this.mRunning) {
                Log.w(TAG, "Encoder thread already running");
                return;
            }
            this.mRunning = true;
            new Thread(this, "AudioTextureMovieEncoder2B").start();
            while (!this.mReady) {
                try {
                    this.mReadyFence.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void stopRecording() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1));
    }

    public boolean isRecording() {
        boolean z;
        synchronized (this.mReadyFence) {
            z = this.mRunning;
        }
        return z;
    }

    public void frameAvailableSoon(AudioEncoderCore.EncodeData encodeData) {
        synchronized (this.mReadyFence) {
            if (this.mReady) {
                this.mHandler.sendMessage(this.mHandler.obtainMessage(2, encodeData));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.mReadyFence) {
            this.mHandler = new EncoderHandler(this);
            this.mReady = true;
            this.mReadyFence.notify();
        }
        Looper.loop();
        Log.d(TAG, "Encoder thread exiting");
        synchronized (this.mReadyFence) {
            this.mRunning = false;
            this.mReady = false;
            this.mHandler = null;
        }
    }

    public void reportMessages(StatusMsg statusMsg) {
        int i = this.audioEncodeFrameFailed.get();
        if (i > 0) {
            statusMsg.addErrorMessage("audioEncodeFrameFailed (" + i + ")");
        }
    }

    /* loaded from: classes.dex */
    private static class EncoderHandler extends Handler {
        private WeakReference<AudioEncoderManager2B> mWeakEncoder;

        public EncoderHandler(AudioEncoderManager2B audioEncoderManager2B) {
            this.mWeakEncoder = new WeakReference<>(audioEncoderManager2B);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            AudioEncoderManager2B audioEncoderManager2B = this.mWeakEncoder.get();
            if (audioEncoderManager2B == null) {
                Log.w(AudioEncoderManager2B.TAG, "EncoderHandler.handleMessage: encoder is null");
            } else if (i == 1) {
                audioEncoderManager2B.handleStopRecording();
                Looper.myLooper().quit();
            } else if (i == 2) {
                if (audioEncoderManager2B.handleFrameAvailable((AudioEncoderCore.EncodeData) obj, false)) {
                    return;
                }
                audioEncoderManager2B.audioEncodeFrameFailed.incrementAndGet();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleFrameAvailable(AudioEncoderCore.EncodeData encodeData, boolean z) {
        int i = 0;
        while (i < 2) {
            try {
                boolean encode = this.mVideoEncoder.encode(encodeData, z, i == 0);
                this.mVideoEncoder.drainEncoder(false, false);
                if (encode) {
                    return true;
                }
                tlog.w("############### [" + i + "] encode tried failed ");
                i++;
            } catch (Exception e) {
                tlog.e(e, "");
            }
        }
        tlog.w("encode failed, INFO_TRY_AGAIN_LATER?");
        tlog.w("encode failed, presentationTimeUs: " + encodeData.presentationTimeUs + " length: " + encodeData.length);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStopRecording() {
        try {
            Log.d(TAG, "handleStopRecording");
            handleFrameAvailable(new AudioEncoderCore.EncodeData(), true);
            this.mVideoEncoder.release();
        } catch (IllegalStateException e) {
            tlog.e(e, "");
        }
    }
}
