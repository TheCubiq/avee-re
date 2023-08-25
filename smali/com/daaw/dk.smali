.class public Lcom/daaw/dk;
.super Lcom/daaw/n10;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dk$h;,
        Lcom/daaw/dk$g;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/n10<",
        "Lcom/daaw/tx0;",
        "Ljava/util/List<",
        "Lcom/daaw/tx0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public K:[Lcom/daaw/l0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 9

    new-instance v2, Lcom/daaw/dk$g;

    invoke-direct {v2}, Lcom/daaw/dk$g;-><init>()V

    new-instance v3, Lcom/daaw/f6;

    invoke-direct {v3}, Lcom/daaw/f6;-><init>()V

    new-instance v5, Lcom/daaw/tr1;

    invoke-direct {v5, p3}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/daaw/q91;

    invoke-direct {v7, p1}, Lcom/daaw/q91;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move v6, p4

    move v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/daaw/n10;-><init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;ILcom/daaw/m10;I)V

    const/4 p1, 0x6

    new-array p1, p1, [Lcom/daaw/l0;

    new-instance p2, Lcom/daaw/dk$a;

    invoke-direct {p2, p0}, Lcom/daaw/dk$a;-><init>(Lcom/daaw/dk;)V

    const/4 p3, 0x0

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/dk$b;

    invoke-direct {p2, p0}, Lcom/daaw/dk$b;-><init>(Lcom/daaw/dk;)V

    const/4 p3, 0x1

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/dk$c;

    invoke-direct {p2, p0}, Lcom/daaw/dk$c;-><init>(Lcom/daaw/dk;)V

    const/4 p3, 0x2

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/dk$d;

    invoke-direct {p2, p0}, Lcom/daaw/dk$d;-><init>(Lcom/daaw/dk;)V

    const/4 p3, 0x3

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/dk$e;

    invoke-direct {p2, p0}, Lcom/daaw/dk$e;-><init>(Lcom/daaw/dk;)V

    const/4 p3, 0x4

    aput-object p2, p1, p3

    new-instance p2, Lcom/daaw/dk$f;

    invoke-direct {p2, p0}, Lcom/daaw/dk$f;-><init>(Lcom/daaw/dk;)V

    const/4 p3, 0x5

    aput-object p2, p1, p3

    iput-object p1, p0, Lcom/daaw/dk;->K:[Lcom/daaw/l0;

    return-void
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/16 p2, 0xe

    const/16 v0, 0xf

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p2, Lcom/daaw/ts1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p2
.end method

.method public H(I)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Lcom/daaw/al;I)V
    .locals 0

    return-void
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/q91;

    invoke-direct {v0, p1}, Lcom/daaw/q91;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/n10;->W(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m10;)V

    return-void
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 11

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/tx0;

    move-object v6, p1

    check-cast v6, Lcom/daaw/uk;

    iput p2, v6, Lcom/daaw/uk;->v:I

    new-instance v2, Lcom/daaw/dk$h;

    invoke-direct {v2, v3, p2}, Lcom/daaw/dk$h;-><init>(Lcom/daaw/tx0;I)V

    iget-object v7, p0, Lcom/daaw/dk;->K:[Lcom/daaw/l0;

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v5, p2

    invoke-static/range {v1 .. v10}, Lcom/daaw/qk;->g0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;IZZ)V

    return-void
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100145

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method
