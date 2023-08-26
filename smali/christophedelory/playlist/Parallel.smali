.class public Lchristophedelory/playlist/Parallel;
.super Lchristophedelory/playlist/AbstractTimeContainer;
.source "Parallel.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lchristophedelory/playlist/AbstractTimeContainer;-><init>()V

    return-void
.end method


# virtual methods
.method public acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 37
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->beginVisitParallel(Lchristophedelory/playlist/Parallel;)V

    .line 39
    invoke-super {p0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V

    .line 41
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->endVisitParallel(Lchristophedelory/playlist/Parallel;)V

    return-void
.end method

.method public acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 47
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->beginVisitParallel(Lchristophedelory/playlist/Parallel;)V

    .line 49
    invoke-super {p0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V

    .line 51
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->endVisitParallel(Lchristophedelory/playlist/Parallel;)V

    return-void
.end method
