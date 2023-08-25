.class public Lcom/daaw/fv1$a;
.super Landroid/app/Dialog;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fv1;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/fv1;


# direct methods
.method public constructor <init>(Lcom/daaw/fv1;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fv1$a;->p:Lcom/daaw/fv1;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fv1$a;->p:Lcom/daaw/fv1;

    invoke-static {v0}, Lcom/daaw/fv1;->b(Lcom/daaw/fv1;)V

    return-void
.end method
