.class public Lchristophedelory/rss/GUID;
.super Ljava/lang/Object;
.source "GUID.java"


# instance fields
.field private _isPermaLink:Z

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Lchristophedelory/rss/GUID;->_isPermaLink:Z

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lchristophedelory/rss/GUID;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lchristophedelory/rss/GUID;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public isPermaLink()Z
    .locals 1

    .line 96
    iget-boolean v0, p0, Lchristophedelory/rss/GUID;->_isPermaLink:Z

    return v0
.end method

.method public setPermaLink(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lchristophedelory/rss/GUID;->_isPermaLink:Z

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/GUID;->_value:Ljava/lang/String;

    return-void
.end method
