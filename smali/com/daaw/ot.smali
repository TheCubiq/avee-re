.class public Lcom/daaw/ot;
.super Landroidx/fragment/app/Fragment;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public A0:Lcom/daaw/qt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qt0<",
            "Lcom/daaw/sj0;",
            ">;"
        }
    .end annotation
.end field

.field public B0:Landroid/app/Dialog;

.field public C0:Z

.field public D0:Z

.field public E0:Z

.field public F0:Z

.field public q0:Landroid/os/Handler;

.field public r0:Ljava/lang/Runnable;

.field public s0:Landroid/content/DialogInterface$OnCancelListener;

.field public t0:Landroid/content/DialogInterface$OnDismissListener;

.field public u0:I

.field public v0:I

.field public w0:Z

.field public x0:Z

.field public y0:I

.field public z0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lcom/daaw/ot$a;

    invoke-direct {v0, p0}, Lcom/daaw/ot$a;-><init>(Lcom/daaw/ot;)V

    iput-object v0, p0, Lcom/daaw/ot;->r0:Ljava/lang/Runnable;

    new-instance v0, Lcom/daaw/ot$b;

    invoke-direct {v0, p0}, Lcom/daaw/ot$b;-><init>(Lcom/daaw/ot;)V

    iput-object v0, p0, Lcom/daaw/ot;->s0:Landroid/content/DialogInterface$OnCancelListener;

    new-instance v0, Lcom/daaw/ot$c;

    invoke-direct {v0, p0}, Lcom/daaw/ot$c;-><init>(Lcom/daaw/ot;)V

    iput-object v0, p0, Lcom/daaw/ot;->t0:Landroid/content/DialogInterface$OnDismissListener;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ot;->u0:I

    iput v0, p0, Lcom/daaw/ot;->v0:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/ot;->w0:Z

    iput-boolean v1, p0, Lcom/daaw/ot;->x0:Z

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/ot;->y0:I

    new-instance v1, Lcom/daaw/ot$d;

    invoke-direct {v1, p0}, Lcom/daaw/ot$d;-><init>(Lcom/daaw/ot;)V

    iput-object v1, p0, Lcom/daaw/ot;->A0:Lcom/daaw/qt0;

    iput-boolean v0, p0, Lcom/daaw/ot;->F0:Z

    return-void
.end method

.method public static synthetic G1(Lcom/daaw/ot;)Landroid/app/Dialog;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    return-object p0
.end method

.method public static synthetic H1(Lcom/daaw/ot;)Landroid/content/DialogInterface$OnDismissListener;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ot;->t0:Landroid/content/DialogInterface$OnDismissListener;

    return-object p0
.end method

.method public static synthetic I1(Lcom/daaw/ot;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/ot;->x0:Z

    return p0
.end method


# virtual methods
.method public J1()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lcom/daaw/ot;->K1(ZZ)V

    return-void
.end method

.method public K0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->K0(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "android:dialogShowing"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, Lcom/daaw/ot;->u0:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, Lcom/daaw/ot;->v0:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/ot;->w0:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, Lcom/daaw/ot;->x0:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, Lcom/daaw/ot;->y0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public final K1(ZZ)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ot;->D0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ot;->D0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/ot;->E0:Z

    iget-object v1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v1, p0, Lcom/daaw/ot;->q0:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Lcom/daaw/ot;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/ot;->q0:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/ot;->r0:Ljava/lang/Runnable;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ot;->C0:Z

    iget p2, p0, Lcom/daaw/ot;->y0:I

    if-ltz p2, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->H()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    iget p2, p0, Lcom/daaw/ot;->y0:I

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/FragmentManager;->T0(II)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/ot;->y0:I

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->H()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->l()Landroidx/fragment/app/j;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroidx/fragment/app/j;->l(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/j;

    if-eqz p1, :cond_4

    invoke-virtual {p2}, Landroidx/fragment/app/j;->g()I

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Landroidx/fragment/app/j;->f()I

    :goto_1
    return-void
.end method

.method public L0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->L0()V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/ot;->C0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/daaw/bu1;->a(Landroid/view/View;Lcom/daaw/sj0;)V

    invoke-static {v0, p0}, Lcom/daaw/eu1;->a(Landroid/view/View;Lcom/daaw/nt1;)V

    invoke-static {v0, p0}, Lcom/daaw/du1;->a(Landroid/view/View;Lcom/daaw/m81;)V

    :cond_0
    return-void
.end method

.method public L1()Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    return-object v0
.end method

.method public M0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->M0()V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public M1()I
    .locals 1

    iget v0, p0, Lcom/daaw/ot;->v0:I

    return v0
.end method

.method public N1(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onCreateDialog called for DialogFragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ot;->M1()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public O0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->O0(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public O1(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public P1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ot;->F0:Z

    return v0
.end method

.method public final Q1(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ot;->x0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/ot;->F0:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/daaw/ot;->z0:Z

    invoke-virtual {p0, p1}, Lcom/daaw/ot;->N1(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    iget-boolean v2, p0, Lcom/daaw/ot;->x0:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/daaw/ot;->u0:I

    invoke-virtual {p0, p1, v2}, Lcom/daaw/ot;->T1(Landroid/app/Dialog;I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/content/Context;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    iget-boolean v2, p0, Lcom/daaw/ot;->w0:Z

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    iget-object v2, p0, Lcom/daaw/ot;->s0:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    iget-object v2, p0, Lcom/daaw/ot;->t0:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-boolean v1, p0, Lcom/daaw/ot;->F0:Z

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ot;->z0:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Lcom/daaw/ot;->z0:Z

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final R1()Landroid/app/Dialog;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ot;->L1()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DialogFragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not have a Dialog."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public S1(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ot;->x0:Z

    return-void
.end method

.method public T1(Landroid/app/Dialog;I)V
    .locals 2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    const/16 v1, 0x18

    invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_0
    return-void
.end method

.method public U1(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ot;->D0:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ot;->E0:Z

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->l()Landroidx/fragment/app/j;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/j;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/j;

    invoke-virtual {p1}, Landroidx/fragment/app/j;->f()I

    return-void
.end method

.method public V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->W:Landroid/view/View;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public j()Lcom/daaw/r30;
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->j()Lcom/daaw/r30;

    move-result-object v0

    new-instance v1, Lcom/daaw/ot$e;

    invoke-direct {v1, p0, v0}, Lcom/daaw/ot$e;-><init>(Lcom/daaw/ot;Lcom/daaw/r30;)V

    return-object v1
.end method

.method public l0(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->l0(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->W()Landroidx/lifecycle/LiveData;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/ot;->A0:Lcom/daaw/qt0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData;->e(Lcom/daaw/qt0;)V

    iget-boolean p1, p0, Lcom/daaw/ot;->E0:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/ot;->D0:Z

    :cond_0
    return-void
.end method

.method public o0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->o0(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/ot;->q0:Landroid/os/Handler;

    iget v0, p0, Landroidx/fragment/app/Fragment;->M:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ot;->x0:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/ot;->u0:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/ot;->v0:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/ot;->w0:Z

    iget-boolean v0, p0, Lcom/daaw/ot;->x0:Z

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/ot;->x0:Z

    const/4 v0, -0x1

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/daaw/ot;->y0:I

    :cond_1
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-boolean p1, p0, Lcom/daaw/ot;->C0:Z

    if-nez p1, :cond_1

    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onDismiss called for DialogFragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Lcom/daaw/ot;->K1(ZZ)V

    :cond_1
    return-void
.end method

.method public v0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->v0()V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/ot;->C0:Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v0, p0, Lcom/daaw/ot;->D0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    invoke-virtual {p0, v0}, Lcom/daaw/ot;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ot;->F0:Z

    :cond_1
    return-void
.end method

.method public w0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->w0()V

    iget-boolean v0, p0, Lcom/daaw/ot;->E0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/ot;->D0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ot;->D0:Z

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->W()Landroidx/lifecycle/LiveData;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ot;->A0:Lcom/daaw/qt0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->i(Lcom/daaw/qt0;)V

    return-void
.end method

.method public x0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->x0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/ot;->x0:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/daaw/ot;->z0:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/ot;->Q1(Landroid/os/Bundle;)V

    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get layout inflater for DialogFragment "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from dialog context"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object p1, p0, Lcom/daaw/ot;->B0:Landroid/app/Dialog;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getting layout inflater for DialogFragment "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-boolean v1, p0, Lcom/daaw/ot;->x0:Z

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mShowsDialog = false: "

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCreatingDialog = true: "

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    return-object v0
.end method
