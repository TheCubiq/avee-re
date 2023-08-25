.class public final Lcom/daaw/gv;
.super Lcom/daaw/jd1;
.source ""


# instance fields
.field public final o:Lcom/daaw/hv;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    const-string v0, "DvbDecoder"

    invoke-direct {p0, v0}, Lcom/daaw/jd1;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/rv0;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1}, Lcom/daaw/rv0;-><init>([B)V

    invoke-virtual {v0}, Lcom/daaw/rv0;->D()I

    move-result p1

    invoke-virtual {v0}, Lcom/daaw/rv0;->D()I

    move-result v0

    new-instance v1, Lcom/daaw/hv;

    invoke-direct {v1, p1, v0}, Lcom/daaw/hv;-><init>(II)V

    iput-object v1, p0, Lcom/daaw/gv;->o:Lcom/daaw/hv;

    return-void
.end method


# virtual methods
.method public C([BIZ)Lcom/daaw/iv;
    .locals 1

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/daaw/gv;->o:Lcom/daaw/hv;

    invoke-virtual {p3}, Lcom/daaw/hv;->r()V

    :cond_0
    new-instance p3, Lcom/daaw/iv;

    iget-object v0, p0, Lcom/daaw/gv;->o:Lcom/daaw/hv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/hv;->b([BI)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/daaw/iv;-><init>(Ljava/util/List;)V

    return-object p3
.end method

.method public bridge synthetic z([BIZ)Lcom/daaw/th1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/gv;->C([BIZ)Lcom/daaw/iv;

    move-result-object p1

    return-object p1
.end method
