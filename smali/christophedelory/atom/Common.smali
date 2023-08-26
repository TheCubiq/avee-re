.class public Lchristophedelory/atom/Common;
.super Ljava/lang/Object;
.source "Common.java"


# instance fields
.field private _base:Ljava/lang/String;

.field private _lang:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lchristophedelory/atom/Common;->_base:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Lchristophedelory/atom/Common;->_lang:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBaseString()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lchristophedelory/atom/Common;->_base:Ljava/lang/String;

    return-object v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lchristophedelory/atom/Common;->_lang:Ljava/lang/String;

    return-object v0
.end method

.method public setBaseString(Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Common;->_base:Ljava/lang/String;

    return-void
.end method

.method public setLang(Ljava/lang/String;)V
    .locals 0

    .line 99
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Common;->_lang:Ljava/lang/String;

    return-void
.end method
