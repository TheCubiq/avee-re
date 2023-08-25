.class public Lcom/daaw/xw0$b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


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
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/lo1<",
        "Lcom/daaw/tx0$b;",
        "Lcom/daaw/hx0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$b0;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/xw0$b0;->b()Lcom/daaw/lo1;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0$b;",
            "Lcom/daaw/hx0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lo1;

    sget-object v1, Lcom/daaw/xw0;->g:Lcom/daaw/tx0$b;

    sget-object v2, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    invoke-direct {v0, v1, v2}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
