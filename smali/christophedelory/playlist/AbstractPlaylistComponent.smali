.class public abstract Lchristophedelory/playlist/AbstractPlaylistComponent;
.super Ljava/lang/Object;
.source "AbstractPlaylistComponent.java"


# instance fields
.field private transient _parent:Lchristophedelory/playlist/AbstractTimeContainer;

.field private _repeatCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 37
    iput v0, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_repeatCount:I

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_parent:Lchristophedelory/playlist/AbstractTimeContainer;

    return-void
.end method


# virtual methods
.method public abstract acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_parent:Lchristophedelory/playlist/AbstractTimeContainer;

    if-eqz v0, :cond_0

    .line 112
    invoke-virtual {v0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V

    :cond_0
    return-void
.end method

.method public getParent()Lchristophedelory/playlist/AbstractTimeContainer;
    .locals 1

    .line 60
    iget-object v0, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_parent:Lchristophedelory/playlist/AbstractTimeContainer;

    return-object v0
.end method

.method public getRepeatCount()I
    .locals 1

    .line 73
    iget v0, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_repeatCount:I

    return v0
.end method

.method setParent(Lchristophedelory/playlist/AbstractTimeContainer;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_parent:Lchristophedelory/playlist/AbstractTimeContainer;

    return-void
.end method

.method public setRepeatCount(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, -0x1

    .line 86
    iput p1, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_repeatCount:I

    goto :goto_0

    .line 90
    :cond_0
    iput p1, p0, Lchristophedelory/playlist/AbstractPlaylistComponent;->_repeatCount:I

    :goto_0
    return-void
.end method
