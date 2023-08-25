.class public Lcom/daaw/xw0$l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;->l(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$l0;->q:Lcom/daaw/xw0;

    iput-boolean p2, p0, Lcom/daaw/xw0$l0;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lcom/daaw/xw0$l0;->p:Z

    if-nez v1, :cond_1

    iget v1, v0, Lcom/daaw/avee/MainActivity;->N:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    sget-boolean v1, Lcom/daaw/xw0;->d:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-boolean v2, p0, Lcom/daaw/xw0$l0;->p:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/MainActivity;->K0(ZZ)V

    :cond_2
    return-void
.end method
