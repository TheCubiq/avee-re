.class public Lchristophedelory/atom/Generator;
.super Lchristophedelory/atom/Common;
.source "Generator.java"


# instance fields
.field private _uri:Ljava/lang/String;

.field private _value:Ljava/lang/String;

.field private _version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lchristophedelory/atom/Generator;->_value:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Lchristophedelory/atom/Generator;->_uri:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Lchristophedelory/atom/Generator;->_version:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getURIString()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lchristophedelory/atom/Generator;->_uri:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lchristophedelory/atom/Generator;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lchristophedelory/atom/Generator;->_version:Ljava/lang/String;

    return-object v0
.end method

.method public setURIString(Ljava/lang/String;)V
    .locals 0

    .line 103
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Generator;->_uri:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Generator;->_value:Ljava/lang/String;

    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 129
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Generator;->_version:Ljava/lang/String;

    return-void
.end method
