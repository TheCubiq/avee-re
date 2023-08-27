.class Lcom/daaw/avee/Design/LogoDesign$4;
.super Ljava/lang/Object;
.source "LogoDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LogoDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
        "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LogoDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LogoDesign;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 111
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    iget-object p2, p2, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    iget-object p2, p2, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    .line 112
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    iput-object p1, p2, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 114
    iget-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/LogoDesign;->access$302(Lcom/daaw/avee/Design/LogoDesign;Z)Z

    .line 115
    iget-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/LogoDesign;->access$402(Lcom/daaw/avee/Design/LogoDesign;Z)Z

    .line 117
    iget-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$4;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/LogoDesign;->access$000(Lcom/daaw/avee/Design/LogoDesign;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_2

    const/4 p2, 0x2

    const/4 p3, -0x1

    .line 119
    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setTriggerLogoTh(II)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 106
    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    check-cast p2, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    check-cast p3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    check-cast p4, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/LogoDesign$4;->invoke(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V

    return-void
.end method
