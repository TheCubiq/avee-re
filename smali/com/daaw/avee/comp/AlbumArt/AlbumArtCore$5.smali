.class final Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$5;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onGlideDrawableResult(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/gifdecoder/GifDecoder;)V
    .locals 0

    .line 1062
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$5;->val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Ljava/lang/Integer;
    .locals 1

    .line 1065
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$5;->val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

    invoke-virtual {v0}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->getFrameCount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 1062
    invoke-virtual {p0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$5;->onInvoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
