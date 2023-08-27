.class public Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;
.super Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
.source "AlbumArtRequest2.java"


# instance fields
.field public final fitCenter:Z

.field public final genBoundsHeight:I

.field public final genBoundsWidth:I

.field public final genHint:I

.field public final genHint2:I

.field public final imageColorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

.field public final targetBoundsHeight:I

.field public final targetBoundsWidth:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIIIILcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iput-boolean p5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->fitCenter:Z

    .line 30
    iput p6, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->targetBoundsWidth:I

    .line 31
    iput p7, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->targetBoundsHeight:I

    .line 32
    iput p8, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genBoundsWidth:I

    .line 33
    iput p9, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genBoundsHeight:I

    .line 34
    iput p10, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genHint:I

    .line 35
    iput p11, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->genHint2:I

    .line 36
    iput-object p12, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;->imageColorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    return-void
.end method
