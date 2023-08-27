.class final Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;
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
.field final synthetic val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

.field final synthetic val$buffTmp2:Lcom/daaw/avee/Common/Ref;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)V
    .locals 0

    .line 1033
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;->val$buffTmp2:Lcom/daaw/avee/Common/Ref;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()V
    .locals 2

    .line 1036
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;->val$buffTmp2:Lcom/daaw/avee/Common/Ref;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    .line 1037
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iget-object v0, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iget-object v0, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1038
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iput-object v1, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    return-void
.end method
