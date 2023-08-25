.class public abstract Lcom/daaw/l37;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/util/Comparator;)Lcom/daaw/l37;
    .locals 1

    instance-of v0, p0, Lcom/daaw/l37;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/l37;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/k17;

    invoke-direct {v0, p0}, Lcom/daaw/k17;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static c()Lcom/daaw/l37;
    .locals 1

    sget-object v0, Lcom/daaw/j37;->p:Lcom/daaw/j37;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/daaw/l37;
    .locals 1

    new-instance v0, Lcom/daaw/u37;

    invoke-direct {v0, p0}, Lcom/daaw/u37;-><init>(Lcom/daaw/l37;)V

    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method
