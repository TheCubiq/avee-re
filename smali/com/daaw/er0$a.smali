.class public Lcom/daaw/er0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/er0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L1:Ljava/lang/Object;",
        "L2:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/w40<",
        "Lcom/daaw/er0<",
        "T",
        "L1;",
        "T",
        "L2;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/er0$a;->b()Lcom/daaw/er0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/er0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/er0<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0;

    invoke-direct {v0}, Lcom/daaw/er0;-><init>()V

    return-object v0
.end method
