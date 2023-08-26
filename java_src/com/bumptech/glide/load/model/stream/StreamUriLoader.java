package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.UriLoader;
import java.io.InputStream;
/* loaded from: classes.dex */
public class StreamUriLoader extends UriLoader<InputStream> implements StreamModelLoader<Uri> {

    /* loaded from: classes.dex */
    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<Uri, InputStream> build(Context context, GenericLoaderFactory genericLoaderFactory) {
            return new StreamUriLoader(context, genericLoaderFactory.buildModelLoader(GlideUrl.class, InputStream.class));
        }
    }

    public StreamUriLoader(Context context) {
        this(context, Glide.buildStreamModelLoader(GlideUrl.class, context));
    }

    public StreamUriLoader(Context context, ModelLoader<GlideUrl, InputStream> modelLoader) {
        super(context, modelLoader);
    }

    @Override // com.bumptech.glide.load.model.UriLoader
    protected DataFetcher<InputStream> getLocalUriFetcher(Context context, Uri uri) {
        return new StreamLocalUriFetcher(context, uri);
    }

    @Override // com.bumptech.glide.load.model.UriLoader
    protected DataFetcher<InputStream> getAssetPathFetcher(Context context, String str) {
        return new StreamAssetPathFetcher(context.getApplicationContext().getAssets(), str);
    }
}
