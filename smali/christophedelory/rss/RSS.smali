.class public Lchristophedelory/rss/RSS;
.super Ljava/lang/Object;
.source "RSS.java"


# static fields
.field public static final VERSION_0_91:Ljava/lang/String; = "0.91"

.field public static final VERSION_0_92:Ljava/lang/String; = "0.92"

.field public static final VERSION_2_0:Ljava/lang/String; = "2.0"


# instance fields
.field private _channel:Lchristophedelory/rss/Channel;

.field private _version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Lchristophedelory/rss/Channel;

    invoke-direct {v0}, Lchristophedelory/rss/Channel;-><init>()V

    iput-object v0, p0, Lchristophedelory/rss/RSS;->_channel:Lchristophedelory/rss/Channel;

    const-string v1, "2.0"

    .line 64
    iput-object v1, p0, Lchristophedelory/rss/RSS;->_version:Ljava/lang/String;

    .line 71
    invoke-virtual {v0, p0}, Lchristophedelory/rss/Channel;->setRSS(Lchristophedelory/rss/RSS;)V

    return-void
.end method


# virtual methods
.method public getChannel()Lchristophedelory/rss/Channel;
    .locals 1

    .line 122
    iget-object v0, p0, Lchristophedelory/rss/RSS;->_channel:Lchristophedelory/rss/Channel;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lchristophedelory/rss/RSS;->_version:Ljava/lang/String;

    return-object v0
.end method

.method public setChannel(Lchristophedelory/rss/Channel;)V
    .locals 0

    .line 133
    invoke-virtual {p1, p0}, Lchristophedelory/rss/Channel;->setRSS(Lchristophedelory/rss/RSS;)V

    .line 134
    iput-object p1, p0, Lchristophedelory/rss/RSS;->_channel:Lchristophedelory/rss/Channel;

    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/RSS;->_version:Ljava/lang/String;

    return-void
.end method
