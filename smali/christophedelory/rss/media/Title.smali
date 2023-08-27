.class public Lchristophedelory/rss/media/Title;
.super Ljava/lang/Object;
.source "Title.java"


# instance fields
.field private _type:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lchristophedelory/rss/media/Title;->_type:Ljava/lang/String;

    .line 48
    iput-object v0, p0, Lchristophedelory/rss/media/Title;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lchristophedelory/rss/media/Title;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lchristophedelory/rss/media/Title;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lchristophedelory/rss/media/Title;->_type:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Title;->_value:Ljava/lang/String;

    return-void
.end method
