.class public Lchristophedelory/playlist/Media;
.super Lchristophedelory/playlist/AbstractPlaylistComponent;
.source "Media.java"


# instance fields
.field private _duration:Ljava/lang/Long;

.field private _source:Lmychristophedelory/content/Content;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lchristophedelory/playlist/AbstractPlaylistComponent;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lchristophedelory/playlist/Media;->_source:Lmychristophedelory/content/Content;

    .line 44
    iput-object v0, p0, Lchristophedelory/playlist/Media;->_duration:Ljava/lang/Long;

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

    .line 123
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->beginVisitMedia(Lchristophedelory/playlist/Media;)V

    .line 125
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->endVisitMedia(Lchristophedelory/playlist/Media;)V

    return-void
.end method

.method public acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 131
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->beginVisitMedia(Lchristophedelory/playlist/Media;)V

    .line 133
    invoke-super {p0, p1}, Lchristophedelory/playlist/AbstractPlaylistComponent;->acceptUp(Lchristophedelory/playlist/PlaylistVisitor;)V

    .line 135
    invoke-interface {p1, p0}, Lchristophedelory/playlist/PlaylistVisitor;->endVisitMedia(Lchristophedelory/playlist/Media;)V

    return-void
.end method

.method public getDuration()Ljava/lang/Long;
    .locals 1

    .line 81
    iget-object v0, p0, Lchristophedelory/playlist/Media;->_duration:Ljava/lang/Long;

    return-object v0
.end method

.method public getSource()Lmychristophedelory/content/Content;
    .locals 1

    .line 53
    iget-object v0, p0, Lchristophedelory/playlist/Media;->_source:Lmychristophedelory/content/Content;

    return-object v0
.end method

.method public setDuration(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 117
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/Media;->_duration:Ljava/lang/Long;

    return-void

    .line 114
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Negative or null duration "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setDuration(Ljava/lang/Long;)V
    .locals 5

    if-eqz p1, :cond_1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    goto :goto_0

    .line 96
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Negative or null duration "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_1
    :goto_0
    iput-object p1, p0, Lchristophedelory/playlist/Media;->_duration:Ljava/lang/Long;

    return-void
.end method

.method public setSource(Lmychristophedelory/content/Content;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 69
    iput-object p1, p0, Lchristophedelory/playlist/Media;->_source:Lmychristophedelory/content/Content;

    return-void

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "No media source"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
