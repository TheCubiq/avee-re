.class public Lcom/daaw/hj0$z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/er0<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;",
        "Lcom/daaw/be0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$z;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/er0;Lcom/daaw/be0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;",
            "Lcom/daaw/be0;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/avee/MainActivity;->p0()Lcom/daaw/n30;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lcom/daaw/n30;->v(Lcom/daaw/er0;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/er0;

    check-cast p2, Lcom/daaw/be0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/hj0$z;->a(Lcom/daaw/er0;Lcom/daaw/be0;)V

    return-void
.end method
