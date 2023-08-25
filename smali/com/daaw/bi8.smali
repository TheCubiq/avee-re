.class public final Lcom/daaw/bi8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/bi8;

.field public static final d:Lcom/daaw/bi8;

.field public static final e:Lcom/daaw/b27;


# instance fields
.field public final a:[I

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/bi8;

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x2

    aput v3, v1, v2

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/daaw/bi8;-><init>([II)V

    sput-object v0, Lcom/daaw/bi8;->c:Lcom/daaw/bi8;

    new-instance v0, Lcom/daaw/bi8;

    const/4 v1, 0x3

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-direct {v0, v1, v2}, Lcom/daaw/bi8;-><init>([II)V

    sput-object v0, Lcom/daaw/bi8;->d:Lcom/daaw/bi8;

    new-instance v0, Lcom/daaw/a27;

    invoke-direct {v0}, Lcom/daaw/a27;-><init>()V

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    invoke-virtual {v0, v1, v1}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    invoke-virtual {v0}, Lcom/daaw/a27;->c()Lcom/daaw/b27;

    move-result-object v0

    sput-object v0, Lcom/daaw/bi8;->e:Lcom/daaw/b27;

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x5
        0x6
    .end array-data
.end method

.method public constructor <init>([II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/bi8;->a:[I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    const/16 p1, 0x8

    iput p1, p0, Lcom/daaw/bi8;->b:I

    return-void
.end method

.method public static bridge synthetic b()Lcom/daaw/b27;
    .locals 1

    sget-object v0, Lcom/daaw/bi8;->e:Lcom/daaw/b27;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/daaw/f92;)Landroid/util/Pair;
    .locals 9

    iget-object v0, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lcom/daaw/f92;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/ak3;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    sget-object v1, Lcom/daaw/bi8;->e:Lcom/daaw/b27;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/b27;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    const/4 v2, 0x7

    const/4 v4, 0x6

    const/16 v5, 0x8

    const/16 v6, 0x12

    if-ne v0, v6, :cond_2

    invoke-virtual {p0, v6}, Lcom/daaw/bi8;->c(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x6

    goto :goto_0

    :cond_1
    const/16 v0, 0x12

    :cond_2
    if-ne v0, v5, :cond_3

    invoke-virtual {p0, v5}, Lcom/daaw/bi8;->c(I)Z

    move-result v7

    if-nez v7, :cond_3

    const/4 v0, 0x7

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/bi8;->c(I)Z

    move-result v7

    if-nez v7, :cond_4

    return-object v3

    :cond_4
    iget v7, p1, Lcom/daaw/f92;->y:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_6

    if-ne v0, v6, :cond_5

    goto :goto_1

    :cond_5
    if-le v7, v5, :cond_9

    return-object v3

    :cond_6
    :goto_1
    iget p1, p1, Lcom/daaw/f92;->z:I

    if-ne p1, v8, :cond_7

    const p1, 0xbb80

    :cond_7
    sget v6, Lcom/daaw/it5;->a:I

    const/16 v7, 0x1d

    if-lt v6, v7, :cond_8

    invoke-static {v0, p1}, Lcom/daaw/zh8;->a(II)I

    move-result v7

    goto :goto_2

    :cond_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, p1, v6}, Lcom/daaw/b27;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_9
    :goto_2
    sget p1, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1c

    if-gt p1, v1, :cond_b

    if-ne v7, v2, :cond_a

    const/16 v4, 0x8

    goto :goto_3

    :cond_a
    const/4 v1, 0x3

    if-eq v7, v1, :cond_c

    const/4 v1, 0x4

    if-eq v7, v1, :cond_c

    const/4 v1, 0x5

    if-ne v7, v1, :cond_b

    goto :goto_3

    :cond_b
    move v4, v7

    :cond_c
    :goto_3
    const/16 v1, 0x1a

    if-gt p1, v1, :cond_d

    sget-object p1, Lcom/daaw/it5;->b:Ljava/lang/String;

    const-string v1, "fugu"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    if-ne v4, p1, :cond_d

    const/4 v4, 0x2

    :cond_d
    invoke-static {v4}, Lcom/daaw/it5;->T(I)I

    move-result p1

    if-nez p1, :cond_e

    return-object v3

    :cond_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final c(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bi8;->a:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/bi8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/daaw/bi8;

    iget-object v1, p0, Lcom/daaw/bi8;->a:[I

    iget-object p1, p1, Lcom/daaw/bi8;->a:[I

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/bi8;->a:[I

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/bi8;->a:[I

    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudioCapabilities[maxChannelCount=8, supportedEncodings="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
