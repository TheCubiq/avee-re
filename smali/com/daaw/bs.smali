.class public final Lcom/daaw/bs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/eo1$c;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/daaw/bs;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/bs;->a:I

    const/16 p1, 0x20

    invoke-virtual {p0, p1}, Lcom/daaw/bs;->d(I)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x0

    const-string v0, "application/cea-608"

    invoke-static {p2, v0, p1, p2}, Lcom/google/android/exoplayer2/Format;->B(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Lcom/daaw/bs;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(ILcom/daaw/eo1$b;)Lcom/daaw/eo1;
    .locals 4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_e

    const/4 v1, 0x3

    if-eq p1, v1, :cond_d

    const/4 v1, 0x4

    if-eq p1, v1, :cond_d

    const/16 v2, 0xf

    const/4 v3, 0x0

    if-eq p1, v2, :cond_b

    const/16 v2, 0x11

    if-eq p1, v2, :cond_9

    const/16 v0, 0x15

    if-eq p1, v0, :cond_8

    const/16 v0, 0x1b

    if-eq p1, v0, :cond_6

    const/16 v0, 0x24

    if-eq p1, v0, :cond_5

    const/16 v0, 0x59

    if-eq p1, v0, :cond_4

    const/16 v0, 0x8a

    if-eq p1, v0, :cond_3

    const/16 v0, 0x81

    if-eq p1, v0, :cond_2

    const/16 v0, 0x82

    if-eq p1, v0, :cond_3

    const/16 v0, 0x86

    if-eq p1, v0, :cond_0

    const/16 v0, 0x87

    if-eq p1, v0, :cond_2

    return-object v3

    :cond_0
    const/16 p1, 0x10

    invoke-virtual {p0, p1}, Lcom/daaw/bs;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v3, Lcom/daaw/aa1;

    new-instance p1, Lcom/daaw/se1;

    invoke-direct {p1}, Lcom/daaw/se1;-><init>()V

    invoke-direct {v3, p1}, Lcom/daaw/aa1;-><init>(Lcom/daaw/z91;)V

    :goto_0
    return-object v3

    :cond_2
    new-instance p1, Lcom/daaw/mw0;

    new-instance v0, Lcom/daaw/t;

    iget-object p2, p2, Lcom/daaw/eo1$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/t;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/mw0;

    new-instance v0, Lcom/daaw/cv;

    iget-object p2, p2, Lcom/daaw/eo1$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/cv;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/daaw/mw0;

    new-instance v0, Lcom/daaw/jv;

    iget-object p2, p2, Lcom/daaw/eo1$b;->c:Ljava/util/List;

    invoke-direct {v0, p2}, Lcom/daaw/jv;-><init>(Ljava/util/List;)V

    invoke-direct {p1, v0}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/daaw/mw0;

    new-instance v0, Lcom/daaw/o80;

    invoke-virtual {p0, p2}, Lcom/daaw/bs;->c(Lcom/daaw/eo1$b;)Lcom/daaw/cb1;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/daaw/o80;-><init>(Lcom/daaw/cb1;)V

    invoke-direct {p1, v0}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1

    :cond_6
    invoke-virtual {p0, v1}, Lcom/daaw/bs;->d(I)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    new-instance v3, Lcom/daaw/mw0;

    new-instance p1, Lcom/daaw/n80;

    invoke-virtual {p0, p2}, Lcom/daaw/bs;->c(Lcom/daaw/eo1$b;)Lcom/daaw/cb1;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/bs;->d(I)Z

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/daaw/bs;->d(I)Z

    move-result v1

    invoke-direct {p1, p2, v0, v1}, Lcom/daaw/n80;-><init>(Lcom/daaw/cb1;ZZ)V

    invoke-direct {v3, p1}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    :goto_1
    return-object v3

    :cond_8
    new-instance p1, Lcom/daaw/mw0;

    new-instance p2, Lcom/daaw/se0;

    invoke-direct {p2}, Lcom/daaw/se0;-><init>()V

    invoke-direct {p1, p2}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1

    :cond_9
    invoke-virtual {p0, v0}, Lcom/daaw/bs;->d(I)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_2

    :cond_a
    new-instance v3, Lcom/daaw/mw0;

    new-instance p1, Lcom/daaw/ti0;

    iget-object p2, p2, Lcom/daaw/eo1$b;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Lcom/daaw/ti0;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    :goto_2
    return-object v3

    :cond_b
    invoke-virtual {p0, v0}, Lcom/daaw/bs;->d(I)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_3

    :cond_c
    new-instance v3, Lcom/daaw/mw0;

    new-instance p1, Lcom/daaw/t1;

    const/4 v0, 0x0

    iget-object p2, p2, Lcom/daaw/eo1$b;->b:Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lcom/daaw/t1;-><init>(ZLjava/lang/String;)V

    invoke-direct {v3, p1}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    :goto_3
    return-object v3

    :cond_d
    new-instance p1, Lcom/daaw/mw0;

    new-instance v0, Lcom/daaw/zq0;

    iget-object p2, p2, Lcom/daaw/eo1$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/zq0;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1

    :cond_e
    new-instance p1, Lcom/daaw/mw0;

    new-instance p2, Lcom/daaw/m80;

    invoke-direct {p2}, Lcom/daaw/m80;-><init>()V

    invoke-direct {p1, p2}, Lcom/daaw/mw0;-><init>(Lcom/daaw/wv;)V

    return-object p1
.end method

.method public b()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/eo1;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-object v0
.end method

.method public final c(Lcom/daaw/eo1$b;)Lcom/daaw/cb1;
    .locals 14

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lcom/daaw/bs;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/daaw/cb1;

    iget-object v0, p0, Lcom/daaw/bs;->b:Ljava/util/List;

    invoke-direct {p1, v0}, Lcom/daaw/cb1;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/rv0;

    iget-object p1, p1, Lcom/daaw/eo1$b;->d:[B

    invoke-direct {v0, p1}, Lcom/daaw/rv0;-><init>([B)V

    iget-object p1, p0, Lcom/daaw/bs;->b:Ljava/util/List;

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/rv0;->a()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0}, Lcom/daaw/rv0;->x()I

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/rv0;->x()I

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/rv0;->c()I

    move-result v3

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne v1, v2, :cond_3

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/rv0;->x()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_3

    const/4 v5, 0x3

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->u(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/daaw/rv0;->x()I

    move-result v5

    and-int/lit16 v6, v5, 0x80

    const/4 v7, 0x1

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_2

    and-int/lit8 v5, v5, 0x3f

    const-string v6, "application/cea-708"

    move v12, v5

    move-object v7, v6

    goto :goto_3

    :cond_2
    const-string v5, "application/cea-608"

    move-object v7, v5

    const/4 v12, 0x1

    :goto_3
    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lcom/google/android/exoplayer2/Format;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/daaw/cb1;

    invoke-direct {v0, p1}, Lcom/daaw/cb1;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final d(I)Z
    .locals 1

    iget v0, p0, Lcom/daaw/bs;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
