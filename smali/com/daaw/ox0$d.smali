.class public Lcom/daaw/ox0$d;
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

    iput-object p1, p0, Lcom/daaw/ox0$d;->p:Lcom/daaw/ox0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/ox0$d;->p:Lcom/daaw/ox0;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/daaw/ox0;->r:Z

    return-void
.end method
