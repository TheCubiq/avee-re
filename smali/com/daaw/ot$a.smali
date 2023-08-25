.class public Lcom/daaw/ot$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/daaw/ot$a;->p:Lcom/daaw/ot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ot$a;->p:Lcom/daaw/ot;

    invoke-static {v0}, Lcom/daaw/ot;->H1(Lcom/daaw/ot;)Landroid/content/DialogInterface$OnDismissListener;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ot$a;->p:Lcom/daaw/ot;

    invoke-static {v1}, Lcom/daaw/ot;->G1(Lcom/daaw/ot;)Landroid/app/Dialog;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method
