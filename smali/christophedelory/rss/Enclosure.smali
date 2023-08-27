.class public Lchristophedelory/rss/Enclosure;
.super Ljava/lang/Object;
.source "Enclosure.java"


# instance fields
.field private _length:J

.field private _type:Ljava/lang/String;

.field private _url:Ljava/net/URI;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lchristophedelory/rss/Enclosure;->_url:Ljava/net/URI;

    const-wide/16 v0, 0x0

    .line 47
    iput-wide v0, p0, Lchristophedelory/rss/Enclosure;->_length:J

    const-string v0, "application/octet-stream"

    .line 52
    iput-object v0, p0, Lchristophedelory/rss/Enclosure;->_type:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getLength()J
    .locals 2

    .line 143
    iget-wide v0, p0, Lchristophedelory/rss/Enclosure;->_length:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lchristophedelory/rss/Enclosure;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/net/URI;
    .locals 1

    .line 114
    iget-object v0, p0, Lchristophedelory/rss/Enclosure;->_url:Ljava/net/URI;

    return-object v0
.end method

.method public getURLString()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lchristophedelory/rss/Enclosure;->_url:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setLength(J)V
    .locals 0

    .line 124
    iput-wide p1, p0, Lchristophedelory/rss/Enclosure;->_length:J

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 173
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Enclosure;->_type:Ljava/lang/String;

    return-void
.end method

.method public setURL(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 100
    iput-object p1, p0, Lchristophedelory/rss/Enclosure;->_url:Ljava/net/URI;

    return-void

    .line 97
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

    .line 64
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/Enclosure;->_url:Ljava/net/URI;

    return-void
.end method
