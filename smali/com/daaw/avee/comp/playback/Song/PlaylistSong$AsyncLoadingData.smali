.class Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;
.super Ljava/lang/Object;
.source "PlaylistSong.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncLoadingData"
.end annotation


# instance fields
.field public final listener:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;

.field final synthetic this$0:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field public final userData1:Ljava/lang/Object;

.field public final userData2:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 655
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->this$0:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 657
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->listener:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;

    .line 658
    iput-object p3, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->userData1:Ljava/lang/Object;

    .line 659
    iput-object p4, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->userData2:Ljava/lang/Object;

    return-void
.end method
