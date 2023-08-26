package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.engine.Resource;
/* loaded from: classes.dex */
public interface ResourceTranscoder<Z, R> {
    String getId();

    Resource<R> transcode(Resource<Z> resource);
}
