.class public final enum Lcom/daaw/oq5;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum q:Lcom/daaw/oq5;

.field public static final enum r:Lcom/daaw/oq5;

.field public static final enum s:Lcom/daaw/oq5;

.field public static final synthetic t:[Lcom/daaw/oq5;


# instance fields
.field public final p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/daaw/oq5;

    const-string v1, "HTML_DISPLAY"

    const/4 v2, 0x0

    const-string v3, "htmlDisplay"

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/oq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/oq5;->q:Lcom/daaw/oq5;

    new-instance v1, Lcom/daaw/oq5;

    const-string v3, "NATIVE_DISPLAY"

    const/4 v4, 0x1

    const-string v5, "nativeDisplay"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/oq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/daaw/oq5;->r:Lcom/daaw/oq5;

    new-instance v3, Lcom/daaw/oq5;

    const-string v5, "VIDEO"

    const/4 v6, 0x2

    const-string v7, "video"

    invoke-direct {v3, v5, v6, v7}, Lcom/daaw/oq5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/daaw/oq5;->s:Lcom/daaw/oq5;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/oq5;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/oq5;->t:[Lcom/daaw/oq5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/daaw/oq5;->p:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/daaw/oq5;
    .locals 1

    sget-object v0, Lcom/daaw/oq5;->t:[Lcom/daaw/oq5;

    invoke-virtual {v0}, [Lcom/daaw/oq5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/oq5;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oq5;->p:Ljava/lang/String;

    return-object v0
.end method
