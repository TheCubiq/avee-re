.class public Lcom/daaw/avee/Common/SecR$RandomString;
.super Ljava/lang/Object;
.source "SecR.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/SecR;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RandomString"
.end annotation


# instance fields
.field private final buf:[C

.field private final random:Ljava/util/Random;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Common/SecR$RandomString;->random:Ljava/util/Random;

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    .line 38
    new-array p1, p1, [C

    iput-object p1, p0, Lcom/daaw/avee/Common/SecR$RandomString;->buf:[C

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "length < 1: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public nextString()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    .line 42
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/Common/SecR$RandomString;->buf:[C

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 43
    invoke-static {}, Lcom/daaw/avee/Common/SecR;->access$000()[C

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/Common/SecR$RandomString;->random:Ljava/util/Random;

    invoke-static {}, Lcom/daaw/avee/Common/SecR;->access$000()[C

    move-result-object v4

    array-length v4, v4

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    aget-char v2, v2, v3

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/avee/Common/SecR$RandomString;->buf:[C

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
