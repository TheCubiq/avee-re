.class public final enum Lcom/daaw/wt;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/wt;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum r:Lcom/daaw/wt;

.field public static final enum s:Lcom/daaw/wt;

.field public static final enum t:Lcom/daaw/wt;

.field public static final enum u:Lcom/daaw/wt;

.field public static final synthetic v:[Lcom/daaw/wt;


# instance fields
.field public final p:Z

.field public final q:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/daaw/wt;

    const-string v1, "ALL"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/daaw/wt;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lcom/daaw/wt;->r:Lcom/daaw/wt;

    new-instance v1, Lcom/daaw/wt;

    const-string v4, "NONE"

    invoke-direct {v1, v4, v3, v2, v2}, Lcom/daaw/wt;-><init>(Ljava/lang/String;IZZ)V

    sput-object v1, Lcom/daaw/wt;->s:Lcom/daaw/wt;

    new-instance v4, Lcom/daaw/wt;

    const-string v5, "SOURCE"

    const/4 v6, 0x2

    invoke-direct {v4, v5, v6, v3, v2}, Lcom/daaw/wt;-><init>(Ljava/lang/String;IZZ)V

    sput-object v4, Lcom/daaw/wt;->t:Lcom/daaw/wt;

    new-instance v5, Lcom/daaw/wt;

    const-string v7, "RESULT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v2, v3}, Lcom/daaw/wt;-><init>(Ljava/lang/String;IZZ)V

    sput-object v5, Lcom/daaw/wt;->u:Lcom/daaw/wt;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/daaw/wt;

    aput-object v0, v7, v2

    aput-object v1, v7, v3

    aput-object v4, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/daaw/wt;->v:[Lcom/daaw/wt;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/daaw/wt;->p:Z

    iput-boolean p4, p0, Lcom/daaw/wt;->q:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/wt;
    .locals 1

    const-class v0, Lcom/daaw/wt;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/wt;

    return-object p0
.end method

.method public static values()[Lcom/daaw/wt;
    .locals 1

    sget-object v0, Lcom/daaw/wt;->v:[Lcom/daaw/wt;

    invoke-virtual {v0}, [Lcom/daaw/wt;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wt;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wt;->q:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wt;->p:Z

    return v0
.end method
