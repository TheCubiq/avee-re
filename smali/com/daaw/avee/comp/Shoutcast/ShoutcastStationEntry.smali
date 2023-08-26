.class public Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;
.super Lcom/daaw/avee/comp/IceCast/StationEntry;
.source "ShoutcastStationEntry.java"


# instance fields
.field private currentTrack:Ljava/lang/String;

.field private tuneinDataReference:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/IceCast/StationEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    const-string p5, ""

    .line 17
    :goto_0
    iput-object p5, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->currentTrack:Ljava/lang/String;

    .line 18
    iput-object p6, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->tuneinDataReference:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public albumName()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public artistName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->genre:Ljava/lang/String;

    return-object v0
.end method

.method public duration()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getAlbumArtGenerateStr()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getAlbumArtPath0Str()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getAlbumArtPath1Str()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getShoutcastBase()Ljava/lang/String;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->tuneinDataReference:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getShoutcastId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoThumbDataSourceAsStr()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public isAlbumKnown()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isArtistKnownOrSecondName()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isStream()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public trackName()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->name:Ljava/lang/String;

    return-object v0
.end method
