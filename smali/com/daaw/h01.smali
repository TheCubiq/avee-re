.class public final enum Lcom/daaw/h01;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/h01;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum q:Lcom/daaw/h01;

.field public static final enum r:Lcom/daaw/h01;

.field public static final enum s:Lcom/daaw/h01;

.field public static final enum t:Lcom/daaw/h01;

.field public static final enum u:Lcom/daaw/h01;

.field public static final enum v:Lcom/daaw/h01;

.field public static final w:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/h01;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic x:[Lcom/daaw/h01;


# instance fields
.field public final p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/daaw/h01;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/daaw/h01;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/daaw/h01;->q:Lcom/daaw/h01;

    new-instance v1, Lcom/daaw/h01;

    const-string v3, "UNMETERED_ONLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/daaw/h01;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/daaw/h01;->r:Lcom/daaw/h01;

    new-instance v3, Lcom/daaw/h01;

    const-string v5, "UNMETERED_OR_DAILY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/daaw/h01;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/daaw/h01;->s:Lcom/daaw/h01;

    new-instance v5, Lcom/daaw/h01;

    const-string v7, "FAST_IF_RADIO_AWAKE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/daaw/h01;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/daaw/h01;->t:Lcom/daaw/h01;

    new-instance v7, Lcom/daaw/h01;

    const-string v9, "NEVER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/daaw/h01;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/daaw/h01;->u:Lcom/daaw/h01;

    new-instance v9, Lcom/daaw/h01;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lcom/daaw/h01;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/daaw/h01;->v:Lcom/daaw/h01;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/daaw/h01;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lcom/daaw/h01;->x:[Lcom/daaw/h01;

    new-instance v11, Landroid/util/SparseArray;

    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    sput-object v11, Lcom/daaw/h01;->w:Landroid/util/SparseArray;

    invoke-virtual {v11, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v6, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v8, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v10, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v13, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/daaw/h01;->p:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/h01;
    .locals 1

    const-class v0, Lcom/daaw/h01;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/h01;

    return-object p0
.end method

.method public static values()[Lcom/daaw/h01;
    .locals 1

    sget-object v0, Lcom/daaw/h01;->x:[Lcom/daaw/h01;

    invoke-virtual {v0}, [Lcom/daaw/h01;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/h01;

    return-object v0
.end method
