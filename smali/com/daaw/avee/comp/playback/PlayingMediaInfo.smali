.class public Lcom/daaw/avee/comp/playback/PlayingMediaInfo;
.super Ljava/lang/Object;
.source "PlayingMediaInfo.java"


# static fields
.field public static final empty:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;


# instance fields
.field public final containsVideoTrack:Z

.field public final duration:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 9
    new-instance v0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;-><init>(JZ)V

    sput-object v0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->empty:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->duration:J

    .line 27
    iput-boolean p3, p0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->containsVideoTrack:Z

    return-void
.end method
