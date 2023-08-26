.class public Lcom/daaw/avee/comp/AlbumArt/AlbumArtCoreEmpty;
.super Ljava/lang/Object;
.source "AlbumArtCoreEmpty.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;


# static fields
.field public static Instance:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCoreEmpty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCoreEmpty;

    invoke-direct {v0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCoreEmpty;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCoreEmpty;->Instance:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCoreEmpty;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelRequest(Landroid/widget/ImageView;)V
    .locals 0

    return-void
.end method

.method public loadAlbumArt(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;ZZZ)V
    .locals 0

    return-void
.end method

.method public loadAlbumArtLarge(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
