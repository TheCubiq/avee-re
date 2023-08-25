.class public Lcom/daaw/am1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/am1;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/am1;


# direct methods
.method public constructor <init>(Lcom/daaw/am1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/am1$a;->p:Lcom/daaw/am1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget p2, Lcom/daaw/j5;->t:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/daaw/j5;->a0(IZ)V

    return-void
.end method
