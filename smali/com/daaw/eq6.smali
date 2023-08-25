.class public final enum Lcom/daaw/eq6;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum q:Lcom/daaw/eq6;

.field public static final enum r:Lcom/daaw/eq6;

.field public static final enum s:Lcom/daaw/eq6;

.field public static final synthetic t:[Lcom/daaw/eq6;


# instance fields
.field public final p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/daaw/eq6;

    const-string v1, "NATIVE"

    const/4 v2, 0x0

    const-string v3, "native"

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/eq6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/eq6;->q:Lcom/daaw/eq6;

    new-instance v1, Lcom/daaw/eq6;

    const-string v3, "JAVASCRIPT"

    const/4 v4, 0x1

    const-string v5, "javascript"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/eq6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/daaw/eq6;->r:Lcom/daaw/eq6;

    new-instance v3, Lcom/daaw/eq6;

    const-string v5, "NONE"

    const/4 v6, 0x2

    const-string v7, "none"

    invoke-direct {v3, v5, v6, v7}, Lcom/daaw/eq6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/daaw/eq6;->s:Lcom/daaw/eq6;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/eq6;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/eq6;->t:[Lcom/daaw/eq6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/daaw/eq6;->p:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/daaw/eq6;
    .locals 1

    sget-object v0, Lcom/daaw/eq6;->t:[Lcom/daaw/eq6;

    invoke-virtual {v0}, [Lcom/daaw/eq6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/eq6;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq6;->p:Ljava/lang/String;

    return-object v0
.end method
