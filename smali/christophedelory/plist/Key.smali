.class public Lchristophedelory/plist/Key;
.super Lchristophedelory/plist/PlistText;
.source "Key.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lchristophedelory/plist/PlistText;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lchristophedelory/plist/PlistText;-><init>()V

    .line 52
    invoke-virtual {p0, p1}, Lchristophedelory/plist/Key;->setValue(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 74
    instance-of v1, p1, Lchristophedelory/plist/Key;

    if-eqz v1, :cond_1

    .line 76
    check-cast p1, Lchristophedelory/plist/Key;

    .line 77
    invoke-virtual {p0}, Lchristophedelory/plist/Key;->getValue()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 81
    invoke-virtual {p1}, Lchristophedelory/plist/Key;->getValue()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    const/4 v0, 0x1

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {p1}, Lchristophedelory/plist/Key;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :cond_1
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 59
    invoke-virtual {p0}, Lchristophedelory/plist/Key;->getValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
