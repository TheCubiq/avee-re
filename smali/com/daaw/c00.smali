.class public final Lcom/daaw/c00;
.super Lcom/daaw/ua;
.source ""

# interfaces
.implements Lcom/daaw/b00$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/c00$b;
    }
.end annotation


# instance fields
.field public final A:Ljava/lang/Object;

.field public B:J

.field public C:Z

.field public final u:Landroid/net/Uri;

.field public final v:Lcom/daaw/mp$a;

.field public final w:Lcom/daaw/e00;

.field public final x:I

.field public final y:Ljava/lang/String;

.field public final z:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/e00;ILjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ua;-><init>()V

    iput-object p1, p0, Lcom/daaw/c00;->u:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/c00;->v:Lcom/daaw/mp$a;

    iput-object p3, p0, Lcom/daaw/c00;->w:Lcom/daaw/e00;

    iput p4, p0, Lcom/daaw/c00;->x:I

    iput-object p5, p0, Lcom/daaw/c00;->y:Ljava/lang/String;

    iput p6, p0, Lcom/daaw/c00;->z:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/c00;->B:J

    iput-object p7, p0, Lcom/daaw/c00;->A:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/e00;ILjava/lang/String;ILjava/lang/Object;Lcom/daaw/c00$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/daaw/c00;-><init>(Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/e00;ILjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/qo0;)V
    .locals 0

    check-cast p1, Lcom/daaw/b00;

    invoke-virtual {p1}, Lcom/daaw/b00;->Q()V

    return-void
.end method

.method public b(JZ)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-wide p1, p0, Lcom/daaw/c00;->B:J

    :cond_0
    iget-wide v0, p0, Lcom/daaw/c00;->B:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_1

    iget-boolean v0, p0, Lcom/daaw/c00;->C:Z

    if-ne v0, p3, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/c00;->q(JZ)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public g(Lcom/daaw/bp0$a;Lcom/daaw/l2;)Lcom/daaw/qo0;
    .locals 11

    iget v0, p1, Lcom/daaw/bp0$a;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    new-instance v0, Lcom/daaw/b00;

    iget-object v2, p0, Lcom/daaw/c00;->u:Landroid/net/Uri;

    iget-object v1, p0, Lcom/daaw/c00;->v:Lcom/daaw/mp$a;

    invoke-interface {v1}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object v3

    iget-object v1, p0, Lcom/daaw/c00;->w:Lcom/daaw/e00;

    invoke-interface {v1}, Lcom/daaw/e00;->a()[Lcom/daaw/zz;

    move-result-object v4

    iget v5, p0, Lcom/daaw/c00;->x:I

    invoke-virtual {p0, p1}, Lcom/daaw/ua;->j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;

    move-result-object v6

    iget-object v9, p0, Lcom/daaw/c00;->y:Ljava/lang/String;

    iget v10, p0, Lcom/daaw/c00;->z:I

    move-object v1, v0

    move-object v7, p0

    move-object v8, p2

    invoke-direct/range {v1 .. v10}, Lcom/daaw/b00;-><init>(Landroid/net/Uri;Lcom/daaw/mp;[Lcom/daaw/zz;ILcom/daaw/cp0$a;Lcom/daaw/b00$e;Lcom/daaw/l2;Ljava/lang/String;I)V

    return-object v0
.end method

.method public m(Lcom/daaw/rz;Z)V
    .locals 1

    iget-wide p1, p0, Lcom/daaw/c00;->B:J

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/c00;->q(JZ)V

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public final q(JZ)V
    .locals 6

    iput-wide p1, p0, Lcom/daaw/c00;->B:J

    iput-boolean p3, p0, Lcom/daaw/c00;->C:Z

    new-instance p1, Lcom/daaw/od1;

    iget-wide v1, p0, Lcom/daaw/c00;->B:J

    iget-boolean v3, p0, Lcom/daaw/c00;->C:Z

    iget-object v5, p0, Lcom/daaw/c00;->A:Ljava/lang/Object;

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/od1;-><init>(JZZLjava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ua;->n(Lcom/daaw/nl1;Ljava/lang/Object;)V

    return-void
.end method
