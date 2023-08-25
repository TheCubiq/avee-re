.class public Lcom/daaw/n81;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static r:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/yx0$p;",
            ">;"
        }
    .end annotation
.end field

.field public static s:Lcom/daaw/pw1;

.field public static t:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/yx0$p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public p:Landroid/widget/TextView;

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/n81;->r:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/n81;->s:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/n81;->t:Lcom/daaw/qw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/n81;->q:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/n81;Lcom/daaw/yx0$p;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/n81;->e(Lcom/daaw/yx0$p;)V

    return-void
.end method

.method public static b(Lcom/daaw/al;)Lcom/daaw/n81;
    .locals 2

    new-instance v0, Lcom/daaw/n81;

    invoke-direct {v0}, Lcom/daaw/n81;-><init>()V

    const-string v1, "ScanPlaylistFilesDialog"

    invoke-static {v0, v1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object v0
.end method

.method public static d(Lcom/daaw/yx0$p;)V
    .locals 1

    sget-object v0, Lcom/daaw/n81;->t:Lcom/daaw/qw1;

    invoke-virtual {v0, p0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n81;->p:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final e(Lcom/daaw/yx0$p;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/n81;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lcom/daaw/yx0$p;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/n81;->p:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/daaw/yx0$p;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/n81;->p:Landroid/widget/TextView;

    const-string v0, ".."

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lcom/daaw/gr1;->j(Landroid/app/DialogFragment;)V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lcom/daaw/n81;->t:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/n81$b;

    invoke-direct {v0, p0}, Lcom/daaw/n81$b;-><init>(Lcom/daaw/n81;)V

    iget-object v1, p0, Lcom/daaw/n81;->q:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c0066

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0902e2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/n81;->p:Landroid/widget/TextView;

    const v0, 0x7f1000b7

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    new-instance v0, Lcom/daaw/n81$a;

    invoke-direct {v0, p0}, Lcom/daaw/n81$a;-><init>(Lcom/daaw/n81;)V

    const v1, 0x7f1000a6

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    sget-object v0, Lcom/daaw/n81;->r:Lcom/daaw/vw1;

    invoke-virtual {v0, v2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/yx0$p;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/n81;->e(Lcom/daaw/yx0$p;)V

    :cond_0
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/daaw/n81;->t:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/n81;->q:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->c(Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/n81;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method
