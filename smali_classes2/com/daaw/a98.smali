.class public final Lcom/daaw/a98;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/a98;


# instance fields
.field public final a:Lcom/daaw/gg8;

.field public b:Z

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/a98;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/a98;-><init>(Z)V

    sput-object v0, Lcom/daaw/a98;->d:Lcom/daaw/a98;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/mf8;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/daaw/mf8;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    new-instance p1, Lcom/daaw/mf8;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/daaw/mf8;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {p0}, Lcom/daaw/a98;->b()V

    invoke-virtual {p0}, Lcom/daaw/a98;->b()V

    return-void
.end method

.method public static a()Lcom/daaw/a98;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public static final d(Lcom/daaw/x88;Ljava/lang/Object;)V
    .locals 4

    invoke-interface {p0}, Lcom/daaw/x88;->zzb()Lcom/daaw/gi8;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/gb8;->e(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/daaw/gi8;->q:Lcom/daaw/gi8;

    sget-object v1, Lcom/daaw/ii8;->q:Lcom/daaw/ii8;

    invoke-virtual {v0}, Lcom/daaw/gi8;->a()Lcom/daaw/ii8;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    instance-of v0, p1, Lcom/daaw/zd8;

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_2
    instance-of v0, p1, Lcom/daaw/y68;

    if-nez v0, :cond_0

    instance-of v0, p1, [B

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_3
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_0

    :pswitch_5
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_0

    :pswitch_6
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_0

    :pswitch_7
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_0

    :pswitch_8
    instance-of v0, p1, Ljava/lang/Integer;

    :goto_0
    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    :goto_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p0}, Lcom/daaw/x88;->zza()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-interface {p0}, Lcom/daaw/x88;->zzb()Lcom/daaw/gi8;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/gi8;->a()Lcom/daaw/ii8;

    move-result-object p0

    aput-object p0, v1, v2

    const/4 p0, 0x2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, p0

    const-string p0, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/a98;->b:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v1}, Lcom/daaw/gg8;->b()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v1, v0}, Lcom/daaw/gg8;->g(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/daaw/ja8;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ja8;

    invoke-virtual {v1}, Lcom/daaw/ja8;->t()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v0}, Lcom/daaw/gg8;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a98;->b:Z

    :cond_2
    return-void
.end method

.method public final c(Lcom/daaw/x88;Ljava/lang/Object;)V
    .locals 3

    invoke-interface {p1}, Lcom/daaw/x88;->zzc()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/daaw/a98;->d(Lcom/daaw/x88;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1, p2}, Lcom/daaw/a98;->d(Lcom/daaw/x88;Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/gg8;->e(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/daaw/a98;

    invoke-direct {v0}, Lcom/daaw/a98;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v2}, Lcom/daaw/gg8;->b()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v2, v1}, Lcom/daaw/gg8;->g(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/x88;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/daaw/a98;->c(Lcom/daaw/x88;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v1}, Lcom/daaw/gg8;->c()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/x88;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/daaw/a98;->c(Lcom/daaw/x88;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/daaw/a98;->c:Z

    iput-boolean v1, v0, Lcom/daaw/a98;->c:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/daaw/a98;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/daaw/a98;

    iget-object v0, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    iget-object p1, p1, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v0, p1}, Lcom/daaw/gg8;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/a98;->a:Lcom/daaw/gg8;

    invoke-virtual {v0}, Lcom/daaw/gg8;->hashCode()I

    move-result v0

    return v0
.end method
