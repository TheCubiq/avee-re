.class public Lchristophedelory/playlist/kpl/Entry;
.super Ljava/lang/Object;
.source "Entry.java"


# instance fields
.field private _fileName:Ljava/lang/String;

.field private _tag:Lchristophedelory/playlist/kpl/Tag;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Entry;->_fileName:Ljava/lang/String;

    .line 46
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Entry;->_tag:Lchristophedelory/playlist/kpl/Tag;

    return-void
.end method


# virtual methods
.method public getFilename()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Entry;->_fileName:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Lchristophedelory/playlist/kpl/Tag;
    .locals 1

    .line 76
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Entry;->_tag:Lchristophedelory/playlist/kpl/Tag;

    return-object v0
.end method

.method public setFilename(Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Entry;->_fileName:Ljava/lang/String;

    return-void
.end method

.method public setTag(Lchristophedelory/playlist/kpl/Tag;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lchristophedelory/playlist/kpl/Entry;->_tag:Lchristophedelory/playlist/kpl/Tag;

    return-void
.end method
