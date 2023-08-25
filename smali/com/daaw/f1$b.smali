.class public Lcom/daaw/f1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/f1;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/EditText;

.field public final synthetic q:Lcom/daaw/f1;


# direct methods
.method public constructor <init>(Lcom/daaw/f1;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f1$b;->q:Lcom/daaw/f1;

    iput-object p2, p0, Lcom/daaw/f1$b;->p:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    sget-object p1, Lcom/daaw/f1;->q:Lcom/daaw/rw1;

    new-instance p2, Lcom/daaw/al;

    iget-object v0, p0, Lcom/daaw/f1$b;->p:Landroid/widget/EditText;

    invoke-direct {p2, v0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/f1$b;->p:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
