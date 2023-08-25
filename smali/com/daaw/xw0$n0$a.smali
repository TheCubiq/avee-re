.class public Lcom/daaw/xw0$n0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0$n0;->b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/tx0$b;

.field public final synthetic q:Lcom/daaw/xw0$n0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0$n0;Lcom/daaw/tx0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$n0$a;->q:Lcom/daaw/xw0$n0;

    iput-object p2, p0, Lcom/daaw/xw0$n0$a;->p:Lcom/daaw/tx0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/xw0$n0$a;->p:Lcom/daaw/tx0$b;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/MainActivity;->Q0(Lcom/daaw/tx0$b;)V

    :cond_0
    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/daaw/xw0;->g:Lcom/daaw/tx0$b;

    sget-object v2, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ko0;->I(Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V

    :cond_1
    return-void
.end method
