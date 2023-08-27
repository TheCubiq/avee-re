.class public Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;
.super Ljava/lang/Object;
.source "PlaylistSong.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DataDetails"
.end annotation


# instance fields
.field public albumArtist:Ljava/lang/String;

.field public albumName:Ljava/lang/String;

.field public artistName:Ljava/lang/String;

.field public bitRate:I

.field public cdNum:I

.field public composer:Ljava/lang/String;

.field public final data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field public duration:I

.field public height:I

.field public isStream:Z

.field public mimeType:Ljava/lang/String;

.field public secondName:Ljava/lang/String;

.field public trackName:Ljava/lang/String;

.field public trackNum:I

.field public width:I

.field public year:I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 1

    .line 641
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 624
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->isStream:Z

    .line 642
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    .line 646
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget v0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    return v0
.end method
