package com.daaw.avee.comp.Visualizer.Graphic;

import android.opengl.Matrix;
/* loaded from: classes.dex */
public class VMatrix {
    private float[] matrix = new float[16];

    public void setIdentity() {
        Matrix.setIdentityM(this.matrix, 0);
    }

    public void translate(float f, float f2, float f3) {
        Matrix.translateM(this.matrix, 0, f, f2, f3);
    }

    public void rotateZDeg(float f) {
        Matrix.rotateM(this.matrix, 0, f, 0.0f, 0.0f, 1.0f);
    }

    public void multiply(VMatrix vMatrix, VMatrix vMatrix2) {
        Matrix.multiplyMM(getObj(), 0, vMatrix.getObj(), 0, vMatrix2.getObj(), 0);
    }

    public static void multiply(float[] fArr, VMatrix vMatrix, float[] fArr2) {
        Matrix.multiplyMV(fArr, 0, vMatrix.getObj(), 0, fArr2, 0);
    }

    public static void multiplyNormalizeW(float[] fArr, VMatrix vMatrix, float[] fArr2) {
        Matrix.multiplyMV(fArr, 0, vMatrix.getObj(), 0, fArr2, 0);
        fArr[0] = fArr[0] / fArr[3];
        fArr[1] = fArr[1] / fArr[3];
        fArr[2] = fArr[2] / fArr[3];
    }

    public float[] getObj() {
        return this.matrix;
    }
}
