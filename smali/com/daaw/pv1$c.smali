.class public Lcom/daaw/pv1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/af0;",
        "Lcom/daaw/h2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$c;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/af0;Lcom/daaw/h2;)V
    .locals 13

    new-instance v5, Lcom/daaw/pv1$c$a;

    invoke-direct {v5, p0, p1}, Lcom/daaw/pv1$c$a;-><init>(Lcom/daaw/pv1$c;Lcom/daaw/af0;)V

    invoke-interface {p1, v5}, Lcom/daaw/af0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v0, Lcom/daaw/j5;->I:I

    invoke-virtual {p1, v0}, Lcom/daaw/j5;->k(I)I

    move-result p1

    new-instance v0, Lcom/daaw/g2;

    invoke-direct {v0}, Lcom/daaw/g2;-><init>()V

    const/4 v1, 0x0

    iget-object v2, p2, Lcom/daaw/i2;->a:Landroid/net/Uri;

    iget-object v3, p2, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v4, p2, Lcom/daaw/i2;->c:Ljava/lang/String;

    iget v6, p2, Lcom/daaw/h2;->d:I

    iget v7, p2, Lcom/daaw/h2;->e:I

    iget v8, p2, Lcom/daaw/h2;->h:I

    iget v9, p2, Lcom/daaw/h2;->i:I

    const/4 v10, 0x0

    iget-object v11, p2, Lcom/daaw/h2;->k:Lcom/daaw/ye0;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {v0 .. v12}, Lcom/daaw/g2;->v(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/af0;

    check-cast p2, Lcom/daaw/h2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1$c;->a(Lcom/daaw/af0;Lcom/daaw/h2;)V

    return-void
.end method
