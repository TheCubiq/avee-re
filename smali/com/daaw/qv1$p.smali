.class public Lcom/daaw/qv1$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Landroid/app/Fragment;",
        "Lcom/daaw/al;",
        "Lcom/daaw/dv1$d;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$p;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/app/Fragment;

    check-cast p2, Lcom/daaw/al;

    check-cast p3, Lcom/daaw/dv1$d;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/qv1$p;->b(Landroid/app/Fragment;Lcom/daaw/al;Lcom/daaw/dv1$d;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Landroid/app/Fragment;Lcom/daaw/al;Lcom/daaw/dv1$d;Ljava/lang/Boolean;)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/qv1$p;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->p(Lcom/daaw/qv1;)J

    move-result-wide v9

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->w0:I

    invoke-virtual {p3}, Lcom/daaw/dv1$d;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/j5;->g0(ILjava/lang/String;)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->x0:I

    iget-object v2, p3, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    invoke-virtual {v2}, Lcom/daaw/dv1$e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/j5;->g0(ILjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/qv1$p;->a:Lcom/daaw/qv1;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/qv1;->F(Lcom/daaw/qv1;Z)Z

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_0

    iget-object v1, p0, Lcom/daaw/qv1$p;->a:Lcom/daaw/qv1;

    iget p4, p3, Lcom/daaw/dv1$d;->i:I

    int-to-long v5, p4

    iget p4, p3, Lcom/daaw/dv1$d;->j:I

    int-to-long v7, p4

    :goto_0
    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/qv1;->i0(Landroid/app/Fragment;Lcom/daaw/al;Lcom/daaw/dv1$d;JJJ)V

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x7530

    cmp-long p4, v9, v0

    iget-object v1, p0, Lcom/daaw/qv1$p;->a:Lcom/daaw/qv1;

    if-gez p4, :cond_1

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x3a98

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x5

    div-long v5, v9, v2

    const-wide/16 v2, 0x3a98

    add-long v7, v5, v2

    goto :goto_0

    :goto_1
    return-void
.end method
