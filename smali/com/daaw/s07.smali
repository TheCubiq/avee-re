.class public final Lcom/daaw/s07;
.super Lcom/daaw/m32;
.source ""


# instance fields
.field public final synthetic g:Lcom/daaw/pa;


# direct methods
.method public constructor <init>(Lcom/daaw/pa;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/m32;-><init>(Lcom/daaw/pa;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    invoke-virtual {v0}, Lcom/daaw/pa;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    invoke-static {v0}, Lcom/daaw/pa;->H(Lcom/daaw/pa;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lcom/daaw/pa;->D(Lcom/daaw/pa;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    iget-object v0, v0, Lcom/daaw/pa;->p:Lcom/daaw/pa$c;

    invoke-interface {v0, p1}, Lcom/daaw/pa$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    invoke-virtual {v0, p1}, Lcom/daaw/pa;->p(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/s07;->g:Lcom/daaw/pa;

    iget-object v0, v0, Lcom/daaw/pa;->p:Lcom/daaw/pa$c;

    sget-object v1, Lcom/google/android/gms/common/ConnectionResult;->t:Lcom/google/android/gms/common/ConnectionResult;

    invoke-interface {v0, v1}, Lcom/daaw/pa$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x1

    return v0
.end method
