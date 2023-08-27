package com.daaw.avee.comp.Visualizer.Graphic;

import android.opengl.GLES20;
import com.daaw.avee.Common.DbgVar;
import com.daaw.avee.Common.Func.Func;
import mdesl.graphics.glutils.ShaderProgram;
import org.lwjgl.LWJGLException;
/* loaded from: classes.dex */
public class VShaderProgram extends ShaderProgram {
    private DbgVar dbgVar;

    public VShaderProgram(String str, String str2) throws LWJGLException {
        super(str, str2);
        this.dbgVar = new DbgVar();
    }

    public void setUniformMatrix(String str, boolean z, float[] fArr) {
        setUniformMatrix(getUniformLocation(str), z, fArr);
    }

    public void setUniformMatrix(int i, boolean z, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, z, fArr, 0);
    }

    public void setUniformMatrix3(String str, boolean z, float[] fArr) {
        setUniformMatrix3(getUniformLocation(str), z, fArr);
    }

    public void setUniformMatrix3(int i, boolean z, float[] fArr) {
        GLES20.glUniformMatrix3fv(i, 1, z, fArr, 0);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.dbgVar.assertDisposed(new Func() { // from class: com.daaw.avee.comp.Visualizer.Graphic.-$$Lambda$VShaderProgram$HFi9CB3qwQ5KvGvlgxPXDuw6--s
            @Override // com.daaw.avee.Common.Func.Func
            public final Object onInvoke() {
                return VShaderProgram.this.lambda$finalize$0$VShaderProgram();
            }
        });
    }

    public /* synthetic */ Boolean lambda$finalize$0$VShaderProgram() {
        return Boolean.valueOf(this.program == 0);
    }
}
