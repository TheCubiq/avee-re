.class public Lcom/daaw/s41;
.super Landroid/app/Fragment;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/s41$b;
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/r0;

.field public final q:Lcom/daaw/u41;

.field public r:Lcom/daaw/r41;

.field public final s:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/daaw/s41;",
            ">;"
        }
    .end annotation
.end field

.field public t:Lcom/daaw/s41;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/daaw/r0;

    invoke-direct {v0}, Lcom/daaw/r0;-><init>()V

    invoke-direct {p0, v0}, Lcom/daaw/s41;-><init>(Lcom/daaw/r0;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/r0;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    new-instance v0, Lcom/daaw/s41$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/s41$b;-><init>(Lcom/daaw/s41;Lcom/daaw/s41$a;)V

    iput-object v0, p0, Lcom/daaw/s41;->q:Lcom/daaw/u41;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/s41;->s:Ljava/util/HashSet;

    iput-object p1, p0, Lcom/daaw/s41;->p:Lcom/daaw/r0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/s41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->s:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Lcom/daaw/r0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->p:Lcom/daaw/r0;

    return-object v0
.end method

.method public c()Lcom/daaw/r41;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->r:Lcom/daaw/r41;

    return-object v0
.end method

.method public d()Lcom/daaw/u41;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->q:Lcom/daaw/u41;

    return-object v0
.end method

.method public final e(Lcom/daaw/s41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->s:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lcom/daaw/r41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/s41;->r:Lcom/daaw/r41;

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    :try_start_0
    invoke-static {}, Lcom/daaw/t41;->f()Lcom/daaw/t41;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/t41;->h(Landroid/app/FragmentManager;)Lcom/daaw/s41;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/s41;->t:Lcom/daaw/s41;

    if-eq p1, p0, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/s41;->a(Lcom/daaw/s41;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/daaw/s41;->p:Lcom/daaw/r0;

    invoke-virtual {v0}, Lcom/daaw/r0;->b()V

    return-void
.end method

.method public onDetach()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDetach()V

    iget-object v0, p0, Lcom/daaw/s41;->t:Lcom/daaw/s41;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/daaw/s41;->e(Lcom/daaw/s41;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/s41;->t:Lcom/daaw/s41;

    :cond_0
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->r:Lcom/daaw/r41;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/r41;->w()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/daaw/s41;->p:Lcom/daaw/r0;

    invoke-virtual {v0}, Lcom/daaw/r0;->c()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/daaw/s41;->p:Lcom/daaw/r0;

    invoke-virtual {v0}, Lcom/daaw/r0;->d()V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s41;->r:Lcom/daaw/r41;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/r41;->x(I)V

    :cond_0
    return-void
.end method
