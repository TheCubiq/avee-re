.class public final synthetic Lcom/daaw/nw4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b35;


# static fields
.field public static final synthetic a:Lcom/daaw/nw4;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nw4;

    invoke-direct {v0}, Lcom/daaw/nw4;-><init>()V

    sput-object v0, Lcom/daaw/nw4;->a:Lcom/daaw/nw4;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lcom/daaw/m75;->c:Lcom/daaw/j65;

    invoke-static {}, Lcom/daaw/yi8;->K()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
