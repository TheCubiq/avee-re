.class public Lcom/daaw/st$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/st;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lcom/daaw/st;


# direct methods
.method public constructor <init>(Lcom/daaw/st;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/st$h;->q:Lcom/daaw/st;

    iput-object p2, p0, Lcom/daaw/st$h;->p:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/st$h;->q:Lcom/daaw/st;

    invoke-static {p1}, Lcom/daaw/st;->e(Lcom/daaw/st;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/st$h;->p:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lcom/daaw/st;->f(Lcom/daaw/st;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
