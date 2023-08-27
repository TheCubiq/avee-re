.class Lcom/daaw/avee/Design/VisualizerExporterDesign$11;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

.field final synthetic val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 478
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$11;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$11;->val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 7

    .line 481
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$11;->val$playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/Design/PlaybackDesign;->onPlayStateChanged(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 478
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/VisualizerExporterDesign$11;->invoke(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    return-void
.end method
