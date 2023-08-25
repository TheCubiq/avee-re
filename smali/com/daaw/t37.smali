.class public final Lcom/daaw/t37;
.super Lcom/daaw/l37;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final p:Lcom/daaw/t37;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/t37;

    invoke-direct {v0}, Lcom/daaw/t37;-><init>()V

    sput-object v0, Lcom/daaw/t37;->p:Lcom/daaw/t37;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/l37;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/l37;
    .locals 1

    sget-object v0, Lcom/daaw/j37;->p:Lcom/daaw/j37;

    return-object v0
.end method

.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural().reverse()"

    return-object v0
.end method
