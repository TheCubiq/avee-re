.class public Lcom/daaw/ui$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ui;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ui;


# direct methods
.method public constructor <init>(Lcom/daaw/ui;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ui$f;->a:Lcom/daaw/ui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 5

    invoke-static {}, Lcom/daaw/s70;->c()Lcom/daaw/s70;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->o0()Lcom/daaw/m30;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/daaw/m30;->n()Lcom/daaw/m91;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    invoke-static {}, Lcom/daaw/avee/MainActivity;->p0()Lcom/daaw/n30;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/daaw/n30;->m()Lcom/daaw/m91;

    move-result-object v1

    :cond_2
    :goto_0
    sget-object v2, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    if-eq v1, v2, :cond_4

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-boolean v3, v1, Lcom/daaw/m91;->a:Z

    iget-object v4, v1, Lcom/daaw/m91;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/daaw/s70;->i(IZLjava/lang/String;Lcom/daaw/sd0;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/daaw/s70;->i(IZLjava/lang/String;Lcom/daaw/sd0;)V

    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/s70;->h(I)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/ui$f;->a(Ljava/lang/Integer;)V

    return-void
.end method
