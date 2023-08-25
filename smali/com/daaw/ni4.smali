.class public final Lcom/daaw/ni4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/ni4;

.field public static final c:Lcom/daaw/th8;


# instance fields
.field public final a:Lcom/daaw/y17;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ni4;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/ni4;-><init>(Ljava/util/List;)V

    sput-object v0, Lcom/daaw/ni4;->b:Lcom/daaw/ni4;

    sget-object v0, Lcom/daaw/ff4;->a:Lcom/daaw/ff4;

    sput-object v0, Lcom/daaw/ni4;->c:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/y17;->s(Ljava/util/Collection;)Lcom/daaw/y17;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/y17;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    return-object v0
.end method

.method public final b(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/kh4;

    invoke-virtual {v2}, Lcom/daaw/kh4;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/daaw/kh4;->a()I

    move-result v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lcom/daaw/ni4;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/ni4;

    iget-object v0, p0, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    iget-object p1, p1, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    invoke-virtual {v0, p1}, Lcom/daaw/y17;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ni4;->a:Lcom/daaw/y17;

    invoke-virtual {v0}, Lcom/daaw/y17;->hashCode()I

    move-result v0

    return v0
.end method
