package com.daaw.avee.comp.VisualizerExporter;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaRecorder;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.android.grafika.gles.EglCore;
import com.android.grafika.gles.WindowSurface;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Graphic.FullscreenQuad;
import java.io.File;
import java.io.IOException;
import mdesl.graphics.Texture;
/* loaded from: classes.dex */
public class _VideoMediaRecorder {
    private FullscreenQuad fullQuad;
    private EglCore mEglCore;
    private WindowSurface mInputWindowSurface;
    private int outHeight;
    private int outWidth;
    MediaRecorder recorder;
    private Rect mVideoRect = new Rect();
    SurfaceTexture surfaceTexture = new SurfaceTexture(342);

    public boolean addFrameImageOGL(Bitmap bitmap, int i) {
        return true;
    }

    public void frameAvailableSoon() {
    }

    public _VideoMediaRecorder() {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.recorder = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        this.recorder.setAudioSource(1);
    }

    public String initialize(File file, int i, int i2, int i3, float f) {
        this.recorder.setOutputFormat(2);
        this.recorder.setVideoSize(i2, i3);
        this.recorder.setVideoFrameRate(i);
        this.recorder.setVideoEncoder(0);
        this.recorder.setVideoEncodingBitRate(512000);
        this.recorder.setAudioChannels(2);
        this.recorder.setAudioSamplingRate(22000);
        this.recorder.setAudioEncoder(0);
        this.recorder.setAudioEncodingBitRate(8000);
        this.recorder.setOutputFile(file.getPath());
        try {
            this.recorder.prepare();
            this.recorder.start();
            this.outWidth = i2;
            this.outHeight = i3;
            return null;
        } catch (IOException e) {
            return "" + e.getMessage();
        }
    }

    public void release() {
        this.fullQuad = null;
        EglCore eglCore = this.mEglCore;
        if (eglCore != null) {
            eglCore.release();
        }
        this.mEglCore = null;
    }

    public boolean addFrameImageOGL(Texture texture, long j) {
        if (this.recorder == null) {
            return false;
        }
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext == null) {
            tlog.w("oldEGLContext is null");
            return false;
        }
        if (this.mEglCore == null) {
            EglCore eglCore = new EglCore(eglGetCurrentContext, 3);
            this.mEglCore = eglCore;
            this.mInputWindowSurface = new WindowSurface(eglCore, this.recorder.getSurface(), true);
        }
        long j2 = j * 1000;
        this.mInputWindowSurface.makeCurrent();
        if (this.fullQuad == null) {
            this.fullQuad = new FullscreenQuad();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        this.mInputWindowSurface.setPresentationTime(j2);
        this.mInputWindowSurface.swapBuffers();
        if (EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface2, eglGetCurrentSurface, eglGetCurrentContext)) {
            return true;
        }
        tlog.w("EGL14.eglMakeCurrent failed");
        return false;
    }

    public void stop() {
        try {
            this.recorder.stop();
        } catch (Exception e) {
            tlog.w("recorder.stop failed: " + e.getMessage());
        }
    }

    public void finish() {
        this.recorder.reset();
        this.recorder.release();
    }
}
