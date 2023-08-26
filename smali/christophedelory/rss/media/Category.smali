.class public Lchristophedelory/rss/media/Category;
.super Ljava/lang/Object;
.source "Category.java"


# instance fields
.field private _label:Ljava/lang/String;

.field private _scheme:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lchristophedelory/rss/media/Category;->_scheme:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Lchristophedelory/rss/media/Category;->_label:Ljava/lang/String;

    .line 56
    iput-object v0, p0, Lchristophedelory/rss/media/Category;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lchristophedelory/rss/media/Category;->_label:Ljava/lang/String;

    return-object v0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lchristophedelory/rss/media/Category;->_scheme:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lchristophedelory/rss/media/Category;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lchristophedelory/rss/media/Category;->_label:Ljava/lang/String;

    return-void
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lchristophedelory/rss/media/Category;->_scheme:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Category;->_value:Ljava/lang/String;

    return-void
.end method
