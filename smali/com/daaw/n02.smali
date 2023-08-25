.class public final Lcom/daaw/n02;
.super Lcom/daaw/wz1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/daaw/k3$d;",
        ">",
        "Lcom/daaw/wz1;"
    }
.end annotation


# instance fields
.field public final c:Lcom/daaw/v70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v70<",
            "TO;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/v70;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v70<",
            "TO;>;)V"
        }
    .end annotation

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, Lcom/daaw/wz1;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/n02;->c:Lcom/daaw/v70;

    return-void
.end method
