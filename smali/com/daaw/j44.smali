.class public final synthetic Lcom/daaw/j44;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ps2;


# static fields
.field public static final synthetic a:Lcom/daaw/j44;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/j44;

    invoke-direct {v0}, Lcom/daaw/j44;-><init>()V

    sput-object v0, Lcom/daaw/j44;->a:Lcom/daaw/j44;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()[Lcom/daaw/ns2;
    .locals 4

    sget v0, Lcom/daaw/l44;->L:I

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/daaw/ns2;

    new-instance v1, Lcom/daaw/du2;

    invoke-direct {v1}, Lcom/daaw/du2;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/ft2;

    invoke-direct {v1, v2}, Lcom/daaw/ft2;-><init>(I)V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/zt2;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Lcom/daaw/zt2;-><init>(ILcom/daaw/mz2;Lcom/daaw/fu2;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method
