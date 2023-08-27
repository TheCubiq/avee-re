package com.android.grafika;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class TextureMovieEncoder2B implements Runnable {
    private static final int MSG_FRAME_AVAILABLE = 2;
    private static final int MSG_STOP_RECORDING = 1;
    private static final String TAG = "TextureMovieEncoder2B";
    private static final boolean VERBOSE = false;
    private volatile EncoderHandler mHandler;
    private boolean mReady;
    private Object mReadyFence = new Object();
    private boolean mRunning;
    private VideoEncoderCoreB mVideoEncoder;

    public TextureMovieEncoder2B(VideoEncoderCoreB videoEncoderCoreB) {
        Log.d(TAG, "Encoder: startRecording()");
        this.mVideoEncoder = videoEncoderCoreB;
        synchronized (this.mReadyFence) {
            if (this.mRunning) {
                Log.w(TAG, "Encoder thread already running");
                return;
            }
            this.mRunning = true;
            new Thread(this, "TextureMovieEncoder").start();
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

    public void frameAvailableSoon() {
        synchronized (this.mReadyFence) {
            if (this.mReady) {
                this.mHandler.sendMessage(this.mHandler.obtainMessage(2));
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

    /* loaded from: classes.dex */
    private static class EncoderHandler extends Handler {
        private WeakReference<TextureMovieEncoder2B> mWeakEncoder;

        public EncoderHandler(TextureMovieEncoder2B textureMovieEncoder2B) {
            this.mWeakEncoder = new WeakReference<>(textureMovieEncoder2B);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            TextureMovieEncoder2B textureMovieEncoder2B = this.mWeakEncoder.get();
            if (textureMovieEncoder2B == null) {
                Log.w(TextureMovieEncoder2B.TAG, "EncoderHandler.handleMessage: encoder is null");
            } else if (i == 1) {
                textureMovieEncoder2B.handleStopRecording();
                Looper.myLooper().quit();
            } else if (i == 2) {
                textureMovieEncoder2B.handleFrameAvailable();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFrameAvailable() {
        try {
            this.mVideoEncoder.drainEncoder(false);
        } catch (Exception e) {
            Log.w(TAG, "handleFrameAvailable exception: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStopRecording() {
        try {
            Log.d(TAG, "handleStopRecording");
            this.mVideoEncoder.drainEncoder(true);
            this.mVideoEncoder.release();
        } catch (Exception e) {
            Log.d(TAG, "exception: " + e.getMessage());
        }
    }
}
