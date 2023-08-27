.class Lcom/daaw/avee/Design/VisualizerDesign$12;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 431
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$12;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 439
    new-instance v9, Lcom/daaw/avee/Design/VisualizerDesign$12$1;

    move-object/from16 v2, p0

    invoke-direct {v9, v2, v0}, Lcom/daaw/avee/Design/VisualizerDesign$12$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$12;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;)V

    .line 462
    invoke-interface {v0, v9}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->setUserObject1(Ljava/lang/Object;)V

    .line 475
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    .line 481
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v19

    if-eqz v19, :cond_0

    const/4 v3, 0x0

    .line 483
    iget-object v4, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->videoThumbDataSource:Landroid/net/Uri;

    iget-object v5, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->path0:Ljava/lang/String;

    iget-object v6, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->path1:Ljava/lang/String;

    iget-object v7, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genStr:Ljava/lang/String;

    iget-boolean v8, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->fitCenter:Z

    iget v10, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->targetBoundsWidth:I

    iget v11, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->targetBoundsHeight:I

    iget v12, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genBoundsWidth:I

    iget v13, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genBoundsHeight:I

    iget v14, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genHint:I

    iget v15, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genHint2:I

    const/16 v16, 0x0

    iget-object v1, v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->imageColorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-object/from16 v17, v1

    .line 498
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    move-object/from16 v2, v19

    .line 483
    invoke-interface/range {v2 .. v18}, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;->loadAlbumArtLarge(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 431
    check-cast p1, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    check-cast p2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign$12;->invoke(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V

    return-void
.end method
