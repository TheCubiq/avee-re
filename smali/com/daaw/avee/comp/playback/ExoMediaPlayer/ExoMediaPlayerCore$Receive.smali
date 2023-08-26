.class public Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Receive"
.end annotation


# static fields
.field static listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static showTrackSelection:Lcom/daaw/avee/Common/Events/WeakDelegate2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate2<",
            "Landroid/app/Activity;",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 91
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;->listenerRefHolder:Ljava/util/List;

    .line 93
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate2;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive$1;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive$1;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate2$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate2;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;->showTrackSelection:Lcom/daaw/avee/Common/Events/WeakDelegate2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
