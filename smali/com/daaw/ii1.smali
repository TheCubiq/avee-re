.class public Lcom/daaw/ii1;
.super Landroidx/fragment/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ii1$b;
    }
.end annotation


# instance fields
.field public q0:Lcom/daaw/r41;

.field public final r0:Lcom/daaw/r0;

.field public final s0:Lcom/daaw/u41;

.field public final t0:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/daaw/ii1;",
            ">;"
        }
    .end annotation
.end field

.field public u0:Lcom/daaw/ii1;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/daaw/r0;

    invoke-direct {v0}, Lcom/daaw/r0;-><init>()V

    invoke-direct {p0, v0}, Lcom/daaw/ii1;-><init>(Lcom/daaw/r0;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/r0;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lcom/daaw/ii1$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/ii1$b;-><init>(Lcom/daaw/ii1;Lcom/daaw/ii1$a;)V

    iput-object v0, p0, Lcom/daaw/ii1;->s0:Lcom/daaw/u41;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/ii1;->t0:Ljava/util/HashSet;

    iput-object p1, p0, Lcom/daaw/ii1;->r0:Lcom/daaw/r0;

    return-void
.end method


# virtual methods
.method public final G1(Lcom/daaw/ii1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ii1;->t0:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public H1()Lcom/daaw/r0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ii1;->r0:Lcom/daaw/r0;

    return-object v0
.end method

.method public I1()Lcom/daaw/r41;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ii1;->q0:Lcom/daaw/r41;

    return-object v0
.end method

.method public J1()Lcom/daaw/u41;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ii1;->s0:Lcom/daaw/u41;

    return-object v0
.end method

.method public final K1(Lcom/daaw/ii1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ii1;->t0:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public L0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->L0()V

    iget-object v0, p0, Lcom/daaw/ii1;->r0:Lcom/daaw/r0;

    invoke-virtual {v0}, Lcom/daaw/r0;->c()V

    return-void
.end method

.method public L1(Lcom/daaw/r41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ii1;->q0:Lcom/daaw/r41;

    return-void
.end method

.method public M0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->M0()V

    iget-object v0, p0, Lcom/daaw/ii1;->r0:Lcom/daaw/r0;

    invoke-virtual {v0}, Lcom/daaw/r0;->d()V

    return-void
.end method

.method public k0(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->k0(Landroid/app/Activity;)V

    :try_start_0
    invoke-static {}, Lcom/daaw/t41;->f()Lcom/daaw/t41;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()Lcom/daaw/p30;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p30;->x()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/t41;->i(Landroidx/fragment/app/FragmentManager;)Lcom/daaw/ii1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ii1;->u0:Lcom/daaw/ii1;

    if-eq p1, p0, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/ii1;->G1(Lcom/daaw/ii1;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onLowMemory()V

    iget-object v0, p0, Lcom/daaw/ii1;->q0:Lcom/daaw/r41;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/r41;->w()V

    :cond_0
    return-void
.end method

.method public t0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->t0()V

    iget-object v0, p0, Lcom/daaw/ii1;->r0:Lcom/daaw/r0;

    invoke-virtual {v0}, Lcom/daaw/r0;->b()V

    return-void
.end method

.method public w0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->w0()V

    iget-object v0, p0, Lcom/daaw/ii1;->u0:Lcom/daaw/ii1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/daaw/ii1;->K1(Lcom/daaw/ii1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ii1;->u0:Lcom/daaw/ii1;

    :cond_0
    return-void
.end method
