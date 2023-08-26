package com.android.grafika;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class TextureMovieEncoder2 implements Runnable {
    private static final int MSG_FRAME_AVAILABLE = 2;
    private static final int MSG_STOP_RECORDING = 1;
    private static final String TAG = "TextureMovieEncoder2";
    private static final boolean VERBOSE = false;
    private volatile EncoderHandler mHandler;
    private boolean mReady;
    private Object mReadyFence = new Object();
    private boolean mRunning;
    private VideoEncoderCore mVideoEncoder;

    public TextureMovieEncoder2(VideoEncoderCore videoEncoderCore) {
        Log.d(TAG, "Encoder: startRecording()");
        this.mVideoEncoder = videoEncoderCore;
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
        private WeakReference<TextureMovieEncoder2> mWeakEncoder;

        public EncoderHandler(TextureMovieEncoder2 textureMovieEncoder2) {
            this.mWeakEncoder = new WeakReference<>(textureMovieEncoder2);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            TextureMovieEncoder2 textureMovieEncoder2 = this.mWeakEncoder.get();
            if (textureMovieEncoder2 == null) {
                Log.w(TextureMovieEncoder2.TAG, "EncoderHandler.handleMessage: encoder is null");
            } else if (i == 1) {
                textureMovieEncoder2.handleStopRecording();
                Looper.myLooper().quit();
            } else if (i == 2) {
                textureMovieEncoder2.handleFrameAvailable();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFrameAvailable() {
        this.mVideoEncoder.drainEncoder(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStopRecording() {
        try {
            Log.d(TAG, "handleStopRecording");
            this.mVideoEncoder.drainEncoder(true);
            this.mVideoEncoder.release();
        } catch (IllegalStateException e) {
            Log.d(TAG, "mVideoEncoder exception: " + e.getMessage());
        }
    }
}
