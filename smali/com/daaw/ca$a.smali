.class public abstract Lcom/daaw/ca$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/daaw/ca;
.end method

.method public abstract b(Ljava/lang/Iterable;)Lcom/daaw/ca$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/daaw/by;",
            ">;)",
            "Lcom/daaw/ca$a;"
        }
    .end annotation
.end method

.method public abstract c([B)Lcom/daaw/ca$a;
.end method
