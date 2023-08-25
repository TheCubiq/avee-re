.class public final enum Lcom/daaw/mm7;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/daaw/ns7;


# static fields
.field public static final enum q:Lcom/daaw/mm7;

.field public static final enum r:Lcom/daaw/mm7;

.field public static final enum s:Lcom/daaw/mm7;

.field public static final enum t:Lcom/daaw/mm7;

.field public static final enum u:Lcom/daaw/mm7;

.field public static final enum v:Lcom/daaw/mm7;

.field public static final w:Lcom/daaw/os7;

.field public static final synthetic x:[Lcom/daaw/mm7;


# instance fields
.field public final p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/daaw/mm7;

    const-string v1, "UNKNOWN_KEYMATERIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/daaw/mm7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/daaw/mm7;->q:Lcom/daaw/mm7;

    new-instance v1, Lcom/daaw/mm7;

    const-string v3, "SYMMETRIC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/daaw/mm7;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/daaw/mm7;->r:Lcom/daaw/mm7;

    new-instance v3, Lcom/daaw/mm7;

    const-string v5, "ASYMMETRIC_PRIVATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/daaw/mm7;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/daaw/mm7;->s:Lcom/daaw/mm7;

    new-instance v5, Lcom/daaw/mm7;

    const-string v7, "ASYMMETRIC_PUBLIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/daaw/mm7;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/daaw/mm7;->t:Lcom/daaw/mm7;

    new-instance v7, Lcom/daaw/mm7;

    const-string v9, "REMOTE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/daaw/mm7;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/daaw/mm7;->u:Lcom/daaw/mm7;

    new-instance v9, Lcom/daaw/mm7;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lcom/daaw/mm7;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/daaw/mm7;->v:Lcom/daaw/mm7;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/daaw/mm7;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lcom/daaw/mm7;->x:[Lcom/daaw/mm7;

    new-instance v0, Lcom/daaw/lm7;

    invoke-direct {v0}, Lcom/daaw/lm7;-><init>()V

    sput-object v0, Lcom/daaw/mm7;->w:Lcom/daaw/os7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/daaw/mm7;->p:I

    return-void
.end method

.method public static a(I)Lcom/daaw/mm7;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/daaw/mm7;->u:Lcom/daaw/mm7;

    return-object p0

    :cond_1
    sget-object p0, Lcom/daaw/mm7;->t:Lcom/daaw/mm7;

    return-object p0

    :cond_2
    sget-object p0, Lcom/daaw/mm7;->s:Lcom/daaw/mm7;

    return-object p0

    :cond_3
    sget-object p0, Lcom/daaw/mm7;->r:Lcom/daaw/mm7;

    return-object p0

    :cond_4
    sget-object p0, Lcom/daaw/mm7;->q:Lcom/daaw/mm7;

    return-object p0
.end method

.method public static values()[Lcom/daaw/mm7;
    .locals 1

    sget-object v0, Lcom/daaw/mm7;->x:[Lcom/daaw/mm7;

    invoke-virtual {v0}, [Lcom/daaw/mm7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/mm7;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/mm7;->zza()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    sget-object v0, Lcom/daaw/mm7;->v:Lcom/daaw/mm7;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/daaw/mm7;->p:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
