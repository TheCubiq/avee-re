.class public final Lcom/daaw/ys6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zs6;


# static fields
.field public static final a:Lcom/daaw/fj2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/daaw/fj2;->l0()Lcom/daaw/hi2;

    move-result-object v0

    const-string v1, "E"

    invoke-virtual {v0, v1}, Lcom/daaw/hi2;->v0(Ljava/lang/String;)Lcom/daaw/hi2;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/fj2;

    sput-object v0, Lcom/daaw/ys6;->a:Lcom/daaw/fj2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/fj2;
    .locals 1

    sget-object v0, Lcom/daaw/ys6;->a:Lcom/daaw/fj2;

    return-object v0
.end method
