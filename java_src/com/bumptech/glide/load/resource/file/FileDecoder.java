package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
/* loaded from: classes.dex */
public class FileDecoder implements ResourceDecoder<File, File> {
    @Override // com.bumptech.glide.load.ResourceDecoder
    public String getId() {
        return "";
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<File> decode(File file, int i, int i2) {
        return new FileResource(file);
    }
}
