.class public final Lcom/daaw/ap$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jk0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jk0$a<",
        "Lcom/daaw/vv0<",
        "Lcom/daaw/wo;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ap;


# direct methods
.method public constructor <init>(Lcom/daaw/ap;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ap$g;->p:Lcom/daaw/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/ap;Lcom/daaw/ap$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/ap$g;-><init>(Lcom/daaw/ap;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/vv0;JJZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/wo;",
            ">;JJZ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ap$g;->p:Lcom/daaw/ap;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ap;->A(Lcom/daaw/vv0;JJ)V

    return-void
.end method

.method public b(Lcom/daaw/vv0;JJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/wo;",
            ">;JJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ap$g;->p:Lcom/daaw/ap;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ap;->B(Lcom/daaw/vv0;JJ)V

    return-void
.end method

.method public c(Lcom/daaw/vv0;JJLjava/io/IOException;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/wo;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")I"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ap$g;->p:Lcom/daaw/ap;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/ap;->C(Lcom/daaw/vv0;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic k(Lcom/daaw/jk0$c;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/ap$g;->a(Lcom/daaw/vv0;JJZ)V

    return-void
.end method

.method public bridge synthetic o(Lcom/daaw/jk0$c;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/ap$g;->b(Lcom/daaw/vv0;JJ)V

    return-void
.end method

.method public bridge synthetic r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/ap$g;->c(Lcom/daaw/vv0;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method
