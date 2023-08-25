.class public final enum Lcom/daaw/pq5;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum q:Lcom/daaw/pq5;

.field public static final enum r:Lcom/daaw/pq5;

.field public static final enum s:Lcom/daaw/pq5;

.field public static final enum t:Lcom/daaw/pq5;

.field public static final synthetic u:[Lcom/daaw/pq5;


# instance fields
.field public final p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/daaw/pq5;

    const-string v1, "BEGIN_TO_RENDER"

    const/4 v2, 0x0

    const-string v3, "beginToRender"

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/pq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/pq5;->q:Lcom/daaw/pq5;

    new-instance v1, Lcom/daaw/pq5;

    const-string v3, "DEFINED_BY_JAVASCRIPT"

    const/4 v4, 0x1

    const-string v5, "definedByJavascript"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/pq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/daaw/pq5;->r:Lcom/daaw/pq5;

    new-instance v3, Lcom/daaw/pq5;

    const-string v5, "ONE_PIXEL"

    const/4 v6, 0x2

    const-string v7, "onePixel"

    invoke-direct {v3, v5, v6, v7}, Lcom/daaw/pq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/daaw/pq5;->s:Lcom/daaw/pq5;

    new-instance v5, Lcom/daaw/pq5;

    const-string v7, "UNSPECIFIED"

    const/4 v8, 0x3

    const-string v9, "unspecified"

    invoke-direct {v5, v7, v8, v9}, Lcom/daaw/pq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/daaw/pq5;->t:Lcom/daaw/pq5;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/daaw/pq5;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/daaw/pq5;->u:[Lcom/daaw/pq5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/daaw/pq5;->p:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/daaw/pq5;
    .locals 1

    sget-object v0, Lcom/daaw/pq5;->u:[Lcom/daaw/pq5;

    invoke-virtual {v0}, [Lcom/daaw/pq5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/pq5;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pq5;->p:Ljava/lang/String;

    return-object v0
.end method
