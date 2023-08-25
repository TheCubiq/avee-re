.class public final synthetic Lcom/daaw/gs6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ob7;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ob7;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gs6;->p:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/gs6;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/gs6;->r:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/gs6;->p:Lcom/daaw/ob7;

    iget-object v1, p0, Lcom/daaw/gs6;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/gs6;->r:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ob7;->i3(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
