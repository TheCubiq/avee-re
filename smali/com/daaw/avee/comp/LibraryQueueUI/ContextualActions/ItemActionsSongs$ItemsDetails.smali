.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;
.super Ljava/lang/Object;
.source "ItemActionsSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ItemsDetails"
.end annotation


# instance fields
.field song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;->song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-void
.end method


# virtual methods
.method public getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;->song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-object v0
.end method
