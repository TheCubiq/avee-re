.class public Lcom/daaw/g2$c;
.super Lcom/daaw/g2$b;
.source ""

# interfaces
.implements Lcom/daaw/q41;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/g2$b;",
        "Lcom/daaw/q41<",
        "Ljava/lang/Object;",
        "Lcom/daaw/l70;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic k:Lcom/daaw/g2;


# direct methods
.method public constructor <init>(Lcom/daaw/g2;Lcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)V
    .locals 11

    move-object v10, p0

    move-object v1, p1

    iput-object v1, v10, Lcom/daaw/g2$c;->k:Lcom/daaw/g2;

    const/4 v9, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lcom/daaw/g2$b;-><init>(Lcom/daaw/g2;Lcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;Ljava/lang/Object;Lcom/daaw/pj1;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Ljava/lang/Object;",
            "Lcom/daaw/pj1<",
            "Lcom/daaw/l70;",
            ">;Z)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/g2$c;->k:Lcom/daaw/g2;

    iget-object p2, p0, Lcom/daaw/g2$b;->b:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/daaw/g2;->h(Lcom/daaw/g2;Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p1

    const p2, 0x7f08009f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/r41;->u(Ljava/lang/Integer;)Lcom/daaw/uu;

    move-result-object p1

    iget-boolean p2, p0, Lcom/daaw/g2$b;->c:Z

    const/4 p4, 0x1

    if-nez p2, :cond_0

    invoke-virtual {p1, p4}, Lcom/daaw/su;->P(Z)Lcom/daaw/su;

    move-result-object p1

    :cond_0
    invoke-virtual {p1, p0}, Lcom/daaw/su;->F(Lcom/daaw/d51;)Lcom/daaw/su;

    move-result-object p1

    new-instance p2, Lcom/daaw/bh1;

    iget-object v0, p0, Lcom/daaw/g2$b;->i:Ljava/lang/String;

    invoke-direct {p2, v0}, Lcom/daaw/bh1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/daaw/su;->O(Lcom/daaw/hi0;)Lcom/daaw/su;

    move-result-object p1

    sget-object p2, Lcom/daaw/wt;->s:Lcom/daaw/wt;

    invoke-virtual {p1, p2}, Lcom/daaw/su;->G(Lcom/daaw/wt;)Lcom/daaw/su;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/daaw/f60;->r(Lcom/daaw/pj1;)Lcom/daaw/pj1;

    return p4
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Lcom/daaw/pj1;ZZ)Z
    .locals 0

    check-cast p1, Lcom/daaw/l70;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/g2$c;->e(Lcom/daaw/l70;Ljava/lang/Object;Lcom/daaw/pj1;ZZ)Z

    move-result p1

    return p1
.end method

.method public e(Lcom/daaw/l70;Ljava/lang/Object;Lcom/daaw/pj1;ZZ)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/l70;",
            "Ljava/lang/Object;",
            "Lcom/daaw/pj1<",
            "Lcom/daaw/l70;",
            ">;ZZ)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method
