.class public final Lcom/daaw/og4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/pg4;


# direct methods
.method public constructor <init>(Lcom/daaw/pg4;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/og4;->b:Lcom/daaw/pg4;

    iput-object p2, p0, Lcom/daaw/og4;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 8

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/og4;->b:Lcom/daaw/pg4;

    invoke-static {p1}, Lcom/daaw/pg4;->k(Lcom/daaw/pg4;)Lcom/daaw/aj6;

    move-result-object v7

    invoke-static {p1}, Lcom/daaw/pg4;->l(Lcom/daaw/pg4;)Lcom/daaw/kp6;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/pg4;->f(Lcom/daaw/pg4;)Lcom/daaw/fi6;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/pg4;->e(Lcom/daaw/pg4;)Lcom/daaw/th6;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/og4;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/pg4;->e(Lcom/daaw/pg4;)Lcom/daaw/th6;

    move-result-object p1

    iget-object v6, p1, Lcom/daaw/th6;->d:Ljava/util/List;

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/kp6;->d(Lcom/daaw/fi6;Lcom/daaw/th6;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v7, p1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 8

    iget-object p1, p0, Lcom/daaw/og4;->b:Lcom/daaw/pg4;

    invoke-static {p1}, Lcom/daaw/pg4;->k(Lcom/daaw/pg4;)Lcom/daaw/aj6;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/pg4;->l(Lcom/daaw/pg4;)Lcom/daaw/kp6;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/pg4;->f(Lcom/daaw/pg4;)Lcom/daaw/fi6;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/pg4;->e(Lcom/daaw/pg4;)Lcom/daaw/th6;

    move-result-object v3

    iget-object v5, p0, Lcom/daaw/og4;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/pg4;->e(Lcom/daaw/pg4;)Lcom/daaw/th6;

    move-result-object p1

    iget-object v7, p1, Lcom/daaw/th6;->d:Ljava/util/List;

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/kp6;->d(Lcom/daaw/fi6;Lcom/daaw/th6;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    return-void
.end method
