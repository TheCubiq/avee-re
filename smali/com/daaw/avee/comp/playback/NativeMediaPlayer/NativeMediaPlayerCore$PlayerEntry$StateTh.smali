.class public Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;
.super Ljava/lang/Object;
.source "NativeMediaPlayerCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "StateTh"
.end annotation


# instance fields
.field public audioSessionId:I

.field public isPreparingOrStared:Z

.field public stateLevels:I

.field final synthetic this$1:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;)V
    .locals 0

    .line 862
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->this$1:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 863
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->stateLevels:I

    const/4 p1, 0x0

    .line 864
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->isPreparingOrStared:Z

    .line 865
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->audioSessionId:I

    return-void
.end method
