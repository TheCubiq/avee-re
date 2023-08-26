package com.bumptech.glide.request;

import com.bumptech.glide.request.target.Target;
/* loaded from: classes.dex */
public interface RequestListener<T, R> {
    boolean onException(Exception exc, T t, Target<R> target, boolean z);

    boolean onResourceReady(R r, T t, Target<R> target, boolean z, boolean z2);
}
