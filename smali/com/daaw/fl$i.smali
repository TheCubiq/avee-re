.class public Lcom/daaw/fl$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fl;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "[",
        "Lcom/daaw/l0;",
        "Ljava/lang/Boolean;",
        "Lcom/daaw/jh0$a<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$i;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/daaw/l0;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Lcom/daaw/jh0$a;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/fl$i;->b([Lcom/daaw/l0;Ljava/lang/Boolean;Lcom/daaw/jh0$a;)V

    return-void
.end method

.method public b([Lcom/daaw/l0;Ljava/lang/Boolean;Lcom/daaw/jh0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/l0;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/el;->j()Lcom/daaw/el;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/el;->l([Lcom/daaw/l0;Ljava/lang/Boolean;Lcom/daaw/jh0$a;)V

    :cond_0
    return-void
.end method
