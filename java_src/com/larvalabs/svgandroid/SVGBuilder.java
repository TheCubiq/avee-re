package com.larvalabs.svgandroid;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.util.Log;
import com.larvalabs.svgandroid.SVGParser;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.xml.sax.InputSource;
/* loaded from: classes2.dex */
public class SVGBuilder {
    private InputStream data;
    private Integer searchColor = null;
    private Integer replaceColor = null;
    private ColorFilter strokeColorFilter = null;
    private ColorFilter fillColorFilter = null;
    private boolean whiteMode = false;
    private boolean overideOpacity = false;
    private boolean closeInputStream = true;

    public SVGBuilder readFromInputStream(InputStream inputStream) {
        this.data = inputStream;
        return this;
    }

    public SVGBuilder readFromString(String str) {
        this.data = new ByteArrayInputStream(str.getBytes());
        return this;
    }

    public SVGBuilder readFromResource(Resources resources, int i) {
        this.data = resources.openRawResource(i);
        return this;
    }

    public SVGBuilder readFromAsset(AssetManager assetManager, String str) throws IOException {
        this.data = assetManager.open(str);
        return this;
    }

    public SVGBuilder clearColorSwap() {
        this.replaceColor = null;
        this.searchColor = null;
        return this;
    }

    public SVGBuilder setColorSwap(int i, int i2) {
        return setColorSwap(i, i2, false);
    }

    public SVGBuilder setColorSwap(int i, int i2, boolean z) {
        this.searchColor = Integer.valueOf(i);
        this.replaceColor = Integer.valueOf(i2);
        this.overideOpacity = z;
        return this;
    }

    public SVGBuilder setWhiteMode(boolean z) {
        this.whiteMode = z;
        return this;
    }

    public SVGBuilder setColorFilter(ColorFilter colorFilter) {
        this.fillColorFilter = colorFilter;
        this.strokeColorFilter = colorFilter;
        return this;
    }

    public SVGBuilder setStrokeColorFilter(ColorFilter colorFilter) {
        this.strokeColorFilter = colorFilter;
        return this;
    }

    public SVGBuilder setFillColorFilter(ColorFilter colorFilter) {
        this.fillColorFilter = colorFilter;
        return this;
    }

    public SVGBuilder setCloseInputStreamWhenDone(boolean z) {
        this.closeInputStream = z;
        return this;
    }

    public SVG build() throws SVGParseException {
        if (this.data == null) {
            throw new IllegalStateException("SVG input not specified. Call one of the readFrom...() methods first.");
        }
        try {
            SVGParser.SVGHandler sVGHandler = new SVGParser.SVGHandler();
            sVGHandler.setColorSwap(this.searchColor, this.replaceColor, this.overideOpacity);
            sVGHandler.setWhiteMode(this.whiteMode);
            if (this.strokeColorFilter != null) {
                sVGHandler.strokePaint.setColorFilter(this.strokeColorFilter);
            }
            if (this.fillColorFilter != null) {
                sVGHandler.fillPaint.setColorFilter(this.fillColorFilter);
            }
            if (!this.data.markSupported()) {
                this.data = new BufferedInputStream(this.data);
            }
            try {
                this.data.mark(4);
                byte[] bArr = new byte[2];
                int read = this.data.read(bArr, 0, 2);
                int i = 65535 & (bArr[0] + (bArr[1] << 8));
                this.data.reset();
                if (read == 2 && i == 35615) {
                    this.data = new GZIPInputStream(this.data);
                }
                return SVGParser.parse(new InputSource(this.data), sVGHandler);
            } catch (IOException e) {
                throw new SVGParseException(e);
            }
        } finally {
            if (this.closeInputStream) {
                try {
                    this.data.close();
                } catch (IOException e2) {
                    Log.e("SVGAndroid", "Error closing SVG input stream.", e2);
                }
            }
        }
    }
}
