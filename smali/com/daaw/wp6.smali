.class public final enum Lcom/daaw/wp6;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum q:Lcom/daaw/wp6;

.field public static final enum r:Lcom/daaw/wp6;

.field public static final enum s:Lcom/daaw/wp6;

.field public static final synthetic t:[Lcom/daaw/wp6;


# instance fields
.field public final p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/daaw/wp6;

    const-string v1, "HTML"

    const/4 v2, 0x0

    const-string v3, "html"

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/wp6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/wp6;->q:Lcom/daaw/wp6;

    new-instance v1, Lcom/daaw/wp6;

    const-string v3, "NATIVE"

    const/4 v4, 0x1

    const-string v5, "native"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/wp6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/daaw/wp6;->r:Lcom/daaw/wp6;

    new-instance v3, Lcom/daaw/wp6;

    const-string v5, "JAVASCRIPT"

    const/4 v6, 0x2

    const-string v7, "javascript"

    invoke-direct {v3, v5, v6, v7}, Lcom/daaw/wp6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/daaw/wp6;->s:Lcom/daaw/wp6;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/wp6;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/wp6;->t:[Lcom/daaw/wp6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/daaw/wp6;->p:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/daaw/wp6;
    .locals 1

    sget-object v0, Lcom/daaw/wp6;->t:[Lcom/daaw/wp6;

    invoke-virtual {v0}, [Lcom/daaw/wp6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wp6;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wp6;->p:Ljava/lang/String;

    return-object v0
.end method
