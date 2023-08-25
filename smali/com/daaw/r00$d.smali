.class public enum Lcom/daaw/r00$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/r00$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/r00$d;

.field public static final enum q:Lcom/daaw/r00$d;

.field public static final enum r:Lcom/daaw/r00$d;

.field public static final synthetic s:[Lcom/daaw/r00$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/daaw/r00$d;

    const-string v1, "IGNORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/r00$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/r00$d;->p:Lcom/daaw/r00$d;

    new-instance v1, Lcom/daaw/r00$d$a;

    const-string v3, "LOG"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/r00$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/r00$d;->q:Lcom/daaw/r00$d;

    new-instance v3, Lcom/daaw/r00$d$b;

    const-string v5, "THROW"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/r00$d$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/r00$d;->r:Lcom/daaw/r00$d;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/r00$d;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/r00$d;->s:[Lcom/daaw/r00$d;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/daaw/r00$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/r00$d;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/r00$d;
    .locals 1

    const-class v0, Lcom/daaw/r00$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/r00$d;

    return-object p0
.end method

.method public static values()[Lcom/daaw/r00$d;
    .locals 1

    sget-object v0, Lcom/daaw/r00$d;->s:[Lcom/daaw/r00$d;

    invoke-virtual {v0}, [Lcom/daaw/r00$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/r00$d;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
