.class public final synthetic Lcom/daaw/r52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q09;


# static fields
.field public static final synthetic b:Lcom/daaw/r52;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/r52;

    invoke-direct {v0}, Lcom/daaw/r52;-><init>()V

    sput-object v0, Lcom/daaw/r52;->b:Lcom/daaw/r52;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/net/Uri;Ljava/util/Map;)[Lcom/daaw/j09;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/p09;->a(Lcom/daaw/q09;Landroid/net/Uri;Ljava/util/Map;)[Lcom/daaw/j09;

    move-result-object p1

    return-object p1
.end method

.method public final zza()[Lcom/daaw/j09;
    .locals 3

    sget-object v0, Lcom/daaw/s52;->n:Lcom/daaw/q09;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/j09;

    new-instance v1, Lcom/daaw/s52;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/daaw/s52;-><init>(I)V

    aput-object v1, v0, v2

    return-object v0
.end method
