.class public Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
.super Ljava/lang/Object;
.source "AlbumArtRequest.java"


# static fields
.field public static final HINT_FORCE_GEN:I = 0x4

.field public static final HINT_NO_TEXT:I = 0x2

.field public static final HINT_SHIFT_HUE:I = 0x1


# instance fields
.field public final genStr:Ljava/lang/String;

.field public final path0:Ljava/lang/String;

.field public final path1:Ljava/lang/String;

.field public final videoThumbDataSource:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    .line 22
    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    .line 23
    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    .line 24
    iput-object p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    return-void
.end method
