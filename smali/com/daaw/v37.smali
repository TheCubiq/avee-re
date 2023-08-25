.class public Lcom/daaw/v37;
.super Lcom/daaw/l07;
.source ""

# interfaces
.implements Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/daaw/ty6;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/l07;-><init>(Ljava/util/Collection;Lcom/daaw/ty6;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lcom/daaw/y37;->c(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/daaw/y37;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method
