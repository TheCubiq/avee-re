.class final Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;
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

.field final synthetic val$lock:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)V
    .locals 0

    .line 1088
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$lock:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$buffTmp2:Lcom/daaw/avee/Common/Ref;

    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()V
    .locals 3

    .line 1091
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$lock:Ljava/lang/Object;

    monitor-enter v0

    .line 1092
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$buffTmp2:Lcom/daaw/avee/Common/Ref;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    .line 1093
    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iget-object v1, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iget-object v1, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1094
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iput-object v2, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    .line 1095
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
