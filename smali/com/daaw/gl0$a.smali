.class public abstract Lcom/daaw/gl0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gl0;
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
.method public abstract a()Lcom/daaw/gl0;
.end method

.method public abstract b(Lcom/daaw/uf;)Lcom/daaw/gl0$a;
.end method

.method public abstract c(Ljava/util/List;)Lcom/daaw/gl0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/cl0;",
            ">;)",
            "Lcom/daaw/gl0$a;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/Integer;)Lcom/daaw/gl0$a;
.end method

.method public abstract e(Ljava/lang/String;)Lcom/daaw/gl0$a;
.end method

.method public abstract f(Lcom/daaw/h01;)Lcom/daaw/gl0$a;
.end method

.method public abstract g(J)Lcom/daaw/gl0$a;
.end method

.method public abstract h(J)Lcom/daaw/gl0$a;
.end method

.method public i(I)Lcom/daaw/gl0$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/gl0$a;->d(Ljava/lang/Integer;)Lcom/daaw/gl0$a;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lcom/daaw/gl0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/gl0$a;->e(Ljava/lang/String;)Lcom/daaw/gl0$a;

    move-result-object p1

    return-object p1
.end method
