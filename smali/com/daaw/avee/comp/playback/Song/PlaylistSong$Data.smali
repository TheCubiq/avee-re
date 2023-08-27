.class public Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
.super Ljava/lang/Object;
.source "PlaylistSong.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation


# static fields
.field private static final sArtworkUri:Landroid/net/Uri;


# instance fields
.field public albumArt:Ljava/lang/String;

.field public albumId:J

.field public albumName:Ljava/lang/String;

.field public artistId:J

.field public artistName:Ljava/lang/String;

.field public audioId:J

.field public cdNum:I

.field public final dataSource:Landroid/net/Uri;

.field public duration:I

.field public filePath:Ljava/lang/String;

.field public height:I

.field public isStream:Z

.field public sizeInBytes:J

.field public trackName:Ljava/lang/String;

.field public trackNum:I

.field public width:I

.field public year:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "content://media/external/audio/albumart"

    .line 477
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->sArtworkUri:Landroid/net/Uri;

    return-void
.end method

.method constructor <init>(Landroid/net/Uri;)V
    .locals 5

    .line 503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 504
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 506
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isStream:Z

    const-wide/16 v0, 0x0

    .line 507
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    const-string v2, ""

    .line 508
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    .line 509
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    .line 510
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J

    .line 511
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    const-wide/16 v3, -0x1

    .line 512
    iput-wide v3, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    .line 513
    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    .line 514
    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->width:I

    .line 515
    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->height:I

    .line 516
    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackNum:I

    .line 517
    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->cdNum:I

    .line 518
    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->year:I

    .line 519
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->sizeInBytes:J

    .line 520
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumArt:Ljava/lang/String;

    return-void
.end method

.method static isUrlStream(Landroid/net/Uri;)Z
    .locals 2

    .line 500
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p0

    const-string v0, "https"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 526
    instance-of v0, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 530
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public finish(Landroid/content/ContentResolver;)V
    .locals 8

    const-string v0, ""

    .line 599
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumArt:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 601
    sget-boolean v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->THUMB_FROM_RESOLVER:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 603
    :cond_0
    sget-object v2, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "_id"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "album_art"

    const/4 v4, 0x1

    aput-object v0, v3, v4

    new-array v5, v4, [Ljava/lang/String;

    iget-wide v6, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J

    .line 606
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v1

    const/4 v6, 0x0

    const-string v4, "_id=?"

    move-object v1, p1

    .line 603
    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 609
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 610
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumArt:Ljava/lang/String;

    :cond_1
    if-eqz p1, :cond_2

    .line 616
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_0
    return-void
.end method

.method public getAlbumArtGenerateStr()Ljava/lang/String;
    .locals 5

    .line 565
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnown()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    return-object v0

    .line 569
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_1

    .line 571
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    const-string v3, "_-_"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    :cond_1
    const/4 v3, 0x0

    const/16 v4, 0x20

    if-ge v0, v2, :cond_4

    .line 574
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 576
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    goto :goto_1

    .line 578
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    const-string v1, "__"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    :cond_4
    :goto_1
    if-ge v0, v2, :cond_5

    .line 583
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    return-object v0

    .line 586
    :cond_5
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_6

    add-int/lit8 v0, v0, -0x1

    .line 589
    :cond_6
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAlbumArtPath00Str()Ljava/lang/String;
    .locals 5

    .line 556
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 557
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://media/external/audio/media/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "/albumart"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAlbumArtPath0Str()Ljava/lang/String;
    .locals 2

    .line 546
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 548
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    .line 549
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath00Str()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getAlbumArtPath1Str()Ljava/lang/String;
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumArt:Ljava/lang/String;

    return-object v0
.end method

.method public getDurationSeconds()I
    .locals 1

    .line 594
    iget v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    div-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public isAlbumKnown()Z
    .locals 5

    .line 538
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isArtistKnown()Z
    .locals 5

    .line 534
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isArtistKnownOrSecondName()Z
    .locals 5

    .line 542
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    const-wide/16 v2, -0x2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
