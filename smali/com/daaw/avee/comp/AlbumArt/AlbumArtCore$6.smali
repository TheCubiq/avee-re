.class final Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$6;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onGlideDrawableResult(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/gifdecoder/GifDecoder;)V
    .locals 0

    .line 1067
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$6;->val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()V
    .locals 1

    .line 1070
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$6;->val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

    invoke-virtual {v0}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->resetFrameIndex()V

    return-void
.end method
