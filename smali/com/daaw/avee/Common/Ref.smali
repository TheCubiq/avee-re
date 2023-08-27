.class public Lcom/daaw/avee/Common/Ref;
.super Ljava/lang/Object;
.source "Ref.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public obj:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public Drop()Lcom/daaw/avee/Common/Ref;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Ref<",
            "TT;>;"
        }
    .end annotation

    .line 18
    new-instance v0, Lcom/daaw/avee/Common/Ref;

    iget-object v1, p0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    return-object v0
.end method
