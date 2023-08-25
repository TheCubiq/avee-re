.class public Lcom/daaw/ox0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ox0;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ox0;


# direct methods
.method public constructor <init>(Lcom/daaw/ox0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ox0$c;->p:Lcom/daaw/ox0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/app/Activity;[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/ox0$c;->b(Landroid/app/Activity;[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic b(Landroid/app/Activity;[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    sget-object p3, Lcom/daaw/ox0;->A:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/al;

    invoke-direct {v0, p0}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p3, p1, p2, v0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ox0$c;->p:Lcom/daaw/ox0;

    iget-boolean p2, p1, Lcom/daaw/ox0;->s:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/daaw/ox0;->r:Z

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/ox0$c;->p:Lcom/daaw/ox0;

    new-instance v0, Lcom/daaw/qx0;

    invoke-direct {v0, p1}, Lcom/daaw/qx0;-><init>(Landroid/app/Activity;)V

    invoke-static {p2, v0}, Lcom/daaw/ox0;->a(Lcom/daaw/ox0;Lcom/daaw/g0;)V

    return-void
.end method
