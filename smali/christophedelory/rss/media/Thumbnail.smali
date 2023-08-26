.class public Lchristophedelory/rss/media/Thumbnail;
.super Ljava/lang/Object;
.source "Thumbnail.java"


# instance fields
.field private _height:Ljava/lang/Integer;

.field private _time:Ljava/lang/String;

.field private _url:Ljava/net/URI;

.field private _width:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_url:Ljava/net/URI;

    .line 54
    iput-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_width:Ljava/lang/Integer;

    .line 59
    iput-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_height:Ljava/lang/Integer;

    .line 64
    iput-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_time:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getHeight()Ljava/lang/Integer;
    .locals 1

    .line 202
    iget-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_height:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_time:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/net/URI;
    .locals 1

    .line 124
    iget-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_url:Ljava/net/URI;

    return-object v0
.end method

.method public getURLString()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_url:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWidth()Ljava/lang/Integer;
    .locals 1

    .line 163
    iget-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_width:Ljava/lang/Integer;

    return-object v0
.end method

.method public setHeight(I)V
    .locals 0

    .line 174
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Thumbnail;->_height:Ljava/lang/Integer;

    return-void
.end method

.method public setHeight(Ljava/lang/Integer;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lchristophedelory/rss/media/Thumbnail;->_height:Ljava/lang/Integer;

    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lchristophedelory/rss/media/Thumbnail;->_time:Ljava/lang/String;

    return-void
.end method

.method public setURL(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 113
    iput-object p1, p0, Lchristophedelory/rss/media/Thumbnail;->_url:Ljava/net/URI;

    return-void

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "No URL"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setURLString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 76
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/media/Thumbnail;->_url:Ljava/net/URI;

    return-void
.end method

.method public setWidth(I)V
    .locals 0

    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Thumbnail;->_width:Ljava/lang/Integer;

    return-void
.end method

.method public setWidth(Ljava/lang/Integer;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lchristophedelory/rss/media/Thumbnail;->_width:Ljava/lang/Integer;

    return-void
.end method
