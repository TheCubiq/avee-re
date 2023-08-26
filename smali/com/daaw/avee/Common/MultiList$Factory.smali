.class public Lcom/daaw/avee/Common/MultiList$Factory;
.super Ljava/lang/Object;
.source "MultiList.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/MultiList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L1:Ljava/lang/Object;",
        "L2:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func<",
        "Lcom/daaw/avee/Common/MultiList<",
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

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Lcom/daaw/avee/Common/MultiList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList<",
            "T",
            "L1;",
            "T",
            "L2;",
            ">;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    return-object v0
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/daaw/avee/Common/MultiList$Factory;->onInvoke()Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    return-object v0
.end method
