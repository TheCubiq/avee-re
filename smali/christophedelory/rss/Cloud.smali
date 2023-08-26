.class public Lchristophedelory/rss/Cloud;
.super Ljava/lang/Object;
.source "Cloud.java"


# instance fields
.field private _domain:Ljava/lang/String;

.field private _path:Ljava/lang/String;

.field private _port:I

.field private _protocol:Ljava/lang/String;

.field private _registerProcedure:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lchristophedelory/rss/Cloud;->_domain:Ljava/lang/String;

    const/4 v1, 0x0

    .line 50
    iput v1, p0, Lchristophedelory/rss/Cloud;->_port:I

    .line 55
    iput-object v0, p0, Lchristophedelory/rss/Cloud;->_path:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lchristophedelory/rss/Cloud;->_registerProcedure:Ljava/lang/String;

    .line 65
    iput-object v0, p0, Lchristophedelory/rss/Cloud;->_protocol:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDomain()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lchristophedelory/rss/Cloud;->_domain:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lchristophedelory/rss/Cloud;->_path:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .locals 1

    .line 123
    iget v0, p0, Lchristophedelory/rss/Cloud;->_port:I

    return v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lchristophedelory/rss/Cloud;->_protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getRegisterProcedure()Ljava/lang/String;
    .locals 1

    .line 172
    iget-object v0, p0, Lchristophedelory/rss/Cloud;->_registerProcedure:Ljava/lang/String;

    return-object v0
.end method

.method public setDomain(Ljava/lang/String;)V
    .locals 0

    .line 75
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Cloud;->_domain:Ljava/lang/String;

    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0

    .line 153
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Cloud;->_path:Ljava/lang/String;

    return-void
.end method

.method public setPort(I)V
    .locals 0

    .line 104
    iput p1, p0, Lchristophedelory/rss/Cloud;->_port:I

    return-void
.end method

.method public setProtocol(Ljava/lang/String;)V
    .locals 0

    .line 213
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Cloud;->_protocol:Ljava/lang/String;

    return-void
.end method

.method public setRegisterProcedure(Ljava/lang/String;)V
    .locals 0

    .line 183
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Cloud;->_registerProcedure:Ljava/lang/String;

    return-void
.end method
