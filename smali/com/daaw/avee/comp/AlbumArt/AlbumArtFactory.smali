.class public Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;
.super Ljava/lang/Object;
.source "AlbumArtFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createInstance(Landroid/content/Context;)Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;
    .locals 0

    .line 17
    invoke-static {p0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->createInstance(Landroid/content/Context;)Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;
    .locals 1

    .line 12
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v0

    return-object v0
.end method
