.class public abstract Lcom/daaw/s81$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/s81$b;
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
.method public abstract a()Lcom/daaw/s81$b;
.end method

.method public abstract b(J)Lcom/daaw/s81$b$a;
.end method

.method public abstract c(Ljava/util/Set;)Lcom/daaw/s81$b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/daaw/s81$c;",
            ">;)",
            "Lcom/daaw/s81$b$a;"
        }
    .end annotation
.end method

.method public abstract d(J)Lcom/daaw/s81$b$a;
.end method
