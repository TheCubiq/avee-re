.class public Lchristophedelory/atom/Content;
.super Lchristophedelory/atom/Type;
.source "Content.java"


# instance fields
.field private _src:Ljava/lang/String;

.field private _text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lchristophedelory/atom/Type;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lchristophedelory/atom/Content;->_text:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Lchristophedelory/atom/Content;->_src:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getSrc()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lchristophedelory/atom/Content;->_src:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lchristophedelory/atom/Content;->_text:Ljava/lang/String;

    return-object v0
.end method

.method public setSrc(Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Content;->_src:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Content;->_text:Ljava/lang/String;

    return-void
.end method
