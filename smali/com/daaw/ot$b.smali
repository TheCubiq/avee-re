.class public Lcom/daaw/ot$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ot;


# direct methods
.method public constructor <init>(Lcom/daaw/ot;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ot$b;->p:Lcom/daaw/ot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/ot$b;->p:Lcom/daaw/ot;

    invoke-static {p1}, Lcom/daaw/ot;->G1(Lcom/daaw/ot;)Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ot$b;->p:Lcom/daaw/ot;

    invoke-static {p1}, Lcom/daaw/ot;->G1(Lcom/daaw/ot;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/ot;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
