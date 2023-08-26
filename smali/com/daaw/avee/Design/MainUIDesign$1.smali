.class Lcom/daaw/avee/Design/MainUIDesign$1;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/MainUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
        "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$1;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 18

    move-object/from16 v0, p1

    .line 47
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 49
    iget-object v3, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    iget-object v4, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    iget-object v5, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    iget-object v6, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    const/4 v7, 0x1

    .line 56
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 57
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 58
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 59
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v8, p2

    .line 49
    invoke-interface/range {v1 .. v17}, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;->loadAlbumArtLarge(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 44
    check-cast p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    check-cast p2, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/MainUIDesign$1;->invoke(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
