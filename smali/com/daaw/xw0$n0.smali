.class public Lcom/daaw/xw0$n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;-><init>(Lcom/daaw/uf1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        "Lcom/daaw/tx0$b;",
        "Lcom/daaw/hx0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$n0;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/tx0;

    check-cast p2, Lcom/daaw/vd0;

    check-cast p3, Lcom/daaw/tx0$b;

    check-cast p4, Lcom/daaw/hx0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/xw0$n0;->b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V

    return-void
.end method

.method public b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V
    .locals 0

    sput-object p1, Lcom/daaw/xw0;->f:Lcom/daaw/tx0;

    sput-object p4, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    sput-object p3, Lcom/daaw/xw0;->g:Lcom/daaw/tx0$b;

    iget-object p1, p0, Lcom/daaw/xw0$n0;->a:Lcom/daaw/xw0;

    invoke-static {p1}, Lcom/daaw/xw0;->b(Lcom/daaw/xw0;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/xw0$n0$a;

    invoke-direct {p2, p0, p3}, Lcom/daaw/xw0$n0$a;-><init>(Lcom/daaw/xw0$n0;Lcom/daaw/tx0$b;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
