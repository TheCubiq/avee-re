.class public final synthetic Lcom/daaw/o09;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q09;


# static fields
.field public static final synthetic b:Lcom/daaw/o09;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/o09;

    invoke-direct {v0}, Lcom/daaw/o09;-><init>()V

    sput-object v0, Lcom/daaw/o09;->b:Lcom/daaw/o09;

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
    .locals 1

    sget v0, Lcom/daaw/p09;->a:I

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/daaw/j09;

    return-object v0
.end method
