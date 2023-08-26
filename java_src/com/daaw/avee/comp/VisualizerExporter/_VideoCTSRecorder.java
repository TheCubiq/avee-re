package com.daaw.avee.comp.VisualizerExporter;

import android.graphics.Rect;
import android.media.cts.InputSurface;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.android.grafika.TextureMovieEncoder2;
import com.android.grafika.VideoEncoderCore;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Graphic.FullscreenQuad;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import mdesl.graphics.Texture;
/* loaded from: classes.dex */
public class _VideoCTSRecorder {
    private VideoEncoderCore encoderCore;
    private FullscreenQuad fullQuad;
    private InputSurface inputSurface;
    private File mOutputFile;
    private TextureMovieEncoder2 mVideoEncoder;
    private int outHeight;
    private int outWidth;
    private int frameRate = 30;
    private Rect mVideoRect = new Rect();

    public static String getOutputFileExtensionWithDot() {
        return ".mp4";
    }

    public static String getOutputFileMimeType() {
        return MimeTypes.VIDEO_MP4;
    }

    public static int getCompatibleVideoWidth(int i) {
        return roundUp16(i);
    }

    public static int getCompatibleVideoHeight(int i) {
        return roundUp16(i);
    }

    private static int roundUp16(int i) {
        int i2 = i % 16;
        return i2 == 0 ? i : (16 - i2) + i;
    }

    private static int roundDown16(int i) {
        return i - (i % 16);
    }

    public String initialize(File file, int i, int i2, int i3, float f) {
        this.mOutputFile = file;
        return startEncoder(i2, i3, f, i, 5);
    }

    public void release() {
        this.fullQuad = null;
    }

    public int getScreenWidth() {
        return this.mVideoRect.width();
    }

    public int getScreenHeight() {
        return this.mVideoRect.height();
    }

    private static long computePresentationTime(long j, int i) {
        return (j * 1000000) / i;
    }

    public boolean addFrameImageOGL(Texture texture, long j, int i) {
        if (this.encoderCore == null || this.mVideoEncoder == null) {
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
        if (this.inputSurface == null) {
            try {
                this.inputSurface = new InputSurface(this.encoderCore.getInputSurface(), eglGetCurrentContext);
            } catch (Exception unused) {
                return false;
            }
        }
        this.inputSurface.makeCurrent();
        if (this.fullQuad == null) {
            this.fullQuad = new FullscreenQuad();
        }
        GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        this.mVideoRect.set(0, 0, texture.getWidth(), texture.getHeight());
        GLES20.glViewport(this.mVideoRect.left, this.mVideoRect.top, this.mVideoRect.width(), this.mVideoRect.height());
        texture.bind();
        this.fullQuad.draw();
        this.inputSurface.setPresentationTime(computePresentationTime(i, this.frameRate) * 1000);
        this.inputSurface.swapBuffers();
        if (EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface2, eglGetCurrentSurface, eglGetCurrentContext)) {
            return true;
        }
        tlog.w("EGL14.eglMakeCurrent failed");
        return false;
    }

    private String startEncoder(int i, int i2, float f, int i3, int i4) {
        if (f < 0.0f) {
            f = 4.0f;
        }
        int i5 = i3 < 0 ? 30 : i3;
        int i6 = i4 < 0 ? 5 : i4;
        this.frameRate = i5;
        this.outWidth = getCompatibleVideoWidth(i);
        this.outHeight = getCompatibleVideoHeight(i2);
        tlog.d("starting to record " + this.outWidth + "x" + this.outHeight);
        try {
            VideoEncoderCore videoEncoderCore = new VideoEncoderCore(this.outWidth, this.outHeight, (int) (f * 1000000.0f), this.mOutputFile, i5, i6);
            this.encoderCore = videoEncoderCore;
            try {
                this.mVideoEncoder = new TextureMovieEncoder2(videoEncoderCore);
                return null;
            } catch (Exception e) {
                return "" + e.getMessage();
            }
        } catch (Exception e2) {
            return "" + e2.getMessage();
        }
    }

    private void stopEncoder() {
        if (this.mVideoEncoder != null) {
            tlog.d("stopping recorder, mVideoEncoder=" + this.mVideoEncoder);
            this.mVideoEncoder.stopRecording();
            this.mVideoEncoder = null;
        }
        InputSurface inputSurface = this.inputSurface;
        if (inputSurface != null) {
            inputSurface.release();
            this.inputSurface = null;
        }
    }

    public boolean stop() {
        if (this.mVideoEncoder != null) {
            tlog.d("stopping recorder, mVideoEncoder=" + this.mVideoEncoder);
            this.mVideoEncoder.stopRecording();
            return true;
        }
        return true;
    }

    public boolean finish() {
        this.mVideoEncoder = null;
        InputSurface inputSurface = this.inputSurface;
        if (inputSurface != null) {
            inputSurface.release();
            this.inputSurface = null;
            return true;
        }
        return true;
    }

    public void frameAvailableSoon() {
        TextureMovieEncoder2 textureMovieEncoder2 = this.mVideoEncoder;
        if (textureMovieEncoder2 != null) {
            textureMovieEncoder2.frameAvailableSoon();
        }
    }
}
