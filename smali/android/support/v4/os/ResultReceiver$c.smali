.class public Landroid/support/v4/os/ResultReceiver$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/os/ResultReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final p:I

.field public final q:Landroid/os/Bundle;

.field public final synthetic r:Landroid/support/v4/os/ResultReceiver;


# direct methods
.method public constructor <init>(Landroid/support/v4/os/ResultReceiver;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/os/ResultReceiver$c;->r:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroid/support/v4/os/ResultReceiver$c;->p:I

    iput-object p3, p0, Landroid/support/v4/os/ResultReceiver$c;->q:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/os/ResultReceiver$c;->r:Landroid/support/v4/os/ResultReceiver;

    iget v1, p0, Landroid/support/v4/os/ResultReceiver$c;->p:I

    iget-object v2, p0, Landroid/support/v4/os/ResultReceiver$c;->q:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/os/ResultReceiver;->a(ILandroid/os/Bundle;)V

    return-void
.end method
