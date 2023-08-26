.class Lcom/daaw/avee/Design/MainUIDesign$10;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/MainUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$10;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 1

    .line 157
    sget-object v0, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 154
    invoke-virtual {p0}, Lcom/daaw/avee/Design/MainUIDesign$10;->invoke()Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    return-object v0
.end method
