.class public Lchristophedelory/rss/Category;
.super Ljava/lang/Object;
.source "Category.java"


# instance fields
.field private _domain:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lchristophedelory/rss/Category;->_domain:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Lchristophedelory/rss/Category;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDomain()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lchristophedelory/rss/Category;->_domain:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lchristophedelory/rss/Category;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setDomain(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lchristophedelory/rss/Category;->_domain:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Category;->_value:Ljava/lang/String;

    return-void
.end method
