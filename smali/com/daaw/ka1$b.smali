.class public Lcom/daaw/ka1$b;
.super Lcom/daaw/ka1$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ka1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/d31;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/d31;JJJJLjava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d31;",
            "JJJJ",
            "Ljava/util/List<",
            "Lcom/daaw/ka1$d;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/d31;",
            ">;)V"
        }
    .end annotation

    invoke-direct/range {p0 .. p10}, Lcom/daaw/ka1$a;-><init>(Lcom/daaw/d31;JJJJLjava/util/List;)V

    iput-object p11, p0, Lcom/daaw/ka1$b;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public d(J)I
    .locals 0

    iget-object p1, p0, Lcom/daaw/ka1$b;->g:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public h(Lcom/daaw/j41;J)Lcom/daaw/d31;
    .locals 2

    iget-object p1, p0, Lcom/daaw/ka1$b;->g:Ljava/util/List;

    iget-wide v0, p0, Lcom/daaw/ka1$a;->d:J

    sub-long/2addr p2, v0

    long-to-int p3, p2

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/d31;

    return-object p1
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
