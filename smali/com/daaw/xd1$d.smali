.class public Lcom/daaw/xd1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xd1;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/xd1;


# direct methods
.method public constructor <init>(Lcom/daaw/xd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xd1$d;->p:Lcom/daaw/xd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/xd1$d;->p:Lcom/daaw/xd1;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/daaw/xd1;->e(Z)V

    return-void
.end method
