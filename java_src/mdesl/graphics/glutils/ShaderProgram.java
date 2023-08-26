package mdesl.graphics.glutils;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.LWJGLException;
/* loaded from: classes2.dex */
public class ShaderProgram {
    public static final int FRAGMENT_SHADER = 35632;
    public static final int VERTEX_SHADER = 35633;
    private static FloatBuffer fbuf16 = null;
    private static IntBuffer ibuf4 = null;
    private static boolean strict = false;
    protected Attrib[] attributes;
    protected int frag;
    protected String fragShaderSource;
    protected String log;
    protected int program;
    protected HashMap<String, Integer> uniforms;
    protected int vert;
    protected String vertShaderSource;

    public static boolean isSupported() {
        return true;
    }

    private String shaderTypeString(int i) {
        return i == 35632 ? "FRAGMENT_SHADER" : i == 35633 ? "VERTEX_SHADER" : "shader";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class Attrib {
        String name = null;
        int location = -1;

        protected Attrib() {
        }
    }

    public static void setStrictMode(boolean z) {
        strict = z;
    }

    public static boolean isStrictMode() {
        return strict;
    }

    public ShaderProgram(String str, String str2, List<VertexAttrib> list) throws LWJGLException {
        this.log = "";
        this.uniforms = new HashMap<>();
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("shader source must be non-null");
        }
        if (!isSupported()) {
            throw new LWJGLException("no shader support found; shaders require OpenGL 2.0");
        }
        this.vertShaderSource = str;
        this.fragShaderSource = str2;
        this.vert = compileShader(VERTEX_SHADER, str);
        this.frag = compileShader(FRAGMENT_SHADER, str2);
        this.program = createProgram();
        try {
            linkProgram(list);
        } catch (LWJGLException e) {
            dispose();
            throw e;
        }
    }

    public ShaderProgram(String str, String str2) throws LWJGLException {
        this(str, str2, null);
    }

    protected ShaderProgram() {
        this.log = "";
        this.uniforms = new HashMap<>();
    }

    protected int createProgram() throws LWJGLException {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            return glCreateProgram;
        }
        throw new LWJGLException("could not create program; check ShaderProgram.isSupported()");
    }

    protected int compileShader(int i, String str) throws LWJGLException {
        String str2;
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw new LWJGLException("could not create shader obj; check ShaderProgram.isSupported()");
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        int i2 = iArr[0];
        String shaderTypeString = shaderTypeString(i);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        if (glGetShaderInfoLog != null && glGetShaderInfoLog.length() != 0) {
            this.log += shaderTypeString + " compile log:\n" + glGetShaderInfoLog + "\n";
        }
        if (i2 == 0) {
            if (this.log.length() != 0) {
                str2 = this.log;
            } else {
                str2 = "Could not compile " + shaderTypeString(i);
            }
            throw new LWJGLException(str2);
        }
        return glCreateShader;
    }

    protected void attachShaders() {
        GLES20.glAttachShader(getID(), this.vert);
        GLES20.glAttachShader(getID(), this.frag);
    }

    protected void linkProgram(List<VertexAttrib> list) throws LWJGLException {
        if (!valid()) {
            throw new LWJGLException("trying to link an invalid (i.e. released) program");
        }
        this.uniforms.clear();
        if (list != null) {
            for (VertexAttrib vertexAttrib : list) {
                if (vertexAttrib != null) {
                    GLES20.glBindAttribLocation(this.program, vertexAttrib.location, vertexAttrib.name);
                }
            }
        }
        attachShaders();
        GLES20.glLinkProgram(this.program);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        int i = iArr[0];
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.program);
        if (glGetProgramInfoLog != null && glGetProgramInfoLog.length() != 0) {
            this.log = glGetProgramInfoLog + "\n" + this.log;
        }
        String str = this.log;
        if (str != null) {
            this.log = str.trim();
        }
        if (i == 0) {
            throw new LWJGLException(this.log.length() != 0 ? this.log : "Could not link program");
        }
        fetchUniforms();
        fetchAttributes();
    }

    public String getLog() {
        return this.log;
    }

    public void use() {
        if (!valid()) {
            throw new IllegalStateException("trying to enable a program that is not valid");
        }
        GLES20.glUseProgram(this.program);
    }

    public void disposeShaders() {
        if (this.vert != 0) {
            GLES20.glDetachShader(getID(), this.vert);
            GLES20.glDeleteShader(this.vert);
            this.vert = 0;
        }
        if (this.frag != 0) {
            GLES20.glDetachShader(getID(), this.frag);
            GLES20.glDeleteShader(this.frag);
            this.frag = 0;
        }
    }

    public void dispose() {
        if (this.program != 0) {
            disposeShaders();
            GLES20.glDeleteProgram(this.program);
            this.program = 0;
        }
    }

    public int getVertexShaderID() {
        return this.vert;
    }

    public int getFragmentShaderID() {
        return this.frag;
    }

    public String getVertexShaderSource() {
        return this.vertShaderSource;
    }

    public String getFragmentShaderSource() {
        return this.fragShaderSource;
    }

    public int getID() {
        return this.program;
    }

    public boolean valid() {
        return this.program != 0;
    }

    private void fetchUniforms() {
        byte[] bArr;
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.program, 35718, iArr, 0);
        int i = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2;
            byte[] bArr3 = bArr2;
            int[] iArr5 = iArr3;
            GLES20.glGetActiveUniform(this.program, i2, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr3, 0);
            int i4 = iArr2[0];
            if (i4 == 0) {
                while (true) {
                    bArr = bArr3;
                    if (i4 >= 64 || bArr[i4] == 0) {
                        break;
                    }
                    i4++;
                    bArr3 = bArr;
                }
            } else {
                bArr = bArr3;
            }
            String str = new String(bArr, 0, i4);
            if (str.contains(" ")) {
                str = str.substring(0, str.indexOf(" "));
            }
            this.uniforms.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.program, str)));
            i2 = i3 + 1;
            bArr2 = bArr;
            iArr3 = iArr5;
        }
    }

    private void fetchAttributes() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.program, 35721, iArr, 0);
        int i = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr = new byte[64];
        this.attributes = new Attrib[i];
        int i2 = 0;
        while (i2 < i) {
            Attrib attrib = new Attrib();
            int i3 = i2;
            byte[] bArr2 = bArr;
            GLES20.glGetActiveAttrib(this.program, i2, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr, 0);
            attrib.name = new String(bArr2, 0, iArr2[0]);
            attrib.location = GLES20.glGetAttribLocation(this.program, attrib.name);
            this.attributes[i3] = attrib;
            i2 = i3 + 1;
            bArr = bArr2;
            iArr3 = iArr3;
        }
    }

    public int getUniformLocation(String str) {
        int intValue;
        Integer num = this.uniforms.get(str);
        if (num == null) {
            intValue = GLES20.glGetUniformLocation(this.program, str);
            this.uniforms.put(str, Integer.valueOf(intValue));
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 && strict) {
            throw new IllegalArgumentException("no active uniform by name '" + str + "' (disable strict compiling to suppress warnings)");
        }
        return intValue;
    }

    Attrib attrib(String str) {
        int i = 0;
        while (true) {
            Attrib[] attribArr = this.attributes;
            if (i < attribArr.length) {
                if (str.equals(attribArr[i].name)) {
                    return this.attributes[i];
                }
                i++;
            } else if (strict) {
                throw new IllegalArgumentException("no active attribute by name '" + str + "' (disable strict compiling to suppress warnings)");
            } else {
                return null;
            }
        }
    }

    public int getAttributeLocation(String str) {
        Attrib attrib = attrib(str);
        if (attrib != null) {
            return attrib.location;
        }
        return -1;
    }

    public String[] getAttributeNames() {
        String[] strArr = new String[this.attributes.length];
        int i = 0;
        while (true) {
            Attrib[] attribArr = this.attributes;
            if (i >= attribArr.length) {
                return strArr;
            }
            strArr[i] = attribArr[i].name;
            i++;
        }
    }

    public String[] getUniformNames() {
        return (String[]) this.uniforms.keySet().toArray(new String[this.uniforms.size()]);
    }

    public boolean hasUniform(String str) {
        return this.uniforms.containsKey(str);
    }

    public boolean hasAttribute(String str) {
        int i = 0;
        while (true) {
            Attrib[] attribArr = this.attributes;
            if (i >= attribArr.length) {
                return false;
            }
            if (str.equals(attribArr[i].name)) {
                return true;
            }
            i++;
        }
    }

    private FloatBuffer uniformf(int i) {
        if (fbuf16 == null) {
            fbuf16 = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        fbuf16.clear();
        if (i == -1) {
            return fbuf16;
        }
        getUniform(i, fbuf16);
        return fbuf16;
    }

    private IntBuffer uniformi(int i) {
        if (ibuf4 == null) {
            ibuf4 = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asIntBuffer();
        }
        ibuf4.clear();
        if (i == -1) {
            return ibuf4;
        }
        getUniform(i, ibuf4);
        return ibuf4;
    }

    public void getUniform(int i, FloatBuffer floatBuffer) {
        GLES20.glGetUniformfv(this.program, i, floatBuffer);
    }

    public void getUniform(int i, IntBuffer intBuffer) {
        GLES20.glGetUniformiv(this.program, i, intBuffer);
    }

    public boolean getUniform(String str, FloatBuffer floatBuffer) {
        int uniformLocation = getUniformLocation(str);
        if (uniformLocation == -1) {
            return false;
        }
        getUniform(uniformLocation, floatBuffer);
        return true;
    }

    public boolean getUniform(String str, IntBuffer intBuffer) {
        int uniformLocation = getUniformLocation(str);
        if (uniformLocation == -1) {
            return false;
        }
        getUniform(uniformLocation, intBuffer);
        return true;
    }

    public int getUniform1i(int i) {
        return uniformi(i).get(0);
    }

    public int getUniform1i(String str) {
        return getUniform1i(getUniformLocation(str));
    }

    public int[] getUniform2i(int i) {
        IntBuffer uniformi = uniformi(i);
        return new int[]{uniformi.get(0), uniformi.get(1)};
    }

    public int[] getUniform2i(String str) {
        return getUniform2i(getUniformLocation(str));
    }

    public int[] getUniform3i(int i) {
        IntBuffer uniformi = uniformi(i);
        return new int[]{uniformi.get(0), uniformi.get(1), uniformi.get(2)};
    }

    public int[] getUniform3i(String str) {
        return getUniform3i(getUniformLocation(str));
    }

    public int[] getUniform4i(int i) {
        IntBuffer uniformi = uniformi(i);
        return new int[]{uniformi.get(0), uniformi.get(1), uniformi.get(2), uniformi.get(3)};
    }

    public int[] getUniform4i(String str) {
        return getUniform4i(getUniformLocation(str));
    }

    public float getUniform1f(int i) {
        return uniformf(i).get(0);
    }

    public float getUniform1f(String str) {
        return getUniform1f(getUniformLocation(str));
    }

    public float[] getUniform2f(int i) {
        FloatBuffer uniformf = uniformf(i);
        return new float[]{uniformf.get(0), uniformf.get(1)};
    }

    public float[] getUniform2f(String str) {
        return getUniform2f(getUniformLocation(str));
    }

    public float[] getUniform3f(int i) {
        FloatBuffer uniformf = uniformf(i);
        return new float[]{uniformf.get(0), uniformf.get(1), uniformf.get(2)};
    }

    public float[] getUniform3f(String str) {
        return getUniform3f(getUniformLocation(str));
    }

    public float[] getUniform4f(int i) {
        FloatBuffer uniformf = uniformf(i);
        return new float[]{uniformf.get(0), uniformf.get(1), uniformf.get(2), uniformf.get(3)};
    }

    public float[] getUniform4f(String str) {
        return getUniform4f(getUniformLocation(str));
    }

    public void setUniformf(int i, float f) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform1f(i, f);
    }

    public void setUniformf(int i, float f, float f2) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform2f(i, f, f2);
    }

    public void setUniformf(int i, float f, float f2, float f3) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform3f(i, f, f2, f3);
    }

    public void setUniformf(int i, float f, float f2, float f3, float f4) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform4f(i, f, f2, f3, f4);
    }

    public void setUniformi(int i, int i2) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform1i(i, i2);
    }

    public void setUniformi(int i, int i2, int i3) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform2i(i, i2, i3);
    }

    public void setUniformi(int i, int i2, int i3, int i4) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform3i(i, i2, i3, i4);
    }

    public void setUniformi(int i, int i2, int i3, int i4, int i5) {
        if (i == -1) {
            return;
        }
        GLES20.glUniform4i(i, i2, i3, i4, i5);
    }

    public void setUniformf(String str, float f) {
        setUniformf(getUniformLocation(str), f);
    }

    public void setUniformf(String str, float f, float f2) {
        setUniformf(getUniformLocation(str), f, f2);
    }

    public void setUniformf(String str, float f, float f2, float f3) {
        setUniformf(getUniformLocation(str), f, f2, f3);
    }

    public void setUniformf(String str, float f, float f2, float f3, float f4) {
        setUniformf(getUniformLocation(str), f, f2, f3, f4);
    }

    public void setUniformi(String str, int i) {
        setUniformi(getUniformLocation(str), i);
    }

    public void setUniformi(String str, int i, int i2) {
        setUniformi(getUniformLocation(str), i, i2);
    }

    public void setUniformi(String str, int i, int i2, int i3) {
        setUniformi(getUniformLocation(str), i, i2, i3);
    }

    public void setUniformi(String str, int i, int i2, int i3, int i4) {
        setUniformi(getUniformLocation(str), i, i2, i3, i4);
    }
}
