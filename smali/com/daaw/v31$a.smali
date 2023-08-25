.class public Lcom/daaw/v31$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/v31;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/EditText;

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/v31;


# direct methods
.method public constructor <init>(Lcom/daaw/v31;Landroid/widget/EditText;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v31$a;->r:Lcom/daaw/v31;

    iput-object p2, p0, Lcom/daaw/v31$a;->p:Landroid/widget/EditText;

    iput-wide p3, p0, Lcom/daaw/v31$a;->q:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    sget-object p1, Lcom/daaw/v31;->p:Lcom/daaw/sw1;

    iget-object p2, p0, Lcom/daaw/v31$a;->p:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-wide v0, p0, Lcom/daaw/v31$a;->q:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/v31$a;->p:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
