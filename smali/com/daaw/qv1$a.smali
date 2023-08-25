.class public Lcom/daaw/qv1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


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
        "Lcom/daaw/rw1$a<",
        "Ljava/lang/Integer;",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;

.field public final synthetic b:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$a;->b:Lcom/daaw/qv1;

    iput-object p2, p0, Lcom/daaw/qv1$a;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Landroid/app/Activity;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/qv1$a;->a:Lcom/daaw/xw0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/xw0;->i(Ljava/lang/Integer;Landroid/app/Activity;Z)V

    iget-object p1, p0, Lcom/daaw/qv1$a;->b:Lcom/daaw/qv1;

    new-instance p2, Lcom/daaw/wf1;

    invoke-direct {p2}, Lcom/daaw/wf1;-><init>()V

    invoke-static {p1, v1, p2, v1}, Lcom/daaw/qv1;->N(Lcom/daaw/qv1;ZLcom/daaw/wf1;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/qv1$a;->a:Lcom/daaw/xw0;

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/xw0;->i(Ljava/lang/Integer;Landroid/app/Activity;Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qv1$a;->a(Ljava/lang/Integer;Landroid/app/Activity;)V

    return-void
.end method
