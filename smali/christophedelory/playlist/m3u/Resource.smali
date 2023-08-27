.class public Lchristophedelory/playlist/m3u/Resource;
.super Ljava/lang/Object;
.source "Resource.java"


# instance fields
.field private _location:Ljava/lang/String;

.field private _name:Ljava/lang/String;

.field private _seconds:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lchristophedelory/playlist/m3u/Resource;->_name:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Lchristophedelory/playlist/m3u/Resource;->_location:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 49
    iput-wide v0, p0, Lchristophedelory/playlist/m3u/Resource;->_seconds:J

    return-void
.end method


# virtual methods
.method public getLength()J
    .locals 2

    .line 102
    iget-wide v0, p0, Lchristophedelory/playlist/m3u/Resource;->_seconds:J

    return-wide v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lchristophedelory/playlist/m3u/Resource;->_location:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lchristophedelory/playlist/m3u/Resource;->_name:Ljava/lang/String;

    return-object v0
.end method

.method public setLength(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const-wide/16 p1, -0x1

    .line 115
    iput-wide p1, p0, Lchristophedelory/playlist/m3u/Resource;->_seconds:J

    goto :goto_0

    .line 119
    :cond_0
    iput-wide p1, p0, Lchristophedelory/playlist/m3u/Resource;->_seconds:J

    :goto_0
    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 2

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x5c

    const/16 v1, 0x2f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/m3u/Resource;->_location:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/m3u/Resource;->_name:Ljava/lang/String;

    return-void
.end method
