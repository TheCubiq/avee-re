.class public final synthetic Lcom/daaw/ou8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/ou8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ou8;

    invoke-direct {v0}, Lcom/daaw/ou8;-><init>()V

    sput-object v0, Lcom/daaw/ou8;->p:Lcom/daaw/ou8;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lcom/daaw/n17;->i()Lcom/daaw/n17;

    move-result-object v0

    sget-object v1, Lcom/daaw/ov8;->p:Lcom/daaw/ov8;

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/qv8;

    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/qv8;

    invoke-virtual {v0, v2, v3, v1}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object v0

    sget-object v1, Lcom/daaw/pv8;->p:Lcom/daaw/pv8;

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qv8;

    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/qv8;

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/n17;->a()I

    move-result p1

    return p1
.end method
