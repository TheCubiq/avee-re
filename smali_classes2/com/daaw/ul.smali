.class public final enum Lcom/daaw/ul;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/ul;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/ul;

.field public static final enum q:Lcom/daaw/ul;

.field public static final enum r:Lcom/daaw/ul;

.field public static final synthetic s:[Lcom/daaw/ul;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/ul;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/ul;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/ul;->p:Lcom/daaw/ul;

    new-instance v0, Lcom/daaw/ul;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/daaw/ul;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/ul;->q:Lcom/daaw/ul;

    new-instance v0, Lcom/daaw/ul;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/daaw/ul;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/ul;->r:Lcom/daaw/ul;

    invoke-static {}, Lcom/daaw/ul;->a()[Lcom/daaw/ul;

    move-result-object v0

    sput-object v0, Lcom/daaw/ul;->s:[Lcom/daaw/ul;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lcom/daaw/ul;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/daaw/ul;

    sget-object v1, Lcom/daaw/ul;->p:Lcom/daaw/ul;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/daaw/ul;->q:Lcom/daaw/ul;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/daaw/ul;->r:Lcom/daaw/ul;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/ul;
    .locals 1

    const-class v0, Lcom/daaw/ul;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/ul;

    return-object p0
.end method

.method public static values()[Lcom/daaw/ul;
    .locals 1

    sget-object v0, Lcom/daaw/ul;->s:[Lcom/daaw/ul;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/ul;

    return-object v0
.end method
