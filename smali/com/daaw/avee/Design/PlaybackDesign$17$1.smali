.class Lcom/daaw/avee/Design/PlaybackDesign$17$1;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign$17;->invoke(Landroid/content/Context;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/PlaybackDesign$17;

.field final synthetic val$albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

.field final synthetic val$finalTargetH:Ljava/lang/Integer;

.field final synthetic val$finalTargetW:Ljava/lang/Integer;

.field final synthetic val$imageLoadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign$17;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->this$1:Lcom/daaw/avee/Design/PlaybackDesign$17;

    iput-object p2, p0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iput-object p3, p0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$imageLoadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iput-object p4, p0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$finalTargetW:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$finalTargetH:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    move-object/from16 v0, p0

    .line 276
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 278
    iget-object v3, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v3, v3, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    iget-object v4, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v4, v4, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    iget-object v5, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v5, v5, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    iget-object v6, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v6, v6, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    const/4 v7, 0x1

    iget-object v8, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$imageLoadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    iget-object v9, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$finalTargetW:Ljava/lang/Integer;

    .line 285
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v10, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$finalTargetH:Ljava/lang/Integer;

    .line 286
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v11, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$finalTargetW:Ljava/lang/Integer;

    .line 287
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v12, v0, Lcom/daaw/avee/Design/PlaybackDesign$17$1;->val$finalTargetH:Ljava/lang/Integer;

    .line 288
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 278
    invoke-interface/range {v1 .. v17}, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;->loadAlbumArtLarge(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
