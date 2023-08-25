.class public final enum Lcom/daaw/kx1$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/kx1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/kx1$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/kx1$b;

.field public static final enum q:Lcom/daaw/kx1$b;

.field public static final enum r:Lcom/daaw/kx1$b;

.field public static final enum s:Lcom/daaw/kx1$b;

.field public static final synthetic t:[Lcom/daaw/kx1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/daaw/kx1$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/kx1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/kx1$b;->p:Lcom/daaw/kx1$b;

    new-instance v1, Lcom/daaw/kx1$b;

    const-string v3, "START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/kx1$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/kx1$b;->q:Lcom/daaw/kx1$b;

    new-instance v3, Lcom/daaw/kx1$b;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/kx1$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/kx1$b;->r:Lcom/daaw/kx1$b;

    new-instance v5, Lcom/daaw/kx1$b;

    const-string v7, "CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/kx1$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/kx1$b;->s:Lcom/daaw/kx1$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/daaw/kx1$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/daaw/kx1$b;->t:[Lcom/daaw/kx1$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/kx1$b;
    .locals 1

    const-class v0, Lcom/daaw/kx1$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/kx1$b;

    return-object p0
.end method

.method public static values()[Lcom/daaw/kx1$b;
    .locals 1

    sget-object v0, Lcom/daaw/kx1$b;->t:[Lcom/daaw/kx1$b;

    invoke-virtual {v0}, [Lcom/daaw/kx1$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/kx1$b;

    return-object v0
.end method
