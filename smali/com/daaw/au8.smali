.class public final Lcom/daaw/au8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/au8;

.field public static final e:Lcom/daaw/th8;


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/y17;

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/au8;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/daaw/r84;

    invoke-direct {v0, v1}, Lcom/daaw/au8;-><init>([Lcom/daaw/r84;)V

    sput-object v0, Lcom/daaw/au8;->d:Lcom/daaw/au8;

    sget-object v0, Lcom/daaw/zt8;->a:Lcom/daaw/zt8;

    sput-object v0, Lcom/daaw/au8;->e:Lcom/daaw/th8;

    return-void
.end method

.method public varargs constructor <init>([Lcom/daaw/r84;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/y17;->t([Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    array-length p1, p1

    iput p1, p0, Lcom/daaw/au8;->a:I

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    add-int/lit8 v0, p1, 0x1

    move v1, v0

    :goto_1
    iget-object v2, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/r84;

    iget-object v3, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/r84;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v3, "TrackGroupArray"

    const-string v4, ""

    invoke-static {v3, v4, v2}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    move p1, v0

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/r84;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-virtual {v0, p1}, Lcom/daaw/y17;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final b(I)Lcom/daaw/r84;
    .locals 1

    iget-object v0, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/r84;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lcom/daaw/au8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/au8;

    iget v2, p0, Lcom/daaw/au8;->a:I

    iget v3, p1, Lcom/daaw/au8;->a:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    iget-object p1, p1, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-virtual {v2, p1}, Lcom/daaw/y17;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/daaw/au8;->c:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/au8;->b:Lcom/daaw/y17;

    invoke-virtual {v0}, Lcom/daaw/y17;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/daaw/au8;->c:I

    :cond_0
    return v0
.end method
