.class public Lcom/daaw/pv1$a0;
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
        "Ljava/lang/Integer;",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$a0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/daaw/pv1$a0;->a:Lcom/daaw/pv1;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/daaw/pv1;->p(Lcom/daaw/pv1;Z)Z

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v0, Lcom/daaw/j5;->o:I

    invoke-virtual {p1, v0}, Lcom/daaw/j5;->h(I)Z

    move-result p1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->q0()Lcom/daaw/o30;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/pv1$a0;->a:Lcom/daaw/pv1;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/pv1;->p(Lcom/daaw/pv1;Z)Z

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v0, Lcom/daaw/j5;->o:I

    invoke-virtual {p1, v0}, Lcom/daaw/j5;->h(I)Z

    move-result p1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->q0()Lcom/daaw/o30;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-virtual {v0, p2, p1}, Lcom/daaw/o30;->m(ZZ)V

    :cond_1
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1$a0;->a(Ljava/lang/Integer;Landroid/app/Activity;)V

    return-void
.end method
