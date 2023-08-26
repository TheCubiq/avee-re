.class public Lchristophedelory/playlist/Playlist;
.super Ljava/lang/Object;
.source "Playlist.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lchristophedelory/playlist/Playlist$Normalization;
    }
.end annotation


# static fields
.field private static final NORMALIZATION:Lchristophedelory/playlist/PlaylistVisitor;

.field private static final _logger:Lorg/myapache/commons/logging/Log;


# instance fields
.field private final _rootSequence:Lchristophedelory/playlist/Sequence;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    const-class v0, Lchristophedelory/playlist/Playlist;

    invoke-static {v0}, Lmychristophedelory/logging/LogFactory;->getLog(Ljava/lang/Class;)Lorg/myapache/commons/logging/Log;

    move-result-object v0

    sput-object v0, Lchristophedelory/playlist/Playlist;->_logger:Lorg/myapache/commons/logging/Log;

    .line 45
    new-instance v0, Lchristophedelory/playlist/Playlist$Normalization;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lchristophedelory/playlist/Playlist$Normalization;-><init>(Lchristophedelory/playlist/Playlist$1;)V

    sput-object v0, Lchristophedelory/playlist/Playlist;->NORMALIZATION:Lchristophedelory/playlist/PlaylistVisitor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Lchristophedelory/playlist/Sequence;

    invoke-direct {v0}, Lchristophedelory/playlist/Sequence;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/Playlist;->_rootSequence:Lchristophedelory/playlist/Sequence;

    return-void
.end method

.method static synthetic access$100()Lorg/myapache/commons/logging/Log;
    .locals 1

    .line 35
    sget-object v0, Lchristophedelory/playlist/Playlist;->_logger:Lorg/myapache/commons/logging/Log;

    return-object v0
.end method


# virtual methods
.method public acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 291
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->beginVisitPlaylist(Lchristophedelory/playlist/Playlist;)V

    .line 293
    iget-object v0, p0, Lchristophedelory/playlist/Playlist;->_rootSequence:Lchristophedelory/playlist/Sequence;

    invoke-virtual {v0, p1}, Lchristophedelory/playlist/Sequence;->acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V

    .line 295
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->endVisitPlaylist(Lchristophedelory/playlist/Playlist;)V

    return-void
.end method

.method public acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 306
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->beginVisitPlaylist(Lchristophedelory/playlist/Playlist;)V

    .line 308
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->endVisitPlaylist(Lchristophedelory/playlist/Playlist;)V

    return-void
.end method

.method public getRootSequence()Lchristophedelory/playlist/Sequence;
    .locals 1

    .line 66
    iget-object v0, p0, Lchristophedelory/playlist/Playlist;->_rootSequence:Lchristophedelory/playlist/Sequence;

    return-object v0
.end method

.method public normalize()V
    .locals 3

    .line 77
    :try_start_0
    iget-object v0, p0, Lchristophedelory/playlist/Playlist;->_rootSequence:Lchristophedelory/playlist/Sequence;

    sget-object v1, Lchristophedelory/playlist/Playlist;->NORMALIZATION:Lchristophedelory/playlist/PlaylistVisitor;

    invoke-virtual {v0, v1}, Lchristophedelory/playlist/Sequence;->acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V

    .line 81
    iget-object v0, p0, Lchristophedelory/playlist/Playlist;->_rootSequence:Lchristophedelory/playlist/Sequence;

    sget-object v1, Lchristophedelory/playlist/Playlist;->NORMALIZATION:Lchristophedelory/playlist/PlaylistVisitor;

    invoke-virtual {v0, v1}, Lchristophedelory/playlist/Sequence;->acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 86
    sget-object v1, Lchristophedelory/playlist/Playlist;->_logger:Lorg/myapache/commons/logging/Log;

    const-string v2, "Unexpected error condition"

    invoke-interface {v1, v2, v0}, Lorg/myapache/commons/logging/Log;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
