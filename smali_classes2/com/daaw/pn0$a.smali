.class public Lcom/daaw/pn0$a;
.super Lcom/daaw/ju0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pn0;->s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ju0<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pn0;


# direct methods
.method public constructor <init>(Lcom/daaw/pn0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pn0$a;->a:Lcom/daaw/pn0;

    invoke-direct {p0}, Lcom/daaw/ju0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pn0$a;->a:Lcom/daaw/pn0;

    iget-object v0, v0, Lcom/daaw/qw0;->q0:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ju0;

    invoke-virtual {v1, p1}, Lcom/daaw/ju0;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
