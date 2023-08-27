.class public Lchristophedelory/atom/Category;
.super Lchristophedelory/atom/Common;
.source "Category.java"


# instance fields
.field private _label:Ljava/lang/String;

.field private _scheme:Ljava/lang/String;

.field private _term:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lchristophedelory/atom/Category;->_term:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Lchristophedelory/atom/Category;->_scheme:Ljava/lang/String;

    .line 48
    iput-object v0, p0, Lchristophedelory/atom/Category;->_label:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lchristophedelory/atom/Category;->_label:Ljava/lang/String;

    return-object v0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lchristophedelory/atom/Category;->_scheme:Ljava/lang/String;

    return-object v0
.end method

.method public getTerm()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lchristophedelory/atom/Category;->_term:Ljava/lang/String;

    return-object v0
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lchristophedelory/atom/Category;->_label:Ljava/lang/String;

    return-void
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lchristophedelory/atom/Category;->_scheme:Ljava/lang/String;

    return-void
.end method

.method public setTerm(Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Category;->_term:Ljava/lang/String;

    return-void
.end method
